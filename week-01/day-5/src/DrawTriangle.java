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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me number and I make triangle from it: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*
        for (int i = 1; i <= num; i++) {

            for (int j = 0; j <= num ; j++) {
                System.out.print("*");
            }

        }
*/
    }
}
