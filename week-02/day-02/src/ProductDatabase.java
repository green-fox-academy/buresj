import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<>();

        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        price("Milk", products);
        expensive(products);
        average(products);
        underThreeHundred(products);
        oneHundredTwentyFive(products);
        cheapest(products);
    }


    public static void price(String product, HashMap<String, Integer> database) {

        for (Map.Entry<String, Integer> value : database.entrySet()) {
            if (value.getKey() == product) {
                System.out.println("The price of " + product + " is: " + value.getValue());
            }
        }
    }

    public static void expensive(HashMap<String, Integer> database) {

        int[] prices = new int[database.size()];
        int i = 0;

        for (Map.Entry<String, Integer> value : database.entrySet()) {
            prices[i] = value.getValue();
            i++;
        }

        Arrays.sort(prices);

        System.out.println(prices[database.size() - 1]);
    }

    public static void average(HashMap<String, Integer> database) {

        int sum = 0;

        for (Map.Entry<String, Integer> value : database.entrySet()) {
            sum += value.getValue();
        }

        System.out.println(sum / database.size());
    }

    public static void underThreeHundred(HashMap<String, Integer> database) {

        int counter = 0;

        for (Map.Entry<String, Integer> value : database.entrySet()) {
            if (value.getValue() < 300) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void oneHundredTwentyFive(HashMap<String, Integer> database) {

        int counter = 0;

        for (Map.Entry<String, Integer> value : database.entrySet()) {
            if (value.getValue() == 125) {
                counter++;
            }
        }
        System.out.println("You can buy for 125 as many products: " + counter);
    }

    public static void cheapest(HashMap<String, Integer> database) {

        int[] prices = new int[database.size()];
        int i = 0;

        for (Map.Entry<String, Integer> value : database.entrySet()) {
            prices[i] = value.getValue();
            i++;
        }

        Arrays.sort(prices);

        for (Map.Entry<String, Integer> value : database.entrySet()) {
            if (prices[0] == value.getValue()) {
                System.out.println(value.getKey());
            }
        }
    }
}
