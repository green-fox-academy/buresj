public class NumberAdder {

    public static void main(String[] args) {

        System.out.println(adding(5));
        System.out.println(5 + 4 + 3 + 2 + 1);
    }

    public static int adding(int n) {

        if (n <= 1) {
            return 1;
        } else {
            return n + adding(n - 1);
        }
    }
}