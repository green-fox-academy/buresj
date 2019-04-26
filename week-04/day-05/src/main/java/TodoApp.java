import java.util.ArrayList;
import java.util.List;

public class TodoApp {

    public static void main(String[] args) {

        CLI cli = new CLI();
        Task task = new Task();
        List<Task> tasks = new ArrayList<>();
        IOManager ioManager = new IOManager("storage.txt");

        cli.printMenu();

//        if (args[0].equals("-a")) {
//            tasks.add(new Task(args[1]));
//        }

        if (args[0].equals("-l")) {
            task.getTasks(ioManager);
        }
    }
}
