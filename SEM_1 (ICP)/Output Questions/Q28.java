public class Q28 {
    public static void main(String args[]){
        byte y=5,z=-y;
        System.out.println(~y);
        System.out.println(~z);
        y&= ~y;
        System.out.println(y);
        byte x = -1;
        System.out.println(x>>>6);
        byte a=-5,b=-6;
        System.out.println(a|b);
    }         
}
