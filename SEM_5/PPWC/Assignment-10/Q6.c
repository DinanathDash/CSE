#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <semaphore.h>
#include <sys/wait.h>
sem_t sem_P1, sem_P2, sem_P3, sem_P4, sem_P5;
void process1() {
    sem_wait(&sem_P1);
    fprintf(stderr, "WHO: ");
    sem_post(&sem_P2);
}
void process2() {
    sem_wait(&sem_P2);
    fprintf(stderr, "Coronavirus ");
    sem_post(&sem_P3);
}
void process3() {
    sem_wait(&sem_P3);
    fprintf(stderr, "disease ");
    sem_post(&sem_P4);
}
void process4() {
    sem_wait(&sem_P4);
    fprintf(stderr, "COVID-19 ");
    sem_post(&sem_P5);
}
void process5() {
    sem_wait(&sem_P5);
    fprintf(stderr, "pandemic.\n");
}
int main() {
    pid_t pid;
    int i;
    sem_init(&sem_P1, 0, 1);
    sem_init(&sem_P2, 0, 0);
    sem_init(&sem_P3, 0, 0);
    sem_init(&sem_P4, 0, 0);
    sem_init(&sem_P5, 0, 0);
    for (i = 1; i <= 5; i++) {
        pid = fork();
        if (pid == 0) {
            if (i == 1)
                process1();
            else if (i == 2)
                process2();
            else if (i == 3)
                process3();
            else if (i == 4)
                process4();
            else if (i == 5)
                process5();
            exit(0);
        }
    }
    for (i = 1; i <= 5; i++) {
        wait(NULL);
    }
    sem_destroy(&sem_P1);
    sem_destroy(&sem_P2);
    sem_destroy(&sem_P3);
    sem_destroy(&sem_P4);
    sem_destroy(&sem_P5);
    return 0;
}