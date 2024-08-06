package blind75;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum  {
    public static void main(String[] args) {
        //N = 5, arr[] = {2,6,5,8,11}, target = 14
        int arr[] = {2,6,5,8,11};
        int target = 15;
        int n=5;
        Integer[] arr1 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        boolean result = twoSum(arr1,n,target);
        System.out.println("Result is " + result);
    }

    private static boolean twoSum(Integer[] arr, int n, int target) {
        boolean result = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for ( int i=0;i<n;i++) {
            if ( map.containsKey(target-arr[i])) {
                System.out.println("Values are at index" + i +"  and " + map.get(target-arr[i]));
                return true;
            } else {
                map.put(arr[i],i);
            }
        }
        System.out.println("No result found variant are -1 and -1");
        return result;
    }
}
