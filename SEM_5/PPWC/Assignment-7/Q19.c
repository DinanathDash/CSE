#include <stdio.h>
#include <string.h>
#define MAX_ADDRESSES 100
#define NICKNAME_SIZE 10

// Define the address_t structure
typedef struct {
    int xx, yy, zz, mm;     // Internet address components
    char nickname[NICKNAME_SIZE]; // Nickname
} address_t;

// Function prototypes
void scan_address(address_t *addr);
void print_address(const address_t *addr);
int local_address(const address_t *addr1, const address_t *addr2);

int main() {
    address_t addresses[MAX_ADDRESSES];
    int count = 0;

    printf("Enter up to %d addresses and nicknames (terminate with 0.0.0.0 none):\n", MAX_ADDRESSES);

    // Read addresses until the sentinel is encountered
    while (count < MAX_ADDRESSES) {
        scan_address(&addresses[count]);
        if (addresses[count].xx == 0 && addresses[count].yy == 0 &&
            addresses[count].zz == 0 && addresses[count].mm == 0 &&
            strcmp(addresses[count].nickname, "none") == 0) {
            break;
        }
        count++;
    }

    // Find and display all pairs of computers in the same locality
    printf("\nComputers on the same local network:\n");
    for (int i = 0; i < count; i++) {
        for (int j = i + 1; j < count; j++) {
            if (local_address(&addresses[i], &addresses[j])) {
                printf("Machines %s and %s are on the same local network.\n",
                       addresses[i].nickname, addresses[j].nickname);
            }
        }
    }

    // Display the full list of addresses and nicknames
    printf("\nFull list of addresses and nicknames:\n");
    for (int i = 0; i < count; i++) {
        print_address(&addresses[i]);
    }

    return 0;
}

// Function to read an address and nickname from the user
void scan_address(address_t *addr) {
    printf("Enter address (xx.yy.zz.mm nickname): ");
    scanf("%d.%d.%d.%d %s", &addr->xx, &addr->yy, &addr->zz, &addr->mm, addr->nickname);
}

// Function to print an address and nickname
void print_address(const address_t *addr) {
    printf("%d.%d.%d.%d %s\n", addr->xx, addr->yy, addr->zz, addr->mm, addr->nickname);
}

// Function to determine if two addresses are on the same local network
int local_address(const address_t *addr1, const address_t *addr2) {
    return (addr1->xx == addr2->xx && addr1->yy == addr2->yy);
}

/*
Enter up to 100 addresses and nicknames (terminate with 0.0.0.0 none):
Enter address (xx.yy.zz.mm nickname): 111.22.3.44 platte
Enter address (xx.yy.zz.mm nickname): 555.66.7.88 wabash
Enter address (xx.yy.zz.mm nickname): 111.22.5.66 green
Enter address (xx.yy.zz.mm nickname): 0.0.0.0 none

Computers on the same local network:
Machines platte and green are on the same local network.

Full list of addresses and nicknames:
111.22.3.44 platte
555.66.7.88 wabash
111.22.5.66 green
*/