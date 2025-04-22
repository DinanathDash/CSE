#include <iostream>
using namespace std;
class CSE {
public:
    int x, y;
    CSE(int x1, int y1) {
        x = x1;
        y = y1;
    }
    void get() {
        cout << x << " " << y << endl;
    }
};
int main() {
    CSE(100, 200).get();
    CSE A(50, 60);
    cout << A.x << " " << A.y << endl;
    return 0;
}
//Output:
// 100 200
// 50 60