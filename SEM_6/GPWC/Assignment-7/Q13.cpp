class A {
public:
    void func1();
    void func2();
    void func3();
    void func4();
};
class B : private A {
private:
    int data;
};