// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Give me number and I make triangle from it: ");
        //int num = scanner.nextInt();

        int num = 5;
        int size = num;

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int row = 0; row <= num; row++) {
            size--;

            for (int column = 0; column <= size; column++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
