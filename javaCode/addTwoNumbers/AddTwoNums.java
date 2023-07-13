import javaCode.mergeSortedLists.ListNode;

public class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode it = answer;
        ListNode l1it = l1;
        ListNode l2it = l2;
        int carry = 0;

        while (l1it != null || l2it != null) {
            int sum = 0;
            if (l1it == null) {
                sum += l2it.val + carry;
            }
            else if (l2it == null) {
                sum += l1it.val + carry;
            }
            else{
                sum += l1it.val + l2it.val + carry;
            }

            if (sum > 9) {
                it.val = sum - 10;
                carry = 1;
            }
            else {
                it.val = sum;
                carry = 0;
            }

            it.next = new ListNode();
            it = it.next;
            l1it = (l1it == null) ? null: l1it.next;
            l2it = (l2it == null) ? null: l2it.next;
        }

        return answer;
    }
}