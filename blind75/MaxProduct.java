package blind75;

public class MaxProduct {

    public static void main(String[] args) {
        int nums[] = {1,2,-3,0,-4,-5};
		int answer = maxProductSubArray(nums);
		System.out.print("The maximum product subarray is: "+answer);
    }

    private static int maxProductSubArray(int[] nums) {
     int result = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++) {
            for ( int j=i+1; j<nums.length; j++) {
                int prod=1;
                for (int k=i ;k<=j;k++) {
                    prod*=nums[k];
                }
                result = Math.max(result,prod);
            }
        }

        return result;
    }


}
