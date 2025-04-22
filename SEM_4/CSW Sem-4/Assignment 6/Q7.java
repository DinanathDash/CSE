class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void enrollCourse(String courseName) {
        System.out.println(name + " enrolled in course: " + courseName);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " has been garbage collected.");
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Alice", 22);

        student1.enrollCourse("Mathematics");
        student2.enrollCourse("Physics");

        System.gc();

        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        System.out.println("Total Memory: " + totalMemory);
        System.out.println("Free Memory: " + freeMemory);
    }
}
