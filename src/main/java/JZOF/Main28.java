package JZOF;

public class Main28 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        if(null == root){
            return true;
        }

        return recur(root.left,root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if(null==left&&null==right){
            return true;
        }
        if((null == left && null!=right)||(null == right && null!=left)|| left.val!=right.val){
            return false;
        }
        return recur(left.left,right.right) && recur(left.right,right.left);
    }

}
