package java.mergeSortedLists;

public class Test {
    public static void main(String[] args) {
        Result result = new Result();
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        System.out.println(result.mergeTwoLists(node1, node2));
    }
}
