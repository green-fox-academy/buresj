//0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibIt(10));
    }

//    public static int fibIt(int n) {
//
//        if (n <= 1) {
//            return n;
//        } else {
//            return fibIt(n - 1) + fibIt(n - 2);
//        }
//    }

    public static int fibIt(int n) {

        System.out.println("------------------");

        if (n <= 1) {
            System.out.println("if result: " + n);
            return n;
        } else {
            System.out.println("else result: " + n);
            return (fibIt(n - 1)) + fibIt(n - 2);
        }
    }
}
