#include <stdio.h>
typedef struct {
    char name[30];
    double diameter;
    int moons;
    double or_time, ro_time;
} planet_t;
int main() {
    // Declare a structure variable and a pointer
    planet_t planet;
    planet_t *ptr = &planet;

    // Initialize the structure components using the pointer
    ptr->diameter = 142.34;
    ptr->moons = 16;
    ptr->or_time = 11.9;
    ptr->ro_time = 9.23;
    snprintf(ptr->name, sizeof(ptr->name), "Jupiter");
    return 0;
}