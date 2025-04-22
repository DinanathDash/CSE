public class Question_5 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int s=a+b+c;
        int min=Math.min(a,b);
        int min1=Math.min(min,c);
        int max=Math.max(a,b);
        int max1=Math.max(max,c);
        int mid=s-min1-max1;
        System.out.println("Let the three integers be: "+a+" "+b+" "+c+" and their ascending order are: ");
        System.out.println(min1+"\n"+mid+"\n"+max1);
    }
}