/*Expected Output:
If the system is little-endian, the output will be:

perl
Copy code
Port given=4096
Reason:

16 (decimal) is 0x0010 in hex (little-endian).
After htons, it becomes 0x1000 in network byte order (big-endian).
When interpreted as a 16-bit integer in little-endian format, 0x1000 corresponds to 4096 (decimal).
If the system is big-endian, the output will be:

perl
Copy code
Port given=16
Reason:

On big-endian systems, htons does not change the value because the host and network byte orders are the same.
Corrected Code for Host-Readable Output:
To print the port in host byte order, convert it back using ntohs:

c
Copy code
#include <stdio.h>
#include <arpa/inet.h> // For htons and ntohs

int main() {
    struct sockaddr_in servaddr;
    servaddr.sin_family = AF_INET;
    servaddr.sin_port = htons(16);
    
    printf("Port given (network byte order)=%d\n", servaddr.sin_port);
    printf("Port given (host byte order)=%d\n", ntohs(servaddr.sin_port));
    
    return 0;
}
Output on any system:

arduino
Copy code
Port given (network byte order)=4096  // Raw value in network byte order
Port given (host byte order)=16       // Correct value in host byte order
Summary:
The mismatch in byte order causes the discrepancy in the printed output.
Use ntohs to convert the port back to host byte order for correct interpretation.*/