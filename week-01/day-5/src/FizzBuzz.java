// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            int fizz = i % 3;
            int buzz = i % 5;

            if (fizz == 0 && buzz == 0) {
                System.out.println("FizzBuzz");
            } else if (fizz == 0) {

                System.out.println("Fizz");
            } else if (buzz == 0) {

                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
