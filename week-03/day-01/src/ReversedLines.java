import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {

        System.out.println(reverseLines(getFile("reversed-lines")));
        System.out.println(reverseOrder(getFile("reversed-order")));

    }

    public static List<String> getFile(String fileName) {

        Path path = Paths.get("assets/" + fileName + ".txt");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("Unable to reach a file.");
        }

        return lines;
    }

    public static List<String> reverseLines(List<String> lines) {

        List<String> result = new ArrayList<>();

        for (String line : lines) {
            StringBuilder newLine = new StringBuilder();
            newLine.append(line).reverse();
            result.add(newLine.toString());
        }
        return result;
    }

    public static List<String> reverseOrder(List<String> lines) {

//        List<String> result = new ArrayList<>();
        //Solution 1
//        for (int i = 0; i < lines.size(); i++) {
//            result.add(lines.get((lines.size() - 1) - i));
//        }
//        return result;

        //Solution 2
//        for (int i = lines.size() - 1; i > 0; i--) {
//            result.add(lines.get(i));
//        }
//        return result;

        Collections.reverse(lines);
        return lines;
    }
}
