#include <stdio.h>
int binary_srch(int arr[], int size, int target) {
    int bottom = 0;
    int top = size - 1;
    int middle;
    int found = 0;
    while (bottom <= top && !found) {
        middle = (bottom + top) / 2;
        if (arr[middle] == target) {
            found = 1;
            return middle;
        } else if (arr[middle] > target) {
            top = middle - 1;
        } else {
            bottom = middle + 1;
        }
    }
    return -1;
}
int main() {
    int arr[] = {3, 8, 15, 20, 24, 30, 42, 55, 68, 77, 83, 95};
    int size = sizeof(arr) / sizeof(arr[0]);
    int target = 24;
    int result = binary_srch(arr, size, target);
    if (result != -1) {
        printf("Target %d found at index %d.\n", target, result);
    } else {
        printf("Target %d not found in the array.\n", target);
    }
    return 0;
}