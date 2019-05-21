import java.util.List;

public class TodoApp {

    public static void main(String[] args) {

        //Constructs needed objects (interface, path to files and written tasks)
        CLI cli = new CLI();
        Task task = new Task();
        IOManager ioManager = new IOManager("tasks.txt");

        //Loads all stored tasks
        List<Task> tasks = task.getTasks(ioManager);

        //Constructs main logic operator which handles objects and user input
        Decider decider = new Decider(cli, ioManager, tasks);

        //Runs program by user input
        decider.run(args);
    }
}
