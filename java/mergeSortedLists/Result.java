package java.mergeSortedLists;

public class Result {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        if (list1 == null) { return list2; }
        else if (list2 == null) { return list1; }
        else {
            ListNode solution = new ListNode();
            if (list1.val <= list2.val) {
                solution.val = list1.val;
                list1 = list1.next;
            }
            else {
                solution.val = list2.val;
                list2 = list2.next;
            }

            ListNode it = solution;

            while (list1 != null || list2 != null) {
                // if no more values in list1
                // or list2 value < list1 value --> add list2 value
                if (list1 == null) {
                    it.next = new ListNode(list2.val);
                    list2 = list2.next;
                    it = it.next;
                }

                else if (list2 == null) {
                    it.next = new ListNode(list1.val);
                    list1 = list1.next;
                    it = it.next;
                }

                else if (list2.val < list1.val) {
                    it.next = new ListNode(list2.val);
                    list2 = list2.next;
                    it = it.next;
                }

                else {
                    it.next = new ListNode(list1.val);
                    list1 = list1.next;
                    it = it.next;
                }
            }
            return solution;
        }
    }
}