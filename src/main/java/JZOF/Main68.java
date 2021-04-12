package JZOF;

public class Main68 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(null == root){
                return null;
            }
            if( p == root || q==root){
                return root;
            }

            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);
            if(null == left){
                return right;
            }
            if(null == right){
                return left;
            }
            return root;
        }
    }
}
