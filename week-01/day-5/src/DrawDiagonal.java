// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me number: ");
        int num = scanner.nextInt();

        for (int row = 1; row <= num; row++) {
            boolean lastRow = num == row;

            for (int column = 1; column <= num; column++) {
                boolean lastColumn = num == column;

                if (row == 1 || lastRow) {
                    System.out.print("*");
                } else if (column == 1 || lastColumn) {
                    System.out.print("*");
                } else if (column == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}





