package JZOF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

/**
 * Created by chencen on 2016/8/17.
 */
public class PrintListFromTailToHead {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
Stack<Integer> stack=new Stack<Integer>();
        ListNode head=listNode;
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args){
        ListNode listNode1=new PrintListFromTailToHead().new ListNode(67);
        ListNode listNode2=new PrintListFromTailToHead().new ListNode(0);
        ListNode listNode3=new PrintListFromTailToHead().new ListNode(28);
        ListNode listNode4=new PrintListFromTailToHead().new ListNode(58);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        new PrintListFromTailToHead().printListFromTailToHead(listNode1);
    }
}
