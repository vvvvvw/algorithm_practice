package JZOF;

import java.util.Stack;

public class Main6 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static int[] reversePrint(ListNode head) {
        if(null == head){
            return new int[0];
        }

        ListNode newHead = new ListNode(-1);
        int count = reverseList(head,newHead);
        int[] arr = new int[count];
        ListNode node = newHead.next;

        for (int i = 0; i < count; i++) {
            arr[i] = node.val;
            node = node.next;
        }

        return arr;
    }

    //todo 用栈来旋转更快
    private static int reverseList(ListNode head, ListNode newHead) {
        int count = 0;

        ListNode newheadNode = null;
        ListNode currentNode = head;
        ListNode prevNode = null;
        ListNode nextNode = null;

        while(null!=(currentNode)){
            count++;
            newheadNode = currentNode;

            nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }

        newHead.next = newheadNode;

        return count;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        System.out.println(reversePrint(listNode));
    }

}
