// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        int number = 5;
        boolean guess = false;

        while (!guess) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Guess my number: ");
            int inputNum = scanner.nextInt();

            if (inputNum == number) {

                System.out.print("You have guessed it right!");
                guess = true;

            }

        }

    }

}


