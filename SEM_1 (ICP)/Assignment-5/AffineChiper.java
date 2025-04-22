import java.util.Scanner;

public class AffineChiper {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter plaintext: ");
    String plaintext = sc.nextLine();
    System.out.print("Enter key pair (k1, k2): ");
    int k1 = sc.nextInt();
    int k2 = sc.nextInt();
    String ciphertext = encrypt(plaintext, k1, k2);
    sc.close();
    System.out.println("Ciphertext: " + ciphertext);
    System.out.println("Decrypted plaintext: " + decrypt(ciphertext, k1, k2));
  }

  public static String encrypt(String plaintext, int k1, int k2) {
    StringBuilder ciphertext = new StringBuilder();
    for (char c : plaintext.toCharArray()) {
      int charValue = c - 'a';
      int encryptedChar = (charValue * k1 + k2) % 26;
      ciphertext.append((char)(encryptedChar + 'a'));
    }
    return ciphertext.toString();
  }

  public static String decrypt(String ciphertext, int k1, int k2) {
    int k1Inv = -1;
    for (int i = 0; i < 26; i++) {
      if ((k1 * i) % 26 == 1) {
        k1Inv = i;
        break;
      }
    }
    int k2Inv = 26 - k2;
    StringBuilder plaintext = new StringBuilder();
    for (char c : ciphertext.toCharArray()) {
      int charValue = c - 'a';
      int decryptedChar = (k1Inv * (charValue - k2Inv)) % 26;
      plaintext.append((char)((decryptedChar + 26) % 26 + 'a'));
    }
    return plaintext.toString();
  }
}
