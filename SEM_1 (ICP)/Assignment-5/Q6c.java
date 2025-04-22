public class Q6c {
    public static void main(String[] args) {
        int i,j, count=1;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
    }
}
