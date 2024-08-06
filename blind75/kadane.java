package blind75;

public class kadane {
    /**
     * Kadane algorithm is used to find the max subarray with negative values
     * @param args
     */
    public static void main(String[] args) {
        int[] nums  = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Result is " + funckadan(nums,nums.length));
    }

    private static int funckadan(int[] nums, int length) {
       int sum=0;
       int start = 0;
        int ansStart = -1, ansEnd = -1;
       int maxSum = Integer.MIN_VALUE;
       for (int i=0;i<length;i++) {

        if (sum == 0) start = i; // starting index

        sum += nums[i];
        
        if ( sum > maxSum) {
            maxSum=sum;
            ansStart = start;
            ansEnd = i;
        }
        if ( sum < 0) {
            sum=0;
            
        }

       }
        //printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("]n");
       return maxSum;
    }
}
