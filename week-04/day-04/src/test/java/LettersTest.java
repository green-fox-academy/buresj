import org.junit.Test;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class LettersTest {

    @Test
    public void printDictionaryOfAWord_getsDictionaryOfWordTest() {

        HashMap<Character, Integer> test = new HashMap<>();
        test.put('t',2);
        test.put('e',1);
        test.put('s',1);

        Letters letters = new Letters();
        HashMap<Character, Integer> result = letters.count("test");
        assertEquals(test,result);
    }

    @Test
    public void printDictionaryOfAWord_getsDictionaryOfWordSummary() {

        HashMap<Character, Integer> test = new HashMap<>();
        test.put('s',1);
        test.put('u',1);
        test.put('m',2);
        test.put('a',1);
        test.put('r',1);
        test.put('y',1);

        Letters letters = new Letters();
        HashMap<Character, Integer> result = letters.count("summary");
        assertEquals(test,result);
    }
}
