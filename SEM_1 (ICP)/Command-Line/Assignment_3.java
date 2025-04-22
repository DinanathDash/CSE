public class Assignment_3 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=a/1000;
        int c=a%10;
        int sum=b+c;
        System.out.println("Sum of first and last digit of the number: "+sum);
    }
}
