import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class AnagramTest {

    @Test
    public void initAnagram_initedAnagram() {
        Anagram anagram = new Anagram("test","sett");
        assertNotNull(anagram);
    }

    @Test
    public void testIfAnagram_trueIfAnagram() {

        boolean result;
        Anagram anagram = new Anagram("test","sett");
        result = anagram.isAnagram();

        assertEquals(true,result);
    }
}
