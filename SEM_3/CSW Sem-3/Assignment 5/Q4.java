import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 64-bit word as a long integer: ");
        long inputWord = sc.nextLong();
        long reversedWord = reverseBits(inputWord);
        System.out.println("Original Word: " + Long.toBinaryString(inputWord));
        System.out.println("Reversed Word: " + Long.toBinaryString(reversedWord));
        sc.close();
    }
    private static long reverseBits(long inputWord) {
        long reversedWord = 0;
        for (int i = 0; i < 64; i++) {
            long bit = (inputWord >> i) & 1;
            reversedWord |= (bit << (63 - i));
        }
        return reversedWord;
    }
}
