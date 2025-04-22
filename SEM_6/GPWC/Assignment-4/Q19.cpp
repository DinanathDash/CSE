#include <iostream>
using namespace std;
class Box {
public:
    double length;
    double breadth;
    double height;
};
int main() {
    Box Box1;
    double volume;
    Box1.height = 5;
    Box1.length = 6;
    Box1.breadth = 7.1;
    volume = Box1.height * Box1.length * Box1.breadth;
    cout << "Volume of Box1 : " << volume << endl;
    return 0;
}
//Output:
// Volume of Box1 : 213.5