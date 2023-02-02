package javaCode.kClosestPoints;

public class KClosestTest {
    public static void main(String[] args) {
        KClosest test = new KClosest();
        int[][] testParam = {{2,2},{2,2},{2,2},{2,2},{2,2},{2,2},{1,1}};

        System.out.println(test.kClosest(testParam, 2));
    }
}
