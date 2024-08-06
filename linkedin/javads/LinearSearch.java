package linkedin.javads;

import java.util.OptionalInt;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        OptionalInt result =  linearSearchStream(arr,6);
        result.ifPresent(System.out::println);
    }

    private static OptionalInt linearSearchStream(int[] arr, int item) {
       return Arrays.stream(arr).filter(x->x==item).findFirst();
    }
}
