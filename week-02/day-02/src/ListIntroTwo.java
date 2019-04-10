import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroTwo {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        ArrayList<String> listB = new ArrayList<>();
        listB.addAll(listA);

        System.out.println(listA.contains("Durian"));

        listB.remove("Durian");

        listA.set(4,"Kiwifruit");

        System.out.println(listA.equals(listB));

        System.out.println(listA.indexOf("Avocado"));

        System.out.println(listB.indexOf("Durian"));

        listB.addAll(Arrays.asList("Passion fruit", "Pummelo"));

        System.out.println(listB);

        System.out.println(listA.get(3));
    }
}
