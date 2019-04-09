import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

        ArrayList<String> shopList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

        isItInList("milk",shopList);
    }


    public static void isItInList (String input, ArrayList<String> inputList){

        boolean checker = false;

        for (String item:
             inputList) {
            if (item == input) {
                checker = true;
            }
        }

        if (checker) {
            System.out.println("It is there!");
        }else{
            System.out.println("It is not there!");
        }
    }
}
