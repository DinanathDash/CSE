#include <stdio.h>
int existsInArray(int arr[], int size, int element) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == element) {
            return 1;
        }
    }
    return 0;
}
void copyDistinctElements(int src[], int size, int dist[], int *distSize) {
    *distSize = 0;
    for (int i = 0; i < size; i++) {
        if (!existsInArray(dist, *distSize, src[i])) {
            dist[*distSize] = src[i];
            (*distSize)++;
        }
    }
}
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
int main() {
    int source[] = {4, 7, 7, 3, 2, 5, 5};
    int size = sizeof(source) / sizeof(source[0]);
    int distinct[size];
    int distinctSize;
    copyDistinctElements(source, size, distinct, &distinctSize);
    printf("Distinct elements: ");
    printArray(distinct, distinctSize);
    return 0;
}