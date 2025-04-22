#include <iostream>
using namespace std;

class Sample {
public:
    Sample(int x = 10) {
        cout << "Value: " << x << endl;
    }
};

int main() {
    Sample obj;
    return 0;
}

//Output - Value: 10
//The constructor has a default parameter x=10.