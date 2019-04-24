package charsequence;

public class Shifter implements CharSequence {

    String string;
    int num;

    public Shifter(String string, int num) {
        this.string = string;
        this.num = num;
    }

    public int length() {
        return string.length();
    }

    public char charAt(int index) {
        return string.charAt(num - index);
    }

    public CharSequence subSequence(int indexOne, int indexTwo) {
        return string.subSequence(indexTwo, indexOne);
    }

    public String toString() {
        return string;
    }

}

