// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number: ");
        int num = scanner.nextInt();

        int base = num * 2;
        int increment = 0;

        for (int row = 1; row <= num; row++) {

            for (int column = 0; column <= base; column++) {
                boolean sides = column >= num - increment && column <= num + increment;

                if (sides) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            increment++;
        }
    }
}
