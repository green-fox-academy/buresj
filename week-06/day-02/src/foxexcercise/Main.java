//        Write a Stream Expression to find the foxes with green color!
//        Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//        Write a Stream Expression to find the frequency of foxes by color!

package foxexcercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Fox> foxes = Arrays.asList(
                new Fox("Foxa", "blue", 10),
                new Fox("Foxi", "green", 12),
                new Fox("Foxe", "green", 2),
                new Fox("Foxu", "black", 4),
                new Fox("Foxo", "white", 6)
        );

        List<Fox> greenFoxes = foxes.stream()
                .filter(fox -> fox.color.equals("green"))
                .collect(Collectors.toList());

        List<Fox> greenYoungFoxes = foxes.stream()
                .filter(fox -> fox.color.equals("green") && fox.getAge() < 5)
                .collect(Collectors.toList());

        Map<String, Long> color = foxes.stream()
                .collect(Collectors.groupingBy(f -> f.getColor(), Collectors.counting()));

        System.out.println(color);
    }
}
