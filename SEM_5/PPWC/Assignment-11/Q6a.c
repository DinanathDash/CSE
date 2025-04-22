#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/msg.h>
#include <errno.h>
#define MSG_KEY 1234
#define MAX_TEXT_LEN 100
struct msgbuf {
    long msgtype;
    char msgtext[MAX_TEXT_LEN];
    int key;
};
void encrypt_message(char *message, int key, char *encrypted) {
    for (int i = 0; message[i] != '\0'; i++) {
        if (message[i] >= 'a' && message[i] <= 'z') {
            encrypted[i] = (message[i] - 'a' + key) % 26 + 'a';
        } else if (message[i] >= 'A' && message[i] <= 'Z') {
            encrypted[i] = (message[i] - 'A' + key) % 26 + 'A';
        } else {
            encrypted[i] = message[i];
        }
    }
}
int main() {
    int msgid;
    struct msgbuf message;
    char msg[MAX_TEXT_LEN];
    char encrypted[MAX_TEXT_LEN];
    int key = 5;
    printf("Enter the message to encrypt: ");
    fgets(msg, MAX_TEXT_LEN, stdin);
    msg[strcspn(msg, "\n")] = '\0';
    encrypt_message(msg, key, encrypted);
    msgid = msgget(MSG_KEY, IPC_CREAT | 0666);
    if (msgid == -1) {
        perror("msgget failed");
        exit(1);
    }
    message.msgtype = 1;
    message.key = key;
    strncpy(message.msgtext, encrypted, MAX_TEXT_LEN);
    if (msgsnd(msgid, &message, sizeof(message.key) + strlen(message.msgtext) + 1, 0) == -1) {
        perror("msgsnd failed");
        exit(1);
    }
    printf("Encrypted message: %s\n", encrypted);
    printf("Key: %d\n", key);
    return 0;
}