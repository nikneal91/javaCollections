package linkedin.javads;

import java.util.Stack;

public class MatchingParenthesis {
    
    public static void main(String[] args) {
        System.out.println(matching("((algorithm()))"));
        System.out.println(matching("((algorithm())("));
        System.out.println(matching("))algorithm))"));
    }

    private static boolean matching(String input) {
        Stack<Character> st = new Stack<>();
        for (int i=0;i<input.length();i++) {
            if (input.charAt(i) == '(') {
                st.push(input.charAt(i));
            }
            if (input.charAt(i) == ')' && !st.isEmpty()) {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
        
    }
}
