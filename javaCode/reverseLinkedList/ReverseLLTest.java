package javaCode.reverseLinkedList;

import javaCode.mergeSortedLists.ListNode;

public class ReverseLLTest {
    public static void main(String[] args) {
        ReverseLL rev = new ReverseLL();
        ListNode node = new ListNode(
            1, new ListNode(
                2, new ListNode(
                    3, new ListNode(
                        4, new ListNode(
                            5)
                        )
                    )
                )
            );
        ListNode answer = rev.reverseList(node);
        while (answer != null) {
            System.out.println(answer.val + "--> ");
            answer = answer.next;
        }
    }
}
