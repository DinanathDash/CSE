public class Q10 {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        for (char ch = ch1; ch <= ch2; ch++) {
            System.out.print(ch + " ");
            count++;
            if (count == numberPerLine) {
                System.out.println();
                count = 0;
            }
        }
    }
}
