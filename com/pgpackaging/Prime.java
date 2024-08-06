package com.pgpackaging;

import java.util.Scanner;

public class Prime {

private static boolean checkPrime(int num) {
    int c=2;
    if (num < c) {
        return false;
    }

    while ( c*c < num) {
        if ( num % c == 0) 
            return false;
        c+=1;    
    }
    return true;
}




public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number :");
    int num = scan.nextInt();
    boolean isPrime = checkPrime(num);
    if ( isPrime) 
        System.out.println("Number is "+ num + " prime");
    else 
        System.out.println("Num " + num + " is not prime");

}
}