import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class AppleTest {

    @Test
    public void initialiseNewApple_toBeInitialised() {
        Apple apple = new Apple();
        assertNotNull(apple);
    }

    @Test
    public void printStringApple_toPrint() {
        Apple apple = new Apple();
        String result = apple.getApple();

        assertEquals("apple",result);
    }
}