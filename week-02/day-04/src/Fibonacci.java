//0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibIt(10));
    }

    public static int fibIt (int n) {

        if (n <= 0) {
            return 1;
        } else {
            return n + fibIt(fibIt(n - 1) - 1);
        }
    }
}
