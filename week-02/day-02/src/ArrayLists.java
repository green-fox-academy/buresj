import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    public static void main(String[] args) {

        // Create a new arraylist
        // ArrayList arrayList = new ArrayList();
        ArrayList<String> animals = new ArrayList<>();
        //List<String> animals2 = new ArrayList<>();
        //String[] animals2 = {"pig", "cow"};

        // Add items
        animals.add("Dog");
        animals.add("Cat");

        System.out.println(animals);
        //System.out.println(animals2);

        // What to do if I want to add a pigeon to the first place?
        animals.add(0, "Pigeon");
        System.out.println(animals);

        // What if I already have a list that I want to add
        ArrayList<String> newAnimals = new ArrayList<>(Arrays.asList("Fox", "Frog", "Wolf"));
        animals.addAll(newAnimals);
        System.out.println(animals);

        // How to remove the second element?
        animals.remove(1);
        System.out.println(animals);

        animals.remove("Frog");
        System.out.println(animals);

        // I want to set the first value to "tiger
        animals.set(0,"tiger");
        System.out.println(animals);

        // I want to know if my list contains "bear"
        System.out.println(animals.contains("bear"));

        // I want to use these data in an array!
        String[] animalsArray = animals.toArray(new String[0]);

        // Delete content
        animals.clear();
        System.out.println("After clearing: " + animals);


    }
}