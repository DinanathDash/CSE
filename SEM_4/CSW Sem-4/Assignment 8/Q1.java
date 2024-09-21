public class Q1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println("Comparing string literals with '==':");
        System.out.println("str1 == str2: " + (str1 == str2)); 
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str3 == str4: " + (str3 == str4));

        System.out.println("\nComparing string content with 'equals':");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); 
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str3.equals(str4): " + str3.equals(str4));

        System.out.println("\nMemory Usage:");
        System.out.println("Memory address of str1: " + System.identityHashCode(str1));
        System.out.println("Memory address of str2: " + System.identityHashCode(str2));
        System.out.println("Memory address of str3: " + System.identityHashCode(str3));
        System.out.println("Memory address of str4: " + System.identityHashCode(str4));
    }
}
