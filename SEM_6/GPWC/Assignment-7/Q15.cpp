#include <iostream>
using namespace std;
class B1 {
public:
    B1() { cout << "B1" << endl; }
};
class B2 {
public:
    B2() { cout << "B 2" << endl; }
};
class Derived : public B1, public B2 {
public:
    Derived() { cout << "D" << endl; }
};
int main() {
    Derived d;
    return 0;
}

// Output:
// B1
// B 2
// D