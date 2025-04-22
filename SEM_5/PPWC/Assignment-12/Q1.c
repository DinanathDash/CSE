#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <arpa/inet.h>
int main() {
    struct sockaddr_in addr;
    memset(&addr, 0, sizeof(addr));
    addr.sin_family = AF_INET;
    addr.sin_port = htons(34567);
    if (inet_pton(AF_INET, "127.0.0.1", &addr.sin_addr) <= 0) {
        perror("Invalid IP address");
        exit(1);
    }
    printf("Socket address structure filled:\n");
    printf("Family: %d\n", addr.sin_family);
    printf("Port: %d\n", ntohs(addr.sin_port));
    printf("IP Address: %s\n", inet_ntoa(addr.sin_addr));
    return 0;
}