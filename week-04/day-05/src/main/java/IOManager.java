import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOManager {

        Path path;

        public IOManager(String fileName) {
            this.path = Paths.get("assets/" + fileName);
        }

        public List<String> readFile() {
            List<String> content = new ArrayList<>();
            try {
                content = Files.readAllLines(this.path);
            } catch (IOException e) {
                System.out.println("Cannot read file");
            }
            return content;
        }

        public void writeData(List<Task> data) {

            List<String> stringyList = new ArrayList<>();

            for (Task task: data) {
                stringyList.add(task.getName());
            }

            try {
                Files.write(path, stringyList);
            } catch (IOException e) {
                System.out.println("Cannot write file.");
            }
            System.out.println("Task stored");
        }
    }