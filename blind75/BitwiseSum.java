package blind75;

public class BitwiseSum {
    public static void main(String[] args) {
        int a = add(10, 2);
        System.out.print(a);
    }

    private static int add(int a, int b) {
        while ( b!=0) {
            int carry = a&b;
            System.out.println("carry " + carry);
            a=a^b;
            System.out.println("a " + a);
            b=carry << 1;
            System.out.println("b " + b);
        }
        return a;
    }
}
