#include <iostream>
using namespace std;
int& getMax(int &a, int &b) {
    return (a > b) ? a : b;
}
int main() {
    int x=40, y=60;
    int& maxVal = getMax(x, y);
    cout << maxVal << endl;
    maxVal = 30;
    cout << "x = " << x << ", y = " << y;
    return 0;
}

// Output:
// 10
// x = 10, y = 30

// Output:
// 20
// x = 20, y = 30

// Output:
// 30
// x = 10, y = 30

// Output:
// 20
// x = 10, y = 30

// Output:
// 60
// x = 30, y = 40

// Output:
// 60
// x = 40, y = 30