package LeetCode;

/**
 * Created by 陈钻健 on 2016/7/29.
 */
public class Q2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(null==l1&&null==l2){
            return null;
        }
        int carry = 0;
        int sum = 0;
        ListNode head = l1 != null ? l1 : l2;
        ListNode pre = null;
        while (null != l1 && null != l2) {
            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            l1.val = sum % 10;
            pre = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        pre.next = null != l1 ? l1 : l2;
        while (null != pre.next) {
            sum = pre.next.val + carry;
            carry = sum / 10;
            pre.next.val = sum % 10;
            pre = pre.next;
        }
        if (carry > 0) {
            pre.next=new ListNode(carry);
        }
        return head;
    }
}
