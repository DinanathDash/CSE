public class Q2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World");
        
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        
        String palindrome = "racecar";
        
        System.out.println("Length of palindrome: " + palindrome.length());
        
        System.out.println("Character at index 2: " + palindrome.charAt(2));
        
        CharSequence subSeq = palindrome.subSequence(1, 5);
        System.out.println("Subsequence: " + subSeq);
    }
}
