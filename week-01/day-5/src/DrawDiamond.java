// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number: ");
        int num = scanner.nextInt();

        int base = num * 2;
        int increment = 0;
        int decrement = base - 2;

        for (int row = 1; row <= base; row++) {

            for (int column = 0; column <= base; column++) {

                boolean top = column >= num - increment && column <= num + increment;
                boolean bottom = column >= num - decrement && column <= num + decrement;

                if (top && row <= num) {
                    System.out.print("*");
                } else if (bottom && row > num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            increment++;
            decrement--;
        }
    }
}
