public class Q9 {
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        int num = 121;
        int notPalindrome = 123;
        System.out.println(num + " is palindrome: " + isPalindrome(num));
        System.out.println(notPalindrome + " is palindrome: " + isPalindrome(notPalindrome));
    }
}
