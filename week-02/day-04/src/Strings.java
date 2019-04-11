//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

public class Strings {
    public static void main(String[] args) {

        System.out.println(changeToY("xfdxxfd f afdafx"));
    }


    public static String changeToY(String text) {

        int positionX;
        positionX = text.indexOf("x");
        char[] letters = text.toCharArray();

        if (positionX == -1) {
            return text;
        } else {
            letters[positionX] = 'y';
            String xtext = new String(letters);
            return changeToY(xtext);
        }
    }
}
