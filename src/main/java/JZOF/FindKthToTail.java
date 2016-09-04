package JZOF;

/**
 * Created by 陈钻健 on 2016/8/18.
 */
public class FindKthToTail {
 public class ListNode {
     int val;
     ListNode next = null;

     ListNode(int val) {
         this.val = val;
     }
 }
        public ListNode FindKthToTail(ListNode head,int k) {
            int len=0;
            ListNode listNode=head;
            while(listNode!=null){
                len++;
                listNode=listNode.next;
            }
            if(len<k){
                return null;
            }
            listNode=head;
            int n=len-k+1;
            while(--n!=0){
                listNode=listNode.next;
            }
            return listNode;


    }
}
