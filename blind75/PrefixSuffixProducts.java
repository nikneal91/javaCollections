package blind75;

import java.util.Arrays;

public class PrefixSuffixProducts {
    public static void main(String[] args) {
        //int[] nums = {1,2,3,4};
        int[] nums = {-1,1,0,-3,3};
        calculateProduct(nums,nums.length);

    }

    private static void calculateProduct(int[] nums, int length) {
       int[] prefixProduct = new int[length];
       int[] suffixProduct= new int[length];
       int[] resultant = new int[length];

        prefixProduct[0]=1;
        for (int i=1;i<length;i++) {
            prefixProduct[i] = prefixProduct[i-1]*nums[i-1];
        }

        suffixProduct[length-1]=1;
        for (int i=length-2;i>=0;i--) {
            suffixProduct[i] = suffixProduct[i+1]*nums[i+1];
        }

        System.out.println("Prefix Product " + Arrays.toString(prefixProduct));
        System.out.println(" Suffix Product " + Arrays.toString(suffixProduct));
        for (int i=0;i<length;i++) {
            resultant[i] = prefixProduct[i]*suffixProduct[i];
        }

        System.out.println(" Resultant " + Arrays.toString(resultant));

    }
}
