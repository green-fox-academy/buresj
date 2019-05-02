/*
Create a function named rotateMatrix that takes an n×n integer matrix (array of arrays)
        as parameter and returns a matrix which elements are rotated 90 degrees clockwise.

Input
        [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
        ]

Output
        [
        [ 7, 4, 1 ],
        [ 8, 5, 2 ],
        [ 9, 6, 3 ]
        ]

Model solution (sort of)
*/

import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {

        int[][] test = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.deepToString(rotateMatrix(test)));
    }

    public static int[][] rotateMatrix(int[][] inMatrix) {

        int[][] rotatedMatrix = new int[inMatrix.length][inMatrix.length];

        for (int i = 0; i < inMatrix.length; i++) {
            for (int j = 0; j < inMatrix[0].length; j++) {
                rotatedMatrix[j][(rotatedMatrix.length - 1) - i] = inMatrix[i][j];
            }
        }
        return rotatedMatrix;
    }
}
