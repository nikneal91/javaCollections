package blind75;

import java.util.HashMap;

public class ContainDuplicate {
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean result = containsDup(nums);
        System.out.println("Result is " + result);
    }

    private static boolean containsDup(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<>();
     for (int x: nums) {
        if ( map.containsKey(x)) {
            return true;
        } else {
            map.put(new Integer(x), 1);
        }
     }
     return false;
    }
}
