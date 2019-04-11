//Given a non-negative int n, return the sum of its digits recursively (no loops)
//        Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
//        while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class SumDigits {
    public static void main(String[] args) {

        System.out.println(digitSum(12345));
    }

    public static int digitSum(int n) {

        int counter = n;
        n %= 10;

        if (n <= 1) {
            return 1;
        } else {
            return n + digitSum(counter /= 10);
        }
    }
}