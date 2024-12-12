#include <stdio.h>
typedef struct {
    char name[30];
    double diameter;
    int moons;
    double or_time, ro_time;
} planet_t;

int main() {
    // Declare two variables of the structure type planet_t
    planet_t planet1, planet2;

    // Example initialization
    planet1 = (planet_t){"Earth", 12742.0, 1, 365.25, 24.0};
    planet2 = (planet_t){"Mars", 6779.0, 2, 687.0, 24.6};
    return 0;
}