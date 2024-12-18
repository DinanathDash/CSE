#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>
sem_t sync;
void *process1(void *arg) {
    printf("Process 1: Executing statement a.\n");
    sleep(1);
    sem_post(&sync);
    printf("Process 1: Signal sent.\n");
    return NULL;
}
void *process2(void *arg) {
    sem_wait(&sync);
    printf("Process 2: Executing statement b.\n");
    return NULL;
}
int main() {
    pthread_t t1, t2;
    if (sem_init(&sync, 0, 0) != 0) {
        perror("Semaphore initialization failed");
        exit(1);
    }
    if (pthread_create(&t1, NULL, process1, NULL) != 0) {
        perror("Failed to create thread for Process 1");
        exit(1);
    }
    if (pthread_create(&t2, NULL, process2, NULL) != 0) {
        perror("Failed to create thread for Process 2");
        exit(1);
    }
    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    sem_destroy(&sync);
    printf("Execution complete.\n");
    return 0;
}