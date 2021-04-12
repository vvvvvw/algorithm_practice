package JZOF;

import java.util.Stack;

public class Main54 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

/*
    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (null!= root){
            if(null != root.left){
                root = root.left;
                stack.push(root);
            }else{
                root = stack.pop();

                if(--k == 0){
                    return root.val;
                }
                stack.push(root.right);
            }
        }

        return -1;
    }
*/

}
