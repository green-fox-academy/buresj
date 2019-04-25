import java.util.HashMap;

public class Letters {

    public HashMap<Character,Integer> count (String string) {

        HashMap<Character,Integer> result = new HashMap<>();
        char[] chari = new char[string.length()];
        int[] occu = new int [string.length()];

        for (int i = 0; i < string.length(); i++) {
            chari[i] = string.charAt(i);
        }
        for (int i = 0; i < chari.length; i++) {
            int counter = 0;
            for (int j = 0; j < chari.length; j++) {
                if(chari[i] == chari[j]) {
                    counter++;
                }
                occu[i] = counter;
            }
        }
        for (int i = 0; i < chari.length; i++) {
            result.put(chari[i], occu[i]);
        }
        return result;
    }
}
