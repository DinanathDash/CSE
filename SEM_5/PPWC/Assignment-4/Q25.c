#include <stdio.h>
int findLargest(int *arr, int size) {
    int *ptr = arr;
    int largest = *ptr;
    for (int i = 0; i < size; i++) {
        if (*ptr > largest) {
            largest = *ptr;
        }
        ptr++;
    }
    return largest;
}
int main() {
    int arr[100];
    int size;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &size);
    printf("Enter %d elements: ", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }
    int largest = findLargest(arr, size);
    printf("The largest value in the array is: %d\n", largest);
    return 0;
}