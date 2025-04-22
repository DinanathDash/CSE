public class Q38 {
    public static void main(String args[]){
        int a=12+21*3-9/2;
        int b=14-32*4+175/8-3;
        boolean p=(++a>71&&--b<20);
        System.out.println(p);
        boolean p1=(b-- == -99 || a-- > 100);
        System.out.println(p1);
    }
}
