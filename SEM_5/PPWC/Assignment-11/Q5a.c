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
    msgid = msgget(MSG_KEY, IPC_CREAT | 0666);
    if (msgid == -1) {
        perror("msgget failed");
        exit(1);
    }
    long msgtypes[] = {10, 30, 46, 67, 78, 88};
    for (int i = 0; i < 6; i++) {
        message.msgtype = msgtypes[i];
        snprintf(message.msgtext, sizeof(message.msgtext), "Message with type %ld", msgtypes[i]);
        
        if (msgsnd(msgid, &message, sizeof(message.msgtext), 0) == -1) {
            perror("msgsnd failed");
            exit(1);
        }
        printf("Sent: %s\n", message.msgtext);
    }
    return 0;
}