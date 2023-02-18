package javaCode.spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> answer = new ArrayList<Integer>();
        int cycle = 0;
        int cycleLength = 0;
        int startRowCol = 0;

        if (matrix.length == 1) {
            for (int i = 0; i < matrix[0].length; i++) {
                answer.add(matrix[0][i]);
            }
            return answer;
        }

        while (answer.size() < (matrix.length * matrix[0].length)) {
            if (cycle == 4) { 
                cycleLength = (matrix.length * matrix[0].length % 2 == 0) ? cycleLength + 2: cycleLength + 1;
                cycle = 0;
                startRowCol++;
            }

            for (int i = 0; i < matrix[0].length - 1 - cycleLength; i++) {
                if (answer.size() == (matrix.length * matrix[0].length)) {
                    break;
                }
                answer.add(matrix[startRowCol][i + startRowCol]);
            }
            cycle++;
            matrix = rotate(matrix);
        }

        return answer;
    }

    public int[][] rotate(int[][] matrix) {
                                    // 4            // 3
        int[][] rotated = new int[matrix[0].length][matrix.length];

                                // 4
        for (int i = 0; i < rotated.length; i++) {
                                // 3
            for (int j = 0; j < rotated[0].length; j++) {
                rotated[i][j] = matrix[j][rotated.length - 1 - i];
            }
        }
        return rotated;
    }
}
