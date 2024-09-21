public class Q2 {
    public static void main(String[] args) {
        float floatValue = 3.14f;
        Float floatObject = convertToFloatObject(floatValue);
        System.out.println("Original float value: " + floatValue);
        System.out.println("Converted Float object: " + floatObject);
    }
    public static Float convertToFloatObject(float value) {
        return Float.valueOf(value);
    }
}
