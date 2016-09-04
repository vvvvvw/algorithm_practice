package LeetCode;

import JZOF.PrintListFromTailToHead;

/**
 * Created by chencen on 2016/9/4.
 */
public class Rotate_List61 {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head==null){
            return head;
        }
        int len=0;
        ListNode listNode=head;
        while(listNode!=null){
            len++;
            if(listNode.next==null){
                listNode.next=head;
                break;
            }
            listNode=listNode.next;
        }
        int from=len-k;
        listNode=head;
        while(--from!=0){
            listNode=listNode.next;
        }
        head=listNode.next;
        listNode.next=null;
        return listNode;
    }
    public static void main(String[] args){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);

    }
}
