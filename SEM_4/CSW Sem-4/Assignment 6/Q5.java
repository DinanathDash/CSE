class DataObject {
    private int intVal;
    private double doubleVal;

    public void initialize(int intVal, double doubleVal) {
        this.intVal = intVal;
        this.doubleVal = doubleVal;
    }

    public void setVal(int intVal, double doubleVal) {
        this.intVal = intVal;
        this.doubleVal = doubleVal;
    }

    public void updateVal(int intValDelta, double doubleValDelta) {
        this.intVal += intValDelta;
        this.doubleVal += doubleValDelta;
    }

    public static void main(String[] args) {
        DataObject obj1 = new DataObject();
        DataObject obj2 = new DataObject();

        obj1.initialize(10, 3.14);
        obj2.initialize(20, 6.28);
        obj1.updateVal(5, 1.5);
        obj2.updateVal(10, 2.7);

        Runtime runtime = Runtime.getRuntime();
        long totalMemoryBefore = runtime.totalMemory();
        long freeMemoryBefore = runtime.freeMemory();
        long memoryAllocated = totalMemoryBefore - freeMemoryBefore;

        System.out.println("Total Memory Allocated: " + memoryAllocated + " bytes");

        obj1 = null;
        obj2 = null;

        System.gc();

        long totalMemoryAfter = runtime.totalMemory();
        long freeMemoryAfter = runtime.freeMemory();
        long memoryAfterGC = totalMemoryAfter - freeMemoryAfter;

        System.out.println("Memory Occupied by Garbage: " + memoryAfterGC + " bytes");
        System.out.println("Total Memory After Garbage Collection: " + totalMemoryAfter + " bytes");
    }
}
