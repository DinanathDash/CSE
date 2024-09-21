class AnonymousObject {
    private String name;

    public AnonymousObject(String name) {
        this.name = name;
    }

    public void finalize() {
        System.out.println(name + " garbage collected.");
    }

    public static void main(String[] args) {
        new AnonymousObject("AnonymousObject1");

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
