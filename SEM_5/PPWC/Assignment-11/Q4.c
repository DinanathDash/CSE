#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <mqueue.h>
#include <fcntl.h>
#include <sys/stat.h>
#define QUEUE_NAME "/my_queue"
#define MAX_SIZE 1024
int main() {
    mqd_t mq;
    char msg[MAX_SIZE];
    ssize_t bytes_read;
    mq = mq_open(QUEUE_NAME, O_RDONLY);
    if (mq == -1) {
        perror("Message queue open failed");
        exit(1);
    }
    while (1) {
        bytes_read = mq_receive(mq, msg, MAX_SIZE, NULL);
        if (bytes_read >= 0) {
            printf("Received: %s\n", msg);
        } else {
            if (errno == EAGAIN) {
                printf("No more messages in the queue.\n");
                break;
            } else {
                perror("Message receive failed");
                exit(1);
            }
        }
    }
    mq_close(mq);
    mq_unlink(QUEUE_NAME);
    return 0;
}