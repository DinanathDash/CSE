public class Q2 {
    public static void main(String[] args) {
        boolean i=false,x=false,y=true;
        if(i=(x=i=y)) 
            System.out.println("bye");
        else
            System.out.println("hello");
        System.out.println("hi");
    }
}
