struct date {
    int m, d, y;
};
struct stud {
    char name[20];
    struct stud *p;
    struct date *d;
    int (*)fun(int, int);
};