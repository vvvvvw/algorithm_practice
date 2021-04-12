package JZOF;

import java.util.HashMap;
import java.util.Map;

public class Main7 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(null == preorder || 0 == preorder.length){
            return null;
        }

        Map<Integer,Integer> inOrderMap = constructInOrderMap(inorder);
        TreeNode rootNode = buildTreeRecur(preorder,0,preorder.length-1,0,inOrderMap);

        return rootNode;
    }

    private TreeNode buildTreeRecur(int[] preorder, int preorderStart, int preorderEnd, int inorderStart, Map<Integer, Integer> inOrderMap) {
        if(preorderStart>preorderEnd){
            return null;
        }else{
            TreeNode currentNode = new TreeNode(preorder[preorderStart]);
            int rootIndex = inOrderMap.get(currentNode.val);
            int leftNodes = rootIndex - inorderStart;
            currentNode.left = buildTreeRecur(preorder,preorderStart+1,preorderStart+leftNodes,inorderStart,inOrderMap);
            currentNode.right = buildTreeRecur(preorder,preorderStart +leftNodes +1,preorderEnd,rootIndex+1,inOrderMap);
            return currentNode;
        }
    }

    private Map<Integer, Integer> constructInOrderMap(int[] inorder) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i],i);
        }

        return hashMap;
    }

}
