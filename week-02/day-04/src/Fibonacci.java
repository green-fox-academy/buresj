//0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibIt(2));
    }

    public static int fibIt (int n) {

        if (n == 1) {
            return 0;
        } else {
            return (n - 2) - (fibIt(n - 1));
        }
    }
}
