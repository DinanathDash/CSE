#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#define LIMIT 20
sem_t sem_A, sem_B, sem_C;
void* print_A(void* arg) {
    for (int i = 1; i <= LIMIT; i += 3) {
        sem_wait(&sem_A);
        printf("A%d\n", i);
        sem_post(&sem_B);
    }
    return NULL;
}
void* print_B(void* arg) {
    for (int i = 2; i <= LIMIT; i += 3) {
        sem_wait(&sem_B);
        printf("B%d\n", i);
        sem_post(&sem_C);
    }
    return NULL;
}
void* print_C(void* arg) {
    for (int i = 3; i <= LIMIT; i += 3) {
        sem_wait(&sem_C);
        printf("C%d\n", i);
        sem_post(&sem_A);
    }
    return NULL;
}
int main() {
    pthread_t thread_A, thread_B, thread_C;
    sem_init(&sem_A, 0, 1);
    sem_init(&sem_B, 0, 0);
    sem_init(&sem_C, 0, 0);
    pthread_create(&thread_A, NULL, print_A, NULL);
    pthread_create(&thread_B, NULL, print_B, NULL);
    pthread_create(&thread_C, NULL, print_C, NULL);
    pthread_join(thread_A, NULL);
    pthread_join(thread_B, NULL);
    pthread_join(thread_C, NULL);
    sem_destroy(&sem_A);
    sem_destroy(&sem_B);
    sem_destroy(&sem_C);
    return 0;
}
