package JZOF;

public class Main552 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        if(null == root){
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepeth = maxDepth(root.right);
        return Math.max(leftDepth,rightDepeth)+1;
    }
}
