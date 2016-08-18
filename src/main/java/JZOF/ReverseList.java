package JZOF;

/**
 * Created by 陈钻健 on 2016/8/18.
 */
public class ReverseList {
     class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }
        public ListNode ReverseList(ListNode head) {
            if(head==null){
                return null;
            }
            ListNode pre=head;
            ListNode next;
            ListNode cur=head.next;
            head.next=null;
            while(cur!=null){
                next=cur.next;
                cur.next=pre;
                pre=cur;
                cur=next;
            }
            return pre;

    }
}
