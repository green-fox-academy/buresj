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

        String empty = " ";

        for (float line = 1; line <= num; line++) {

                boolean lastLine = num == line;
               // boolean middle = ((num /= 2) == (line /= 2)) ? true : false;

            for (int point = 1; point <= num; point++) {

                if (line == 1 || lastLine) {
                    System.out.print("*");
                }

                else {

                    for (int i = 0; i < ; i++) {

                    }

                }
            }

            System.out.println();

        }
    }
}
