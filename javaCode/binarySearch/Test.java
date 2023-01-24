package javaCode.binarySearch;

public class Test {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search.search(arr, 9));
    }
}
