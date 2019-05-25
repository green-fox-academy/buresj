import java.util.List;

public class Count {

    public int sum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;

    }
}
