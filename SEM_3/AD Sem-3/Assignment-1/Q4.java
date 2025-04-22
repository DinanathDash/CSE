public class Q4 {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum contiguous sum is: "+ maxSubArraySum(arr));
    }
    public static int maxSubArraySum(int arr[]) {
        int max_sum = Integer.MIN_VALUE, cur_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            cur_sum = cur_sum + arr[i];
            if (max_sum < cur_sum)
                max_sum = cur_sum;
            if (cur_sum < 0)
                cur_sum = 0;
        }
        return max_sum;
    }
}
