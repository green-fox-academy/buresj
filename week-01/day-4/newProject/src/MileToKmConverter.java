import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilometers: ");

        float userInput1 = scanner.nextFloat();

        userInput1 *= 0.621371;

        System.out.println("Miles: " + userInput1);

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it


    }
}
