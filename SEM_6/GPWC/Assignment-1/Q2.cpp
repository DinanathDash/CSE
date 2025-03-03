#include <iostream>
using namespace std;

void myfun(int i, int &k) {
    i = 1;
    k = 2;
}

int main () {
    int x = 0;
    myfun (x, x);
    cout << x << endl;
    return 0;
}

//Output - 2