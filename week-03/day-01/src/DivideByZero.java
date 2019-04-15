// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number: ");
        int num = scanner.nextInt();

        try {
            System.out.println(10 / num);
        } catch (ArithmeticException e) {
            System.out.println("You should not divide by zero!!");
        }
    }
}
