import java.util.ArrayList;
import java.util.List;

public class Task {

    String nameOfTask;


    public Task() {
    }

    public Task(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public List<Task> getTasks(IOManager ioManager) {

        List<Task> tasks = new ArrayList<>();
        List<String> writenTasks = new ArrayList<>(ioManager.readFile());

        for (String line : writenTasks) {
            tasks.add(new Task(line));
        }
        return tasks;
    }

    public void setTasks(Task task) {

    }


    public String getName() {
        return nameOfTask;
    }
}
