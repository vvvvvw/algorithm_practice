package JZOF;

/**
 * Created by 陈钻健 on 2016/8/18.
 */
public class Merge {
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head;
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        if(list1.val<list2.val) {
            head=list1;
            list1=list1.next;
        }else{
            head=list2;
            list2=list2.next;
        }
        ListNode pre=head;
        while(null!=list1&&null!=list2){
            if(list1.val<list2.val){
                pre.next=list1;
                pre=list1;
                list1=list1.next;
            }else{
                pre.next=list2;
                pre=list2;
                list2=list2.next;
            }
        }
        while(null!=list1){
            pre.next=list1;
            list1=list1.next;
        }
        while(null!=list2){
            pre.next=list2;
            list2=list2.next;
        }
        return head;
    }
}
