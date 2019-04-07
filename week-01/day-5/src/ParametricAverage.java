// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter;
        float first = 0;
        float second = 0;
        float third = 0;

        for (counter = 0; counter < 3; counter++) {

            System.out.println("Give me number: ");

            switch (counter) {
                case 0:
                    first = scanner.nextInt();
                    break;
                case 1:
                    second = scanner.nextInt();
                    break;
                case 2:
                    third = scanner.nextInt();
                    break;
            }
        }

        float sum = first + second + third;
        float average = sum / counter;

        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.print("Sum: " + sum + ", average: " + numberFormat.format(average));
    }
}

