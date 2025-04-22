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
    int* shared_data = (int*)shmat(shmid, NULL, 0);
    if (shared_data == (void*)-1) {
        perror("shmat failed");
        exit(EXIT_FAILURE);
    }
    *shared_data = 500;
    printf("shmwriter: Initial value written to shared memory: %d\n", *shared_data);
    printf("shmwriter: Waiting for shmreader to update the value...\n");
    sleep(5);
    printf("shmwriter: Updated value read from shared memory: %d\n", *shared_data);
    shmdt(shared_data);
    if (shmctl(shmid, IPC_RMID, NULL) == -1) {
        perror("shmctl failed to remove shared memory");
        exit(EXIT_FAILURE);
    }
    printf("shmwriter: Shared memory removed.\n");
    return 0;
}