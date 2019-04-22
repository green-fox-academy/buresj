import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {

    public static void main(String[] args) {

        printFive("lottery");

    }

    public static void printFive(String fileName) {

        Path path = Paths.get("assets/" + fileName + ".txt");

        List<String> lines = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        List<String> collector = new ArrayList<>();
        List<String[]> numbersStringy = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        HashMap<String, Integer> score = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            String num = Integer.toString(i);
            numbers.add(num);
            score.put(num, 0);
        }

        try {
            lines = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("Unable to reach a file: " + fileName);
        }

        for (String line : lines) {
            collector.add(line.substring(line.length() - 15));
        }

        for (String subLine : collector) {

            subLine = subLine.replace("t", "");
            subLine = subLine.replace("F", "");
            subLine = subLine.substring(1);

            numbersStringy.add(subLine.split(";"));
        }

        for (String[] block : numbersStringy) {
            for (int i = 0; i < block.length; i++) {
                for (int j = 0; j < numbers.size(); j++) {
                    if (block[i].equals(numbers.get(j))) {
                        int value = score.get(block[i]);
                        value++;
                        score.replace(block[i], value);
                    }
                }
            }
        }

        int[] scores = new int[score.size()];
        int i = 0;

        for (Map.Entry<String, Integer> value : score.entrySet()) {
            scores[i] = value.getValue();
            i++;
        }

        Arrays.sort(scores);

        for (Map.Entry<String, Integer> value : score.entrySet()) {
            if (scores[score.size() - 1] == value.getValue()) {
                System.out.println(value.getKey());
            }
            if (scores[score.size() - 2] == value.getValue()) {
                System.out.println(value.getKey());
            }
        }
    }
}
