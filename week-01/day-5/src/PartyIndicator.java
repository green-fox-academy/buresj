import java.util.Scanner;

public class PartyIndicator {

        public static void main(String[] args) {

            // Write a program that asks for two numbers

            Scanner scanner = new Scanner(System.in);

            // The first number represents the number of girls that comes to a party, the
            // second the boys.

            System.out.println("Give me number of boys that comes to a party: ");
            int boysTotal = scanner.nextInt();

            System.out.println("Give me number of girls that comes to a party:: ");
            int girlsTotal = scanner.nextInt();

            int sum = boysTotal + girlsTotal;
            boolean equality = girlsTotal == boysTotal;

            if (sum >= 20 && equality) {

                System.out.println("The party is excellent!");
            }

            else if (sum >= 20 && girlsTotal >= 1) {

                System.out.println("Quite cool party!");
            }

            else if (sum < 20) {

                System.out.println("Average party...");
            }

            else if (girlsTotal == 0) {

                System.out.println("Sausage party");
            }

// It should print: The party is excellent!
// If the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

        }

}
