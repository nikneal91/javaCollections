package linkedin.javads;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {
    



    public static void main(String[] args) {
        printBinary(5); 
        System.out.println();
        printBinary(10);
        System.out.println();
        printBinary(1);   
    }

    private static void printBinary(int i) {
        if ( i <= 0 )
            return ;
        
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
       for ( int x=0;x<i;x++) {
            int current = qu.remove();
            System.out.println(current);
            qu.add(current*10);
            qu.add(current*10+1);
        }   
    }

}
