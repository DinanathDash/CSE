#include <stdio.h>
#include <math.h>

int main() {
    float takeoff_speed_kmh, takeoff_speed_ms, distance, acceleration, time;

    printf("Enter the jet's takeoff speed (km/h): ");
    scanf("%f", &takeoff_speed_kmh);

    printf("Enter the distance over which the jet is accelerated (meters): ");
    scanf("%f", &distance);

    takeoff_speed_ms = takeoff_speed_kmh * 1000 / 3600;

    acceleration = (takeoff_speed_ms * takeoff_speed_ms) / (2 * distance);

    time = takeoff_speed_ms / acceleration;

    printf("The required acceleration is %.2f m/s^2\n", acceleration);
    printf("The time required to reach takeoff speed is %.2f seconds\n", time);

    return 0;
}
