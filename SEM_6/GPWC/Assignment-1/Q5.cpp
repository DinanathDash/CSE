#include <iostream>
using namespace std;

void Cube(double &y) {
    y = y * y * y;
}

int main() {
    double g = 4.0;
    Cube(g);
    cout << g << endl;
    return 0;
}

//Output - 64