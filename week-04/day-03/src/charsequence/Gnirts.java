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
        int num = string.length() - 1;
        return string.subSequence(num - indexOne, num - indexTwo);
    }

    public String toString() {
        return string;
    }
}
