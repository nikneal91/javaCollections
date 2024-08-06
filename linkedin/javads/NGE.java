package linkedin.javads;

import java.util.Arrays;
import java.util.Stack;

public class NGE {
    
    public static void main(String[] args) {
        System.out.println("Next Greater Element");
        int[] arr = {16,7,2,15};
        int[] res =printNGE(arr);
        for (int x=0;x<arr.length;x++) {
            System.out.println(arr[x]+ " --> " + res[x]);
        }
    }

    private static int[] printNGE(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        st.push(arr[arr.length-1]);
        System.out.println(st.peek() + "-->" + "-1");
        res[n-1]=-1;
        for ( int i=arr.length-2;i>=0;i--) {
        while ( !st.isEmpty() && st.peek() <= arr[i]) {
            st.pop();
        }

        if ( !st.isEmpty()) {
            res[i]=st.peek();
            System.out.println(arr[i]+" --> " + st.peek() );
        } else {
            res[i]=-1;
            System.out.println(arr[i]+" --> " + "-1" );
        }

        st.push(arr[i]);
    }
        return res;
    }
}
