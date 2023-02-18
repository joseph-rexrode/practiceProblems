package javaCode.spiralMatrix;

public class SpiralMatrixTest {
    public static void main(String[] args) {
        SpiralMatrix test = new SpiralMatrix();

        int[][] newInput = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] testInput = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] newInput2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};


        System.out.println(test.spiralOrder(newInput));
        System.out.println(test.spiralOrder(testInput));
        System.out.println(test.spiralOrder(newInput2));
    }
}
