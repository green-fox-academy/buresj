// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {

        copyFromFileToFile("ipsum.txt", "lorem.txt");
    }

    public static void copyFromFileToFile(String fileOne, String fileTwo) {

        Path pathOne = Paths.get("assets/" + fileOne);
        Path pathTwo = Paths.get("assets/" + fileTwo);

        try {
            List<String> contentOne = Files.readAllLines(pathOne);

            Files.write(pathTwo, contentOne);

            List<String> contentTwo = Files.readAllLines(pathTwo);
            boolean success = contentOne.equals(contentTwo);

            if (success) {
                System.out.println("Copied!");
            }
        } catch (Exception e) {
            System.out.println("Unable to reach a file.");
        }
    }
}
