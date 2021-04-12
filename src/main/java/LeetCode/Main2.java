package LeetCode;

public class Main2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(null == l1){
            return l2;
        }

        if(null == l2){
            return l1;
        }

        ListNode headNode = null;
        ListNode lastNode = null;
        int add = 0;
        int currentValue = 0;
        int currentSum = 0;

        while (null != l1 || null != l2 || 0!=add){
            currentSum = add;
            if(null != l1){
                currentSum += l1.val;
            }
            if(null != l2){
                currentSum += l2.val;
            }

            add = currentSum/10;
            currentValue = currentSum%10;
            ListNode listNode = new ListNode(currentValue);

            if(null == headNode){
                headNode = listNode;
            }else{
                lastNode.next = listNode;
            }

            lastNode = listNode;

            if(null !=l1) {
                l1 = l1.next;
            }
            if(null!=l2) {
                l2 = l2.next;
            }
        }

       return headNode;
    }

}
