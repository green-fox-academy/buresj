import java.util.HashMap;

public class MapIntro {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");


        for (Integer keys :
                map.keySet()) {
            System.out.println(keys);
        }

        for (String content :
                map.values()) {
            System.out.println(content);
        }

        map.put(68, "D");

        System.out.println(map.size());

        System.out.println(map.get(99));

        map.remove(97);

        if (map.get(100) == null) {
            System.out.println("Nothing there!");
        }

        map.clear();
    }
}
