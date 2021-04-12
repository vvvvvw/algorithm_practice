package JZOF;

public class Main26 {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(null == B || null == A){
            return false;
        }
        return recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    private boolean recur(TreeNode A, TreeNode B) {
        if(null == B){
            return true;
        }

        if(null == A){
            return false;
        }

        if(A.val == B.val){
            return recur(A.left,B.left) && recur(A.right,B.right);
        }

        return false;
    }
}
