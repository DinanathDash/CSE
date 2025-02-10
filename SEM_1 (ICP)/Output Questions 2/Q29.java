public class Q29 {
    public static void main(String s[]) {
        int x = 20;
        int y = 25;
        if (++x < (y = y -= 4) || (x = x += 4) > y) {
            System.out.println(x + "," + y);
        }
    }
}
