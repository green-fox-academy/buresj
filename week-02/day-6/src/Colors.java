// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`
//

public class Colors {
    public static void main(String[] args) {

//        String shadesOfGreen[] = {"lime", "forest green", "olive", "pale green", "spring green"};
//        String shadesOfRed[] = {"orange red", "red", "tomato"};
//        String shadesOfPink[] = {"orchid", "violet", "pink", "hot pink"};

        String colors[][] = new String[2][5];

        colors[0][0] = "green";
        colors[1][0] = "red";
        colors[2][0] = "pink";

        colors[0][1] = "lime";
        colors[0][2] = "fores green";
        colors[0][3] = "olive";
        colors[0][4] = "pale green";
        colors[0][5] = "spring";

        colors[1][1] = "orange red";
        colors[1][2] = "red";
        colors[1][3] = "tomato";

        colors[2][1] = "orchid";
        colors[2][2] = "violet";
        colors[2][3] = "pink";
        colors[2][4] = "hot pink";
    }
}
