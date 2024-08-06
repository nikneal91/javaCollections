package linkedin.javads;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EvenNumberStream {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,67};
        int[] arr2 = {2454, 23453, 546,467,6575,57};
       // printEventStream(arr1,arr2);
        testStreams();
    }

    private static void testStreams() {
     List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Geeks", "For"),
            Arrays.asList("GeeksForGeeks", "A computer portal"),
            Arrays.asList("Java", "Programming")
        );

        // Using Stream flatMap(Function mapper)
        listOfLists.stream()
                   .flatMap(list -> list.stream())
                   .forEach(System.out::println);

    }

    private static void printEventStream(int[] arr1, int[] arr2) {
        IntPredicate isEven = x-> x%2 == 0;
       int[] even= Stream.of(arr1,arr2)
        .flatMapToInt(Arrays::stream)
        .filter(isEven)
        .toArray();   
        
        Arrays.stream(even).forEach(System.out::println);
    
    }
}