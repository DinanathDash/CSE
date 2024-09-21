class UnreachableObject {
    private String name;

    public UnreachableObject(String name) {
        this.name = name;
    }

    public static void show() {
        UnreachableObject obj1 = new UnreachableObject("First");
        obj1.display();
    }

    public void display() {
        UnreachableObject obj2 = new UnreachableObject("Second");
        System.out.println("Display method is called.");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(this.name + " garbage collected");
    }

    public static void main(String[] args) {
        show();
        System.out.println("Requesting garbage collection");
        System.gc();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
