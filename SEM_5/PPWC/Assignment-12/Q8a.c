#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <arpa/inet.h>
#define PORT 8080
#define BUFFER_SIZE 1024
int main() {
    int sockfd;
    struct sockaddr_in servaddr, cliaddr;
    char *message = "Hello, Client! This is the server.";
    socklen_t len = sizeof(cliaddr);
    if ((sockfd = socket(AF_INET, SOCK_DGRAM, 0)) < 0) {
        perror("Socket creation failed");
        exit(EXIT_FAILURE);
    }
    servaddr.sin_family = AF_INET;
    servaddr.sin_addr.s_addr = INADDR_ANY;
    servaddr.sin_port = htons(PORT);
    if (bind(sockfd, (struct sockaddr *)&servaddr, sizeof(servaddr)) < 0) {
        perror("Bind failed");
        close(sockfd);
        exit(EXIT_FAILURE);
    }
    printf("Server is waiting for a request on port %d...\n", PORT);
    char buffer[BUFFER_SIZE];
    recvfrom(sockfd, buffer, BUFFER_SIZE, 0, (struct sockaddr *)&cliaddr, &len);
    printf("Received request from client: %s\n", buffer);
    sendto(sockfd, message, strlen(message), 0, (struct sockaddr *)&cliaddr, len);
    printf("Message sent to client: %s\n", message);
    close(sockfd);
    return 0;
}