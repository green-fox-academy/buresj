//Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class StringsAgain {
    public static void main(String[] args) {

        System.out.println(removeX("fdfxf fdax"));
    }

    public static String removeX(String text) {

        int positionX;
        positionX = text.indexOf("x");

        if (positionX == -1) {
            return text;
        } else {
            String lessX = text.substring(0, positionX) + text.substring(positionX + 1);
            return removeX(lessX);
        }
    }
}