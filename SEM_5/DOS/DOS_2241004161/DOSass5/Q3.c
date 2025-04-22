#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#define LIMIT 20
sem_t sem_A;
sem_t sem_B;
void* print_A(void* arg) {
    for (int i = 0; i < LIMIT; i++) {
        sem_wait(&sem_A);
        printf("A");
        fflush(stdout);
        sem_post(&sem_B);
    }
    return NULL;
}
void* print_B(void* arg) {
    for (int i = 0; i < LIMIT; i++) {
        sem_wait(&sem_B);
        printf("B");
        fflush(stdout);
        sem_post(&sem_A);
    }
    return NULL;
}
int main() {
    pthread_t thread_A, thread_B;
    sem_init(&sem_A, 0, 1); sem_init(&sem_B, 0, 0);
    pthread_create(&thread_A, NULL, print_A, NULL);
    pthread_create(&thread_B, NULL, print_B, NULL);
    pthread_join(thread_A, NULL); pthread_join(thread_B, NULL);
    sem_destroy(&sem_A); sem_destroy(&sem_B);
    printf("\n");
    return 0;
}
