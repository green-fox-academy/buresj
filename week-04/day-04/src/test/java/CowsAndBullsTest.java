import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CowsAndBullsTest {

    @Test
    public void enterGuess_returnOneCowOneBull() {

        int[] code = {1,2,3,4};
        CowsAndBulls cowsAndBulls = new CowsAndBulls(code);
        List<String> result = cowsAndBulls.guess(1,4,9,9);
        List<String> test = new ArrayList<>();
        test.add("Cow");
        test.add("Bull");

        assertEquals(test, result);
    }
}
