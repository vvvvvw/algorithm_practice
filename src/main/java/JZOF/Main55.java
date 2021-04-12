package JZOF;

public class Main55 {

     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
     }

    public boolean isBalanced(TreeNode root) {
         if(null == root){
             return true;
         }

         int leftDepth = dfs(root.left);
         int rightDepeth = dfs(root.right);
         return -1 != leftDepth && -1 != rightDepeth && Math.abs(leftDepth-rightDepeth)<=1;
    }

    private int dfs(TreeNode node) {
        if(null == node){
            return 0;
        }
        int leftDepth = dfs(node.left);
        int rightDepeth = dfs(node.right);
        if(-1 == leftDepth || -1 == rightDepeth || Math.abs(leftDepth-rightDepeth)>1){
            return -1;
        }
        return Math.max(leftDepth,rightDepeth)+1;
    }

}
