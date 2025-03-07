#include <iostream>
using namespace std;

int x[100];

int main() {
    cout << x[99] << endl;
}

//Output - 0
//x[100] is a global array, which is automatically initialised as 0.