// Write a function that takes a filename as a parameter
// The file contains an ended Tic-Tac-Toe match
// We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
// Return "X", "O" or "Draw" based on the input file

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {

        System.out.println(ticTacResult("win-o.txt"));
        //Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"

    }


    public static String ticTacResult(String name) {

        String result = "Draw";
        Path path = Paths.get("assets/" + name);

        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("Unable to reach a file.");
        }

        int[][] map = new int[lines.size()][lines.size()];
        int[][] mapO = new int[lines.size()][lines.size()];
        int[][] mapX = new int[lines.size()][lines.size()];

        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < lines.size(); j++) {
                map[i][j] = lines.get(i).charAt(j);
            }
        }

        for (int i = 0; i < mapO.length; i++) {
            for (int j = 0; j < mapO.length; j++) {
                if (map[i][j] == 'O') {
                    mapO[i][j] = 1;
                }
                if (map[i][j] == 'X') {
                    mapX[i][j] = 1;
                }
            }
        }

        if (sumMatrix(mapO).contains(3)) {
            result = "O";
        }
        if (sumMatrix(mapX).contains(3)) {
            result = "X";
        }
        return result;
    }

    public static List<Integer> sumMatrix(int[][] matrix) {

        List<Integer> resultMatrix = new ArrayList<>();
        List<Integer> diaL = new ArrayList<>();
        List<Integer> diaR = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;
            int colSum = 0;

            for (int col = 0; col < matrix.length; col++) {
                rowSum += matrix[row][col];
                colSum += matrix[col][row];

                if (row == col) {
                    diaL.add(matrix[row][col]);
                }

                if ((row == 0 && col == matrix.length - 1) ||
                        (col == 0 && row == matrix.length - 1) ||
                        (col == matrix.length / 2 && row == matrix.length / 2)) {
                    diaR.add(matrix[row][col]);
                }
            }
            resultMatrix.add(rowSum);
            resultMatrix.add(colSum);
            resultMatrix.add(sumList(diaL));
            resultMatrix.add(sumList(diaR));
        }
        return resultMatrix;
    }

    public static int sumList(List<Integer> list) {

        int sum = 0;
        for (Integer item : list) {
            sum += item;
        }
        return sum;
    }
}