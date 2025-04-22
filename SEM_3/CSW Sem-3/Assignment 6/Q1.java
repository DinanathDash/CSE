public class Q1 {
    public static void main(String[] args) {
        int intValue = 42;
        Integer integerValue = convertToInteger(intValue);
        System.out.println("Original int value: " + intValue);
        System.out.println("Converted Integer value: " + integerValue);
    }
    public static Integer convertToInteger(int value) {
        return Integer.valueOf(value);
    }
}
