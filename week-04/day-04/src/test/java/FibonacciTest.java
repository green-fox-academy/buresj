import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FibonacciTest {

    @Test
    public void getFibNumFromIndex_getFibSequenceForTen() {

        int[] fibSeq = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        Fibonacci fibonacci = new Fibonacci();
        int counter = 0;
        boolean result = false;

        for (int i = 0; i < fibSeq.length; i++) {
            if (fibonacci.fibIt(i) == fibSeq[i]) {
                counter++;
            }
        }

        if (counter == fibSeq.length) {
            result = true;
        }

        assertEquals(true, result);
    }
}
