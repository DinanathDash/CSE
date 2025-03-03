#include <iostream>
using namespace std;

class MyClass {
public:
    ~MyClass() {
        cout << "My destructor" << endl;
    }
};

int main() {
    MyClass obj;
    return 0;
}

//Output - My destructor