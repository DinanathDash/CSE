#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/msg.h>
#include <errno.h>
#define MSG_KEY 1234
struct msgbuf {
    long msgtype;
    char msgtext[100];
};
int main() {
    int msgid;
    struct msgbuf message;
    msgid = msgget(MSG_KEY, 0666);
    if (msgid == -1) {
        perror("msgget failed");
        exit(1);
    }
    long msgtypes[] = {-10, 100, -46, 0, 88};
    for (int i = 0; i < 5; i++) {
        if (msgrcv(msgid, &message, sizeof(message.msgtext), msgtypes[i], 0) == -1) {
            if (errno == ENOMSG) {
                printf("No messages with type %ld\n", msgtypes[i]);
            } else {
                perror("msgrcv failed");
                exit(1);
            }
        } else {
            printf("Received: %s\n", message.msgtext);
        }
    }
    msgctl(msgid, IPC_RMID, NULL);
    return 0;
}