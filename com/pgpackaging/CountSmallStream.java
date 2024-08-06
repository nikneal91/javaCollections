package com.pgpackaging;

import java.util.Arrays;
import java.util.List;

public class CountSmallStream {
    
    public static void main(String[] args) {
         List<Integer> numbers = Arrays.asList(1, 5, 8, 3, 2, 9, 4);
        int value = 5;
        long count = numbers.stream()
                            .filter(num -> num < value)
                            .count();
        System.out.println("Count of smaller elements are " + count);
    }
}
