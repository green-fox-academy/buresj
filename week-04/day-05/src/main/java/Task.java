import java.util.ArrayList;
import java.util.List;

public class Task {

    String nameOfTask;

    public Task(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public Task() {
    }

    public void getTasks(IOManager ioManager) {

        List<String> tasks = new ArrayList<>(ioManager.readFile());
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
