package linkedin.javads;

import java.util.Scanner;

public class ValidationAlgorithm {

    private static boolean isUpperCase(String input) {
        return input.chars().allMatch(Character::isUpperCase);
    }

    private static boolean isAnyUpperCase(String input) {
        return input.chars().anyMatch(Character::isUpperCase);
    }

    public static void main(String[] args) {
        System.out.println("Enter an input string");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Entered input has all uppercase value " + isUpperCase(input));
        System.out.println("Entered input has any uppercase character " + isAnyUpperCase(input));

    }
}
