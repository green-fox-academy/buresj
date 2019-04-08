// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class DiagonalMatrix {
    public static void main(String[] args) {

        int table[][] = new int[4][4];

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table.length; j++) {

                int x = 0;
                int y = 0;

                if (i == j) {
                    table[x][y] = 1;
                } else {
                    table[x][y] = 0;
                }

                System.out.print(table[x][y]);
            }

            System.out.println();
        }
    }
}
