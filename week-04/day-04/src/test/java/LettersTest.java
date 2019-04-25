import org.junit.Test;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class LettersTest {

    @Test
    public void printDictionary_printsDictionaryOfTest() {

        HashMap<Character, Integer> test = new HashMap<>();
        test.put('t',2);
        test.put('e',1);
        test.put('s',1);

        Letters letters = new Letters();
        HashMap<Character, Integer> result = letters.count("test");
        assertEquals(test,result);
    }
}
