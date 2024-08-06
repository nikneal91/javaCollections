package com.pgpackaging;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        if ( args.length > 0) {
            Arrays.stream(args).forEach(System.out::println);
        }
    }
}
