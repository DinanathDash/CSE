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
//The destructor ~MyClass() is called twice: once explicitly (obj ~MyClass()) and once when obj goes out of scope.