import java.util.Scanner;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plaintext: ");
        String plaintext = sc.nextLine();
        sc.close();
        String ciphertext = encrypt(plaintext);
        System.out.println("Ciphertext: " + ciphertext);
        System.out.println("Decrypted: " + decrypt(ciphertext));
    }

    private static String encrypt(String plaintext) {
        char[] chars = plaintext.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(chars[i] + 3);
        }
        return new String(chars);
    }

    private static String decrypt(String ciphertext) {
        char[] chars = ciphertext.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(chars[i] - 3);
        }
        return new String(chars);
    }
}
