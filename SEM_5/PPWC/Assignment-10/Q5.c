#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
sem_t sem_X, sem_Y, sem_Z;
void* process1(void* arg) {
    for (int i = 0; i < 4; i++) {
        sem_wait(&sem_X);
        printf("X");
        printf("X");
        sem_post(&sem_Y);
    }
    return NULL;
}
void* process2(void* arg) {
    for (int i = 0; i < 4; i++) {
        sem_wait(&sem_Y);
        printf("Y");
        sem_post(&sem_Z);
    }
    return NULL;
}
void* process3(void* arg) {
    for (int i = 0; i < 4; i++) {
        sem_wait(&sem_Z);
        printf("Z");
        printf("Z");
        sem_post(&sem_X);
    }
    return NULL;
}
int main() {
    pthread_t t1, t2, t3;
    sem_init(&sem_X, 0, 1);
    sem_init(&sem_Y, 0, 0);
    sem_init(&sem_Z, 0, 0);
    pthread_create(&t1, NULL, process1, NULL);
    pthread_create(&t2, NULL, process2, NULL);
    pthread_create(&t3, NULL, process3, NULL);
    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    pthread_join(t3, NULL);
    sem_destroy(&sem_X);
    sem_destroy(&sem_Y);
    sem_destroy(&sem_Z);
    return 0;
}