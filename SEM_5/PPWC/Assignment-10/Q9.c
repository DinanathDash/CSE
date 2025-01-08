#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
#include <semaphore.h>
sem_t sem_agent;
sem_t sem_tobacco, sem_paper, sem_matches;
sem_t sem_smoker_done;
void* agent(void* arg);
void* smoker_tobacco(void* arg);
void* smoker_paper(void* arg);
void* smoker_matches(void* arg);
int main() {
    pthread_t agent_thread;
    pthread_t smoker_threads[3];
    sem_init(&sem_agent, 0, 1);
    sem_init(&sem_tobacco, 0, 0);
    sem_init(&sem_paper, 0, 0);
    sem_init(&sem_matches, 0, 0);
    sem_init(&sem_smoker_done, 0, 0); 
    pthread_create(&agent_thread, NULL, agent, NULL);
    pthread_create(&smoker_threads[0], NULL, smoker_tobacco, NULL);
    pthread_create(&smoker_threads[1], NULL, smoker_paper, NULL);
    pthread_create(&smoker_threads[2], NULL, smoker_matches, NULL);
    for (int i = 0; i < 3; i++) {
        pthread_join(smoker_threads[i], NULL);
    }
    sem_destroy(&sem_agent);
    sem_destroy(&sem_tobacco);
    sem_destroy(&sem_paper);
    sem_destroy(&sem_matches);
    sem_destroy(&sem_smoker_done);

    return 0;
}
void* agent(void* arg) {
    while (1) {
        sem_wait(&sem_agent);
        int choice = rand() % 3;
        if (choice == 0) {
            printf("Agent places paper and matches on the table.\n");
            sem_post(&sem_tobacco);
        } else if (choice == 1) {
            printf("Agent places tobacco and matches on the table.\n");
            sem_post(&sem_paper);
        } else {
            printf("Agent places tobacco and paper on the table.\n");
            sem_post(&sem_matches);
        }
        sem_wait(&sem_smoker_done);
    }
    return NULL;
}
void* smoker_tobacco(void* arg) {
    while (1) {
        sem_wait(&sem_tobacco);
        printf("Smoker with tobacco makes a cigarette and smokes it.\n");
        sleep(1);
        sem_post(&sem_agent);
        sem_post(&sem_smoker_done);
    }
    return NULL;
}
void* smoker_paper(void* arg) {
    while (1) {
        sem_wait(&sem_paper);
        printf("Smoker with paper makes a cigarette and smokes it.\n");
        sleep(1);
        sem_post(&sem_agent);
        sem_post(&sem_smoker_done);
    }
    return NULL;
}
void* smoker_matches(void* arg) {
    while (1) {
        sem_wait(&sem_matches);
        printf("Smoker with matches makes a cigarette and smokes it.\n");
        sleep(1);
        sem_post(&sem_agent);
        sem_post(&sem_smoker_done);
    }
    return NULL;
}