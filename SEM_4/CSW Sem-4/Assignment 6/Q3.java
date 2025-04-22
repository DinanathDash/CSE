class NullifiedReference {
    private String name;

    public NullifiedReference(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(this.name + " garbage collected");
    }

    public static void main(String[] args) {
        NullifiedReference obj = new NullifiedReference("Sample Object");

        obj = null;

        System.out.println("Requesting garbage collection");
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
