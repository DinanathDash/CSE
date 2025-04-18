#include <iostream>
using namespace std;
class CSE {
public:
    int x, y;

    void set(int x1, int y1) {
        x = x1;
        y = y1;
    }

    void get() {
        cout << x << " " << y << endl;
    }
};
int main() {
    CSE a;
    a.set(10, 20);
    a.get();
    return 0;
}
// Output: 10 20