package JZOF;

public class Main67 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(null == root){
            return null;
        }
            while(root != null) {
                if(root.val < p.val && root.val < q.val) // p,q 都在 root 的右子树中
                    root = root.right; // 遍历至右子节点
                else if(root.val > p.val && root.val > q.val) // p,q 都在 root 的左子树中
                    root = root.left; // 遍历至左子节点
                else break;
            }
            return root;
        }
}
