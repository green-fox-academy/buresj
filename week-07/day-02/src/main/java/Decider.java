import java.util.List;

public class Decider {

    CLI cli;
    DatabaseManager dmanager;
    List<String> tasks;

    public Decider(CLI cli, DatabaseManager dmanager, List<String> tasks) {
        this.cli = cli;
        this.dmanager = dmanager;
        this.tasks = tasks;
    }

    public void run(String[] args) {

        if (args.length == 0) {
            cli.printMenu();
            return;
        }

/*        //-a   Adds a new task
        if (args[0].equals("-a")) {
            try {
                tasks.add(new Task(args[1]));
                dmanager.save(tasks);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Unable to add: no task provided!");
            }
        }*/

       //-l   Lists all the tasks

        if (args[0].equals("-l")) {

            for (String taski : tasks) {
                System.out.println(taski);
            }
        }

        /*
        //-lo  Lists all unfinished tasks
        if (args[0].equals("-lo")) {
            int counter = 1;

            for (Task taski : tasks) {
                if (!taski.isFinished()) {
                    System.out.println(counter + ". " + taski.getName());
                    counter++;
                }
            }
        }

        //lx  Lists all finished tasks
        if (args[0].equals("-lx")) {
            int counter = 1;

            for (Task taski : tasks) {
                if (taski.isFinished()) {
                    System.out.println(counter + ". " + taski.getName());
                    counter++;
                }
            }
        }

        //-c   Completes a task
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

        //-r   Removes a task
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
        }*/
    }
}
