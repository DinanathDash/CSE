#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
#include <semaphore.h>
#define NUM_CHAIRS 3
#define NUM_CUSTOMERS 10
sem_t waiting_customers;
sem_t barber_ready;
pthread_mutex_t mutex;
int free_chairs = NUM_CHAIRS;
void* barber(void* arg) {
    while (1) {
        sem_wait(&waiting_customers);
        pthread_mutex_lock(&mutex);
        free_chairs++;
        pthread_mutex_unlock(&mutex);
        sem_post(&barber_ready);
        printf("Barber: Cutting hair...\n");
        sleep(2);
        printf("Barber: Finished cutting hair.\n");
    }
    return NULL;
}
void* customer(void* arg) {
    int id = *(int*)arg;
    pthread_mutex_lock(&mutex);
    if (free_chairs > 0) {
        free_chairs--;
        printf("Customer %d: Sitting in a waiting chair. Free chairs: %d\n", id, free_chairs);
        pthread_mutex_unlock(&mutex);

        sem_post(&waiting_customers);
        sem_wait(&barber_ready);
        printf("Customer %d: Getting a haircut.\n", id);
    } else {
        pthread_mutex_unlock(&mutex);
        printf("Customer %d: No free chairs, leaving the shop.\n", id);
    }
    return NULL;
}
int main() {
    pthread_t barber_thread, customer_threads[NUM_CUSTOMERS];
    int customer_ids[NUM_CUSTOMERS];
    sem_init(&waiting_customers, 0, 0);
    sem_init(&barber_ready, 0, 0);
    pthread_mutex_init(&mutex, NULL);
    pthread_create(&barber_thread, NULL, barber, NULL);
    for (int i = 0; i < NUM_CUSTOMERS; i++) {
        customer_ids[i] = i + 1;
        pthread_create(&customer_threads[i], NULL, customer, &customer_ids[i]);
        sleep(1);
    }
    for (int i = 0; i < NUM_CUSTOMERS; i++) {
        pthread_join(customer_threads[i], NULL);
    }
    pthread_cancel(barber_thread);
    sem_destroy(&waiting_customers);
    sem_destroy(&barber_ready);
    pthread_mutex_destroy(&mutex);
    return 0;
}