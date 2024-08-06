package linkedin.javads;

public class Normalize {
    
    private static String normalize(String input) {
        return input.toLowerCase().trim().replace(",", "");
    }
    
    public static void main(String[] args) {
    System.out.println("Hello , there , BDDYDF" + " --> " + normalize("Hello , there , BDDYDF"));        

    }
}
