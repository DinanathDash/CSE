#include <stdio.h>
typedef struct {
    char name[30];
    double diameter;
    int moons;
    double or_time, ro_time;
} planet_t;
int main() {
    // Initialize the variable with given values
    planet_t planet1 = {"Jupiter", 142.34, 16, 11.9, 9.23};
    return 0;
}