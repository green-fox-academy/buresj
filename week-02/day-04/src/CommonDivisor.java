
public class CommonDivisor {
    public static void main(String[] args) {

        System.out.println(commonD(45, 60, 100));
        //15
    }

    public static int commonD(int n, int m, int divisor) {

        if (n%divisor==0 && m%divisor==0 ) {
            return divisor;
        } else {
            return commonD(n,m, divisor - 1);
        }
    }
}
