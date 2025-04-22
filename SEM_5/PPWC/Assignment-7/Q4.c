struct person {
    int a;
    union health {
        int w;
    } h;
};

//Output - No output
//Explantion - It is perfectly valid to declare a union inside a structure in C