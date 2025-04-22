public class demo{
    public static int fun(int a,int b){
        if(b==0)
            return a;
        else 
            return fun(a+a,b/2);
    }
    public static void main(String args[]){
        System.out.print(fun(4,3));
    }
}