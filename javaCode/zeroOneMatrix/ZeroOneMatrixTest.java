package javaCode.zeroOneMatrix;

public class ZeroOneMatrixTest {
    public static void main(String[] args) {
        ZeroOneMatrix test = new ZeroOneMatrix();

        int[][] testMat = {{0,0,0},{0,1,0},{1,1,1}};
        System.out.println(test.updateMatrix(testMat));
    }
}
