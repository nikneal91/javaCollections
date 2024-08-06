package linkedin.javads;

public class Matching {
    
    private static boolean isPasswordComplex(String pwd) {
        return pwd.chars().anyMatch(Character::isUpperCase)
            && pwd.chars().anyMatch(Character::isLowerCase)
            && pwd.chars().anyMatch(Character::isDigit);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello " + isPasswordComplex("Hello") );
        System.out.println("hello2 " + isPasswordComplex("hello2") );
        System.out.println("Hello1 " + isPasswordComplex("Hello1") );        
    }
}
