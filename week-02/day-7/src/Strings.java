import java.sql.SQLOutput;

public class Strings {
    public static void main(String[] args) {
        // What is an object?
        // How do you recognize an object?
        String ourClass = "Siesta class";

        // Check equality
        String another = "Siesta class";
        System.out.println(ourClass.equals(another));

        // Starts with a charatcer
        System.out.println(ourClass.startsWith("S"));

        // Change cases
        System.out.println(ourClass.toUpperCase());
        System.out.println(ourClass);

        // Get the length
        System.out.println(ourClass.length());

        // Cut off the first three character
        System.out.println(ourClass.substring(2,5));

        // How to replace content?
        ourClass = ourClass.replace("S", "p");
        System.out.println(ourClass.replace("s", "p"));

        // Get a character from a given position
        System.out.println(ourClass.charAt(1));

        // Check if if contains a set of characters
        System.out.println(ourClass.contains("ie"));


        System.out.println("------------------");

        // Split the text by space
        String[] splitted = ourClass.split(" ");
        for (String word :splitted) {
            System.out.print(word);
        }

        System.out.println("Number of words" + splitted.length);

        // Put together:
        String together = "";
        for (String word :splitted) {
            together += word;
        }
        System.out.println(together);

        System.out.println(ourClass.replace("a", ""));
    }
}