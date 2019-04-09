import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {

        ArrayList<Integer> budget = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        int sum = 0;

        for (int items: budget) {
            sum += items;
        }
        System.out.println("We have spent: " + sum);

        Collections.sort(budget);
        System.out.println("Lowest spending: " + budget.get(0));

        System.out.println("Average spending for an item: " + sum/budget.size());
    }
}
