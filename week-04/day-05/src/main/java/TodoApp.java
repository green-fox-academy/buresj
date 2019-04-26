import java.io.IOException;
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
            try {
                tasks.add(new Task(args[1]));
                ioManager.writeData(tasks);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Unable to add: no task provided!");
            }
        }

        if (args[0].equals("-l")) {
            for (Task taski : tasks) {
                System.out.println(taski.getName());
            }
        }
    }
}
