package charsequence;

public class Gnirts implements CharSequence {

    String string;

    public Gnirts(String string) {
        this.string = string;
    }

    public int length() {
        return string.length();
    }

    public char charAt(int index) {
        int num = string.length();
        return string.charAt(num - index);
    }

    public CharSequence subSequence(int indexOne, int indexTwo) {
        return string.subSequence(indexTwo, indexOne);
    }

    public String toString() {
        return string;
    }
}
