public class CLI {

    public void printMenu() {
        System.out.println("COMMAND LINE TO-DO APPLICATION");
        System.out.println("=============================");
        System.out.println();
        System.out.println("-l   Lists all the tasks");
        System.out.println("-lo  Lists all unfinished tasks");
        System.out.println("-lx  Lists all finished tasks");
        System.out.println("-a   Adds a new task");
        System.out.println("-r   Removes a task");
        System.out.println("-c   Completes a task");
    }
}
