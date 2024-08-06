package linkedin.javads;

public class EventIndex {
    public static void main(String[] args) {
        System.out.println("checked index " + isAtEventIndex("HelLo", 'L'));
        System.out.println("checked index " + isAtEventIndex("HelLo", 'l'));
    
    }

    private static boolean isAtEventIndex(String input, char c) {
        if( input==null || input.length() < 1) 
            return false;
        for (int i=0; i < input.length()/2+1 ; i+=2) {
            if ( input.charAt(i)==c)
                return true;
        }
        return false;
    }
}
