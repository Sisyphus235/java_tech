package linkedList;

import java.util.Stack;

public class addTwoNumberII {
    public listNode solution(listNode l1, listNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        Stack<Integer> s2 = new Stack<Integer>();
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        listNode head = null;
        int carry = 0;
        while (!s1.empty() || !s2.empty() || carry != 0) {
            int total = carry;
            carry = 0;
            if (!s1.empty()) {
                total += s1.pop();
            }
            if (!s2.empty()) {
                total += s2.pop();
            }
            if (total > 9) {
                total -= 10;
                carry = 1;
            }
            listNode cur = new listNode(total);
            cur.next = head;
            head = cur;
        }

        return head;
    }
}
