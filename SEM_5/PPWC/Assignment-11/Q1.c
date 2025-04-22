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
    int shmid = shmget(key, 10, 0666 | IPC_CREAT);
    if (shmid == -1) {
        perror("shmget failed");
        exit(EXIT_FAILURE);
    }
    printf("Shared memory created with ID: %d\n", shmid);
    void* shmaddr1 = shmat(shmid, NULL, 0);
    void* shmaddr2 = shmat(shmid, NULL, 0);
    void* shmaddr3 = shmat(shmid, NULL, 0);
    void* shmaddr4 = shmat(shmid, NULL, 0);
    if (shmaddr1 == (void*)-1 || shmaddr2 == (void*)-1 || shmaddr3 == (void*)-1 || shmaddr4 == (void*)-1) {
        perror("shmat failed");
        exit(EXIT_FAILURE);
    }
    printf("Shared memory attached 4 times.\n");
    struct shmid_ds shminfo;
    if (shmctl(shmid, IPC_STAT, &shminfo) == -1) {
        perror("shmctl failed");
        exit(EXIT_FAILURE);
    }
    printf("Number of current attachments: %lu\n", shminfo.shm_nattch);
    shmdt(shmaddr1);
    shmdt(shmaddr2);
    shmdt(shmaddr3);
    shmdt(shmaddr4);
    if (shmctl(shmid, IPC_RMID, NULL) == -1) {
        perror("shmctl failed to remove shared memory");
        exit(EXIT_FAILURE);
    }
    printf("Shared memory removed.\n");
    return 0;
}