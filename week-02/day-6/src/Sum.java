// Create the usual class wrapper and main method on your own.
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

public class Sum {
    public static void main(String[] args) {

        int num = 2;
        int result = sum(num);
        System.out.println(result);
    }

    public static int sum(int x) {

        int y = 0;
        for (int i = 0; i <= x; i++) {

            y += i;
        }

        return y;
    }

}
