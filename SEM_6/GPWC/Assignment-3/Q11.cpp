#include <iostream>
using namespace std;
class A {
private:
    int x, y;
public:
    void setXY(int x1, int y1) {
        x = x1;
        y = y1;
    }
    void getXY() {
        cout << x << " " << y << endl;
    }
    ~A() { 
        cout << "END" << endl;
    }
};

int main() {
    A a1, a2;
    a1.setXY(10, 20);
    a2.setXY(40, 50);
    a1.getXY();
    return 0;
}

// Output: 10 20
// END
// END