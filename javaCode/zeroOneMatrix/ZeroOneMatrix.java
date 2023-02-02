package javaCode.zeroOneMatrix;

public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        int[][] newMat = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    newMat[i][j] = 0;
                }

                else {
                    newMat[i][j] = shortestDistance(mat, i, j);
                }
            }
        }
        return newMat;
    }

    public int shortestDistance(int[][] matrix, int i, int j) {
        if (i < 0 || i > matrix.length - 1 || j < 0 || j > matrix[0].length - 1) {
            return Integer.MAX_VALUE - matrix.length;
        }

        else if (matrix[i][j] == 0) {
            return 0;
        }

        else {
            return Math.min(
                Math.min(
                    shortestDistance(matrix, i + 1, j) + 1, 
                    shortestDistance(matrix, i, j + 1) + 1
                    ),
                Math.min(
                    shortestDistance(matrix, i - 1, j) + 1,
                    shortestDistance(matrix, i, j - 1) + 1
                ));
        }
    }
}
