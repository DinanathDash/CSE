#include <stdio.h>

int main() {
    int total_population = 80000;
    float percentage_men = 52.0;
    float percentage_literate_total = 48.0;
    float percentage_literate_men = 35.0;
    int total_men = (percentage_men / 100) * total_population;
    int total_women = total_population - total_men;
    int total_literate_people = (percentage_literate_total / 100) * total_population;
    int literate_men = (percentage_literate_men / 100) * total_population;
    int literate_women = total_literate_people - literate_men;
    int illiterate_men = total_men - literate_men;
    int illiterate_women = total_women - literate_women;
    printf("Number of illiterate men: %d\n", illiterate_men);
    printf("Number of illiterate women: %d\n", illiterate_women);

    return 0;
}
