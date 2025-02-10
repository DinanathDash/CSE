import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Integer arr[]=new Integer[5];
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int x=sc.nextInt();
        int y=count(arr, x);
        System.out.println("Number of times "+x+" present in the array is "+y);
        sc.close();
    }
    public static <T> int count(T[] array,T item){
        int count =0;
        for(int i=0;i<array.length;i++){
            if (array[i].equals(item))
                count++;
            }                
        return count;
    }
}
