#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <arpa/inet.h>
#define PORT 8080
#define BUFFER_SIZE 1024
int main() {
    int sockfd;
    struct sockaddr_in servaddr;
    char *request = "Hello, Server! This is the client.";
    char buffer[BUFFER_SIZE];
    if ((sockfd = socket(AF_INET, SOCK_DGRAM, 0)) < 0) {
        perror("Socket creation failed");
        exit(EXIT_FAILURE);
    }
    servaddr.sin_family = AF_INET;
    servaddr.sin_port = htons(PORT);
    servaddr.sin_addr.s_addr = inet_addr("127.0.0.1");
    sendto(sockfd, request, strlen(request), 0, (struct sockaddr *)&servaddr, sizeof(servaddr));
    printf("Request sent to server: %s\n", request);
    socklen_t len = sizeof(servaddr);
    recvfrom(sockfd, buffer, BUFFER_SIZE, 0, (struct sockaddr *)&servaddr, &len);
    buffer[BUFFER_SIZE - 1] = '\0';
    printf("Message from server: %s\n", buffer);
    close(sockfd);
    return 0;
}