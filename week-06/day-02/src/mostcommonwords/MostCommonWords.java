package mostcommonwords;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonWords {

    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        Path filePath = Paths.get("assets/wikiArticle.txt");

        try {
            lines = Files.readAllLines(filePath);
        } catch (Exception e) {
            System.out.println("File is not accessible");
        }


        Map<String, Long> counter = lines.stream()
                .flatMap(line -> Arrays.stream(line.trim().split(" ")))
                .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        //Without reversing the order
        counter.entrySet().stream()
                .limit(100)
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
