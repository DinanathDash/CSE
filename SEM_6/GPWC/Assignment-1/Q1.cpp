#include <iostream>
using namespace std;
void swap (int &a, int &b) {
    int temp;
    temp = a;
    a = b;
    b = temp;
}

int main () {
    int i = 0, j = 1;
    swap (i, j);
    cout << i << " " << j << endl;
}

//Output - 1 0
//Function swap uses referenced parameters (int &a, int &b) meaning changes inside the function affect the original values.