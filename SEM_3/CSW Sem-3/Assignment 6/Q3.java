public class Q3 {
    public static void main(String[] args) {
        double doubleValue = 3.14159;
        Double doubleObject = convertToDoubleObject(doubleValue);
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Converted Double object: " + doubleObject);
    }
    public static Double convertToDoubleObject(double value) {
        return Double.valueOf(value);
    }
}
