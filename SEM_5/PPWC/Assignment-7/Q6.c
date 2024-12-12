struct person {
    int ht;
    float wt;
    char color;
    struct person p; /* Invalid: A structure cannot have an instance of itself as a member */
};

//The correct approach is to use a pointer: struct person *p;