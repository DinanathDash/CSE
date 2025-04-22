public class Q4 {
    public static void main(String[] args) {
        boolean booleanValue = true;
        Boolean booleanObject = convertToBooleanObject(booleanValue);
        System.out.println("Original boolean value: " + booleanValue);
        System.out.println("Converted Boolean object: " + booleanObject);
    }
    public static Boolean convertToBooleanObject(boolean value) {
        return Boolean.valueOf(value);
    }
}
