import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    String firstWord;
    String secondWord;

    public Anagram(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    public boolean isAnagram() {

        boolean result = false;

        char[] charsOne = new char[firstWord.length()];
        char[] charsTwo = new char[secondWord.length()];

        for (int i = 0; i < firstWord.length(); i++) {
            charsOne[i] = firstWord.charAt(i);
        }
        for (int i = 0; i < secondWord.length(); i++) {
            charsTwo[i] = (secondWord.charAt(i));
        }

        Arrays.sort(charsOne);
        Arrays.sort(charsTwo);

        result = Arrays.equals(charsOne, charsTwo);

        return result;
    }
}
