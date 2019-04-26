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
                tasks.add(new Task("[ ]" + " " + args[1]));
                ioManager.writeData(tasks);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Unable to add: no task provided!");
            }
        }

        if (args[0].equals("-l")) {
            for (Task taski : tasks) {
                System.out.println(taski.getStatus());
            }
        }

        if (args[0].equals("-c")) {

            int completedIndex = Integer.parseInt(args[1]) - 1;
            String name = tasks.get(completedIndex).getName();
            name = name.substring(4);

            tasks.remove(completedIndex);
            tasks.add(new Task("[X]" + " " + name));
            ioManager.writeData(tasks);

            if (completedIndex > tasks.size()) {
                System.out.println("No task founded");
                System.out.println("You have only " + tasks.size() + " tasks");
            }
        }

        if (args[0].equals("-r")) {

            int removeIndex;

            try {
                removeIndex = Integer.parseInt(args[1]) - 1;

                if (removeIndex > tasks.size()) {
                    System.out.println("No task founded");
                    System.out.println("You have only " + tasks.size() + " tasks");
                } else {
                    try {
                        tasks.remove(removeIndex);
                        ioManager.writeData(tasks);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Unable to remove: no task provided!");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Unable to remove: index is not a number");
            }
        }
    }
}
