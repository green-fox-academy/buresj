// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number: ");
        int num = scanner.nextInt();

        for (int row = 1; row <= num; row++) {

            for (int column = 1; column <= num; column++) {

                float testColumn = column;
                float testRow = row;

                boolean evenColumn = (testColumn %= 2) == 0;
                boolean evenRow = (testRow %= 2) == 0;

                if (evenRow) {
                    if (evenColumn) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (!evenColumn) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
