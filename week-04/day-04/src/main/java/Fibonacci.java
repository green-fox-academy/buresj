public class Fibonacci {

    public int fibIt(int n) {

        if (n <= 1) {
            return n;
        } else {
            return (fibIt(n - 1)) + fibIt(n - 2);
        }
    }
}
