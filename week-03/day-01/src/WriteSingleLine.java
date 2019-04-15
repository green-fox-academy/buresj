// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        List<String> superContent = new ArrayList<>();

        superContent.add("Adding first line");

        try {
            Path filePath = Paths.get("assets/ipsum.txt");
            Files.write(filePath, superContent);
        } catch (Exception e) {
            System.out.println("Unable to write file: ipsum.txt.");
        }
    }
}
