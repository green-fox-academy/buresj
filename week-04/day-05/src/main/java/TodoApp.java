import java.util.ArrayList;
import java.util.List;

public class TodoApp {

    public static void main(String[] args) {

        CLI cli = new CLI();
        Task task = new Task();
        IOManager ioManager = new IOManager("storage.txt");
        List<Task> tasks = task.getTasks(ioManager);

        cli.printMenu();

        if (args[0].equals("-a")) {
            tasks.add(new Task(args[1]));
            ioManager.writeData(tasks);
        }

        if (args[0].equals("-l")) {
            for (Task taski: tasks) {
                System.out.println(taski.getName());
            }
        }
    }
}
