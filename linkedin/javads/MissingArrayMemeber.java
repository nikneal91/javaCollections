package linkedin.javads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingArrayMemeber {
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
        findMembership(arr1,arr2).forEach(System.out::println);
    }

    private static List<Integer> findMembership(int[] arr1, int[] arr2) {
      List<Integer> result = new ArrayList<>();
      Set<Integer> set1 = new HashSet<>();
      List<Integer> col1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
      set1.addAll(col1);
      for (int i:arr2) {
        if (set1.contains(i)) {
            result.add(i);
        }
      }
      return result;
    }
}
