// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo


public class ToDoPrint {
    public static void main(String... args){

        String todoText = "My todo: \n" + "- Buy milk\n" + "- Dowload games\n" + "\t- Diablo";

        System.out.println(todoText);
    }
}