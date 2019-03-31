package linkedList;

public class addTwoNumber {
    public listNode solution(listNode l1, listNode l2) {
        listNode l = new listNode(-1);
        listNode head = l;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int total = carry;
            carry = 0;
            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }
            if (total > 9) {
                total -= 10;
                carry = 1;
            }
            l.next = new listNode(total);
            l = l.next;
        }

        return head.next;

    }
}
