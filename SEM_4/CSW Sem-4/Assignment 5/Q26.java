public class Q26 {
    public static void main(String[] args) {
        try {
            Class.forName("ExampleClass");
            ExampleClass.method();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        } catch (MethodNotFoundException e) {
            System.err.println("Method not found: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

class ExampleClass {
    public static void method() throws MethodNotFoundException {
        throw new MethodNotFoundException("This method is not implemented.");
    }
}

class MethodNotFoundException extends Exception {
    public MethodNotFoundException(String message) {
        super(message);
    }
}
