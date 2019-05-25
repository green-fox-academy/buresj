import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CowsAndBullsTest {

    @Test
    public void enterGuess_returnOneCowOneBull() {

        int[] code = {1, 2, 3, 4};
        CowsAndBulls cowsAndBulls = new CowsAndBulls(code);
        List<String> result = cowsAndBulls.guess(1, 4, 9, 9);
        List<String> test = new ArrayList<>();
        test.add("Cow");
        test.add("Bull");

        assertEquals(test, result);
    }

    @Test
    public void enterWrongGuess_returnEmptyList() {

        int[] code = {1, 2, 3, 4};
        CowsAndBulls cowsAndBulls = new CowsAndBulls(code);
        List<String> result = cowsAndBulls.guess(6, 6, 6, 6);
        List<String> test = new ArrayList<>();

        assertEquals(test, result);
    }

    @Test
    public void enterPerfectGuess_returnFourCows() {

        int[] code = {1, 2, 3, 4};
        CowsAndBulls cowsAndBulls = new CowsAndBulls(code);
        List<String> result = cowsAndBulls.guess(1, 2, 3, 4);
        List<String> test = new ArrayList<>();
        test.add("Cow");
        test.add("Cow");
        test.add("Cow");
        test.add("Cow");

        assertEquals(test, result);
    }
}
