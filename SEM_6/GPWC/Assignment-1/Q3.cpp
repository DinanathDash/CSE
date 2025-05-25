#include <iostream>
using namespace std;

int x = 1;

void fun() {
    int x = 2;
    {
        int x = 3;
        cout << ::x << endl;
    }
}

int main() {
    fun();
    return 0;
}

//Output - 1
//::x refers to the global variable x, which is 1.
//the local x variables (2 & 3) do  not affect ::x.