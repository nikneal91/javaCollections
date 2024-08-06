package com.pgpackaging;

import java.util.Arrays;



public class PallArray {


    private static int reverseInt(int num) {
        System.out.println("Num " + num);
        int rev=0;
        while ( num > 0) {
            rev = (rev*10)+(num%10);
            num = num/10;
        }
        System.out.println("Reverse  " + rev); 
        return rev;
    }

    private static boolean isPailArrayElement(int element) {
        return  (element == reverseInt(element)) ? true : false;
    }

    private static boolean checkPailArray(int[] arguments) {
        boolean result = true;
        for (int i : arguments) {
            if ( !isPailArrayElement(i)) 
                result=false;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arguments = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
     //   Arrays.stream(arguments).forEach(System.out::println);
        boolean isPailArray = checkPailArray(arguments);   
        System.out.println("isPailArray " + isPailArray);     
    }

}
