// Write a program that opens a file called "my-file.txt", then prints
// each line from the file.
// If the program is unable to read the file (for example it does not exist),
// then it should print the following error message: "Unable to read file: my-file.txt"


import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("assets/lorem.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0));
        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }
    }
}
