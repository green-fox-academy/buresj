import java.util.List;

public class TodoApp {

    public static void main(String[] args) {

        //Constructs needed objects (interface, path to files and written tasks)
        CLI cli = new CLI();
        Task task = new Task();
        DatabaseManager dmanager = new DatabaseManager();

        //Loads all stored tasks
        List<String> tasks = dmanager.load();

        //Constructs main logic operator which handles objects and user input
        Decider decider = new Decider(cli, dmanager, tasks);

        //Runs program by user input
        decider.run(args);
    }
}
