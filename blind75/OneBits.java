package blind75;

public class OneBits {
    public static void main(String[] args) {
        int n= 3;
        int res = findOne(n);
        System.out.println("Count of 1's bit is : " + res);
    }

    private static int findOne(int n) {
        int cnt=0;
        while ( n!=0) {
            if ( (n&1)==1) cnt++;
            n=n>>1;
        }
        return cnt;
    }
}
