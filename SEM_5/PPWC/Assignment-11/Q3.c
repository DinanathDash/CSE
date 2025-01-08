#include <stdio.h>
#include <stdlib.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/types.h>
#include <unistd.h>
int main() {
    key_t key = ftok("shmfile", 65);
    if (key == -1) {
        perror("ftok failed");
        exit(EXIT_FAILURE);
    }
    int shmid = shmget(key, sizeof(int), 0666 | IPC_CREAT);
    if (shmid == -1) {
        perror("shmget failed");
        exit(EXIT_FAILURE);
    }
    pid_t pid = fork();

    if (pid < 0) {
        perror("fork failed");
        exit(EXIT_FAILURE);
    } else if (pid == 0) {
        int* shared_data = (int*)shmat(shmid, NULL, 0);
        if (shared_data == (void*)-1) {
            perror("shmat failed in child");
            exit(EXIT_FAILURE);
        }
        *shared_data = 42;
        printf("Child: Sent number to parent: %d\n", *shared_data);
        sleep(1);
        printf("Child: Received number from parent: %d\n", *shared_data);
        shmdt(shared_data);
    } else {
        int* shared_data = (int*)shmat(shmid, NULL, 0);
        if (shared_data == (void*)-1) {
            perror("shmat failed in parent");
            exit(EXIT_FAILURE);
        }
        sleep(1);
        printf("Parent: Received number from child: %d\n", *shared_data);
        *shared_data *= 2;
        printf("Parent: Sent doubled number to child: %d\n", *shared_data);
        shmdt(shared_data);
        wait(NULL);
        shmctl(shmid, IPC_RMID, NULL);
    }
    return 0;
}