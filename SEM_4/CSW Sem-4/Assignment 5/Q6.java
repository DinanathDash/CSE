public class Q6 {
    public static void main(String[] args) {
        String numberStr = "abc123";
        try {
            int number = Integer.parseInt(numberStr);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }
    }
}