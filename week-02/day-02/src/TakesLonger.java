// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String title = quote.substring(0, 17);

        String firstCut = quote.substring(18, 20);
        String secondCut = quote.substring(20, 32);

        String firstSentence = firstCut + " always takes longer than" + secondCut;
        String secondSentence = quote.substring(33);

        System.out.println(title + " " + firstSentence + " " + secondSentence);
    }
}