public class Question_7 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isTriangle;

        isTriangle = (a + b >= c);
        isTriangle = (b + c >= a);
        isTriangle = (a + c >= b);
        System.out.println(isTriangle);
    }
}