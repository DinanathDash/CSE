public class Q3 {
    public static void main(String[] args) {
        int arr[]={5, 4, 3, 2, 1};
        if (isReverse(arr)){
            System.out.println("The array is in reversed order");
        } else{
            System.out.println("The array is not in reversed order");
        }
    }
    public static boolean isReverse(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                count++;
            }
        }
        if (count==(arr.length-1)){
            return true;
        } else{
            return false;
        }
    }
}
