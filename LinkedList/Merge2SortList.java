public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Merge2SortList {
    public ListNode mergetwolists(ListNode list1, ListNode list2) {
        ListNode Merged = new ListNode();
        ListNode temp = Merged;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.value) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        }
        if (list2 != null) {
            temp.next = list2;
        }
        return Merged.next;
    }
}
