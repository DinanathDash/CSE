/*
#include <iostream>
#include <cstdlib>
#include <ctime>
int main() {
    const int size = 10;
    int arr[size], shiftedArr[size];
    std::srand(std::time(0));
    std::cout << "Original Array: ";
    for (int i = 0; i < size; i++) {
        arr[i] = std::rand() % 100 + 1;
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;
    for (int i = size - 1; i >= 2; i--) {
        shiftedArr[i] = arr[i - 2];
    }
    for (int i = 0; i < 2; i++) {
        shiftedArr[i] = std::rand() % 11 + 20;
    }
    std::cout << "Shifted Array:  ";
    for (int i = 0; i < size; i++) {
        std::cout << shiftedArr[i] << " ";
    }
    std::cout << std::endl;
    return 0;
}
*/