import java.util.ArrayList;
import java.util.List;

public class CowsAndBulls {

    int[] code;

    public CowsAndBulls(int[] code) {
        this.code = code;
    }

    public List<String> guess (int one, int two, int three, int four) {

        int[] guess = {one, two, three, four}
        List<String> result = new ArrayList<>();

        for (int i = 0; i < guess.length; i++) {
            for (int j = 0; j < guess.length; j++) {
                if(code[i] == guess[j] && i != j) {
                    result.add("Bull");
                } else if (code[i] == guess[j] && i == j) {
                    result.add("Cow");
                }
            }
        }
        return result;
    }
}
