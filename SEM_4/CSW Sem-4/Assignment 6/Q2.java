class ReassigningReference {
    private String name;

    public ReassigningReference(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(this.name + " garbage collected");
    }

    public static void main(String[] args) {
        ReassigningReference obj1 = new ReassigningReference("Object 1");
        ReassigningReference obj2 = new ReassigningReference("Object 2");

        obj1 = obj2;

        System.out.println("Requesting garbage collection");
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
