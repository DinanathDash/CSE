#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#define LIMIT 10
sem_t sem_countdown;
sem_t sem_countup;
void* countdown(void* arg) {
    for (int i = LIMIT; i >= 1; i--) {
        sem_wait(&sem_countdown);
        printf("Countdown: %d\n", i);
        sem_post(&sem_countup);
    }
    return NULL;
}
void* countup(void* arg) {
    for (int i = 1; i <= LIMIT; i++) {
        sem_wait(&sem_countup);
        printf("Countup: %d\n", i);
        sem_post(&sem_countdown);
    }
    return NULL;
}
int main() {
    pthread_t thread_countdown, thread_countup;
    sem_init(&sem_countdown, 0, 1);
    sem_init(&sem_countup, 0, 0);
    pthread_create(&thread_countdown, NULL, countdown, NULL);
    pthread_create(&thread_countup, NULL, countup, NULL);
    pthread_join(thread_countdown, NULL);
    pthread_join(thread_countup, NULL);
    sem_destroy(&sem_countdown);
    sem_destroy(&sem_countup);
    return 0;
}
