#include <iostream>
using namespace std;

class A {
public:
    A() { cout << "A "; }
    ~A() { cout << "~A "; }
};

void func() {
    static A obj;
}

int main() {
    func();
    func();
    cout << "Main ";
    return 0;
}

//Output - A Main ~A
//func() is called twice, but static A obj is created only once.