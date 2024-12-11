#include <stdio.h>
int f(int n) {
    static int i = 1;
    if (n >= 5) return n;
    n = n + 1;
    i++;
    return f(n);
}