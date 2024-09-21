public class Q5 {
	public static void main(String[] args) {
		int arr[]= {1, -2, 5, -7, 4, 6, -3};
		int n= arr.length;
		int x=0;
		a:for(int i=0; i<n; i++) {
			if(arr[i]>x) {
				x=arr[i];
				b:for(int j=0; j<n; j++) {
					if(arr[j]==x+1) {
						x=x+1;
						continue b;
					}
					else if(j==n-1){
						System.out.print("Smallest positive missing number in the array: ");
						System.out.println(x+1);
						return;
					}
				}
			}
		}
	}
}