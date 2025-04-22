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
    int shmid = shmget(key, sizeof(int), 0666);
    if (shmid == -1) {
        perror("shmget failed");
        exit(EXIT_FAILURE);
    }
    int* shared_data = (int*)shmat(shmid, NULL, 0);
    if (shared_data == (void*)-1) {
        perror("shmat failed");
        exit(EXIT_FAILURE);
    }
    printf("shmreader: Value read from shared memory: %d\n", *shared_data);
    *shared_data = 600;
    printf("shmreader: Updated value in shared memory to: %d\n", *shared_data);
    shmdt(shared_data);
    return 0;
}