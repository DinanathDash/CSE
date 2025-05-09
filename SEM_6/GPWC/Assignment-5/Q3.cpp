#include <iostream>
using namespace std;
void update(int& rnum, int vnum, int *pnum){
    rnum = rnum + 500;
    vnum = vnum + 500;
    *pnum = *pnum + 500;
}

int main(){
    int num1 = 11, num2 = 22, num3 = 33;
    update(num1, num2, &num3);
    cout << num1 << " " << num2 << " " << num3 << endl;
    return 0;
}
// The output of the program is:
// 511 22 533