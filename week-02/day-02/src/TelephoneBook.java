import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {

        HashMap<String, String> book = new HashMap<>();

        book.put("William A. Lathan", "405-709-1865");
        book.put("John K. Miller", "402-247-8568");
        book.put("Hortensia E. Foster", "606-481-6467");
        book.put("Amanda D. Newland", "319-243-5613");
        book.put("Brooke P. Askew", "307-687-2982");

        System.out.println(book.get("John K. Miller"));

        whoseNumberItIs("307-687-2982", book);
        isSomebodyThere("Chris E. Myers'", book);
    }

    public static void isSomebodyThere(String input, HashMap<String, String> inputBook) {

        boolean checker = false;

        for (Map.Entry<String, String> name : inputBook.entrySet()) {

            if (name.getKey() == input) {
                checker = true;
            } else {
                checker = false;
            }
        }

        if (checker) {
            System.out.println("He or she is in the book.");
        } else {
            System.out.println("He or she is not in the book.");
        }
    }

    public static void whoseNumberItIs(String input, HashMap<String, String> inputBook) {

        for (Map.Entry<String, String> name : inputBook.entrySet()) {

            if (name.getValue() == input) {
                System.out.println(name.getKey());
            }
        }
    }
}
