package javaCode.searchInsertPosition;

public class SearchInsertPositionTest {
    public static void main(String[] args) {
        SearchInsertPosition test = new SearchInsertPosition();

        int[] testArr = {1,3,5,6};
        int testVal = 2;

        System.out.println(test.searchInsert(testArr, testVal));
    }
}
