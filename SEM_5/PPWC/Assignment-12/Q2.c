#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <arpa/inet.h>
int main() {
    struct sockaddr_in servaddr, cliaddr;
    char serv_ip[INET_ADDRSTRLEN], cli_ip[INET_ADDRSTRLEN];
    int serv_port, cli_port;
    printf("Enter server IP address: ");
    scanf("%s", serv_ip);
    printf("Enter server port number: ");
    scanf("%d", &serv_port);
    printf("Enter client IP address: ");
    scanf("%s", cli_ip);
    printf("Enter client port number: ");
    scanf("%d", &cli_port);
    memset(&servaddr, 0, sizeof(servaddr));
    servaddr.sin_family = AF_INET;
    servaddr.sin_port = htons(serv_port);
    if (inet_pton(AF_INET, serv_ip, &servaddr.sin_addr) <= 0) {
        perror("Invalid server IP address");
        exit(1);
    }
    memset(&cliaddr, 0, sizeof(cliaddr));
    cliaddr.sin_family = AF_INET;
    cliaddr.sin_port = htons(cli_port);
    if (inet_pton(AF_INET, cli_ip, &cliaddr.sin_addr) <= 0) {
        perror("Invalid client IP address");
        exit(1);
    }
    printf("\nServer Address:\n");
    printf("IP Address: %s\n", inet_ntoa(servaddr.sin_addr));
    printf("Port: %d\n", ntohs(servaddr.sin_port));
    printf("\nClient Address:\n");
    printf("IP Address: %s\n", inet_ntoa(cliaddr.sin_addr));
    printf("Port: %d\n", ntohs(cliaddr.sin_port));
    return 0;
}