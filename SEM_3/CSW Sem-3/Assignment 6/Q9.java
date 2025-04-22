import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an int as a string: ");
        String intString = sc.nextLine();
        Integer intObject = convertToIntObject(intString);
        System.out.print("Enter a float as a string: ");
        String floatString = sc.nextLine();
        Float floatObject = convertToFloatObject(floatString);
        System.out.print("Enter a double as a string: ");
        String doubleString = sc.nextLine();
        Double doubleObject = convertToDoubleObject(doubleString);
        System.out.print("Enter a boolean as a string (true/false): ");
        String booleanString = sc.nextLine();
        Boolean booleanObject = convertToBooleanObject(booleanString);
        sc.close();
        System.out.println("Converted int object: " + intObject);
        System.out.println("Converted float object: " + floatObject);
        System.out.println("Converted double object: " + doubleObject);
        System.out.println("Converted boolean object: " + booleanObject);
    }
    public static Integer convertToIntObject(String input) {
        return Integer.valueOf(input);
    }
    public static Float convertToFloatObject(String input) {
        return Float.valueOf(input);
    }
    public static Double convertToDoubleObject(String input) {
        return Double.valueOf(input);
    }
    public static Boolean convertToBooleanObject(String input) {
        return Boolean.valueOf(input);
    }
}
