import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class CountTest {

    @Test
    public void initCount_initedCount() {
        Count count = new Count();
        assertNotNull(count);
    }

    @Test
    public void sumNumList_returnSum() {
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        Count count = new Count();
        int result = count.sum(nums);

        assertEquals(6, result);
    }

    @Test
    public void enterEmptyList_returnZero() {
        List<Integer> nums = new ArrayList<>();

        Count count = new Count();
        int result = count.sum(nums);

        assertEquals(0, result);
    }

    @Test
    public void enterOneSizeList_returnOneNum() {
        List<Integer> nums = new ArrayList<>();

        nums.add(1);

        Count count = new Count();
        int result = count.sum(nums);

        assertEquals(1, result);
    }
}
