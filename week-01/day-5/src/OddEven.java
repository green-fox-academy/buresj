import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Is this number odd or even?");

        int numberIn = scanner.nextInt();

        numberIn %= 2;

        if (numberIn == 0) {

            System.out.println("Even!");
        } else {

            System.out.println("Odd!");
        }
    }
}


