import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {


        System.out.println(decryptIt("duplicated-chars"));

    }

    public static List<String> decryptIt(String nameFile) {

        Path path = Paths.get("assets/" + nameFile + ".txt");

        List<String> lines = new ArrayList<>();
        List<Character> charList = new ArrayList<>();
        List<String> result = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("Unable to reach a file.");
        }


        for (String line : lines) {

            line = line.concat("!");

            for (int i = 0; i < line.length(); i++) {
                if (i % 2 == 0) {
                    charList.add(line.charAt(i));
                }
                if (line.equals("!")) {
                    charList.add(i, '!');
                }
            }
        }

        String string;
        StringBuilder longString = new StringBuilder();

        for (Character chari : charList) {
            longString.append(chari);
        }

        string = longString.toString();

        String[] newString = string.split("!");

        Collections.addAll(result, newString);
        result.remove(0);

        saveResult(result, nameFile);

        return result;
    }

    public static void saveResult(List<String> result, String nameFile) {

        nameFile = nameFile.concat("-decrypted");
        Path path = Paths.get("assets/" + nameFile + ".txt");

        try {
            Files.write(path, result);
        } catch (Exception e) {
            System.out.println("Unable to save a file.");
        }
    }
}
