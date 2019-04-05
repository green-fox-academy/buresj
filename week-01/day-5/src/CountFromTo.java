// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me first number ");
        int numOne = scanner.nextInt();

        System.out.println("Give me second number ");
        int numTwo = scanner.nextInt();

        if (numOne > numTwo) {
            System.out.println("The second number should be bigger");
        }

        else{

            int dif = numTwo - numOne;

            for (int i = 0; i < dif; i++) {

                System.out.println(numOne + i);
            }
        }

    }
}
