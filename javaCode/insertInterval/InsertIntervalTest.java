package javaCode.insertInterval;

public class InsertIntervalTest {
    public static void main(String[] args) {
        InsertInterval test = new InsertInterval();

        int[][] testParam = {{1,5}};
        int[] testNewParam = {0,3};
        System.out.println(test.insert(testParam, testNewParam));
    }
}
