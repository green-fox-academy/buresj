import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {

        System.out.println(decoded("encoded-lines"));
    }

    public static List<Character> decoded(String fileName) {

        Path path = Paths.get("assets/" + fileName + ".txt");

        List<String> lines = new ArrayList<>();
        char[] alphabet = ("abcdefghijklmnopqrstuvwxyz[ /'ABCDEFGHIJKLMNOPQRSTUVXYZ").toCharArray();
        List<Integer> positions = new ArrayList<>();
        List<Character> charList = new ArrayList<>();
        List<Character> result = new ArrayList<>();
        List<String> res = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("Unable to reach a file.");
        }

        for (String line : lines) {
            for (int i = 0; i < line.length(); i++) {
                charList.add(line.charAt(i));
            }
        }

        for (Character chari : charList) {
            for (int i = 0; i < alphabet.length; i++) {
                if (chari == alphabet[i]) {
                    positions.add(i);
                }
            }
        }

        for (Integer code : positions) {
            for (int i = 0; i < alphabet.length; i++) {
                if (code == 27 && i == 27 || code == 28 && i == 28) {
                    result.add(alphabet[i]);
                } else if (code == i) {
                    result.add(alphabet[i - 1]);
                }
            }
        }

        String string;
        StringBuilder longString = new StringBuilder();

        for (Character chari : result) {
            longString.append(chari);
        }

        string = longString.toString();
        String[] newString = string.split("/");
        Collections.addAll(res, newString);
        saveResult(res, fileName);

        return result;
    }

    public static void saveResult(List<String> result, String fileName) {

        fileName = fileName.concat("-decrypted");
        Path path = Paths.get("assets/" + fileName + ".txt");

        try {
            Files.write(path, result);
        } catch (Exception e) {
            System.out.println("Unable to save a file.");
        }
    }
}
