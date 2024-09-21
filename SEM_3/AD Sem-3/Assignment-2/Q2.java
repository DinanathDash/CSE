public class Q2 {
	public static void main(String args[]) { 
		int arr[] = {1, 4, 45, 6, -50, 10, 2};
		int n = arr.length;
        System.out.println("Maximum value: " + max(arr, n));
		System.out.println("Minimum value: " + min(arr, n)); 
	}
    public static int min(int arr[], int n) {
	    if(n==1) 
		    return arr[0]; 
		return Math.min(arr[n-1], min(arr, n-1)); 
	}
	public static int max(int arr[], int n) {
	    if(n==1) 
		    return arr[0]; 
		return Math.max(arr[n-1], max(arr, n-1)); 
	}
}