public class Q1 {
    public static void main(String[] args) {
        String text = null;
        try {
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("Can't operate  on a null object!");
        }
    }
}
