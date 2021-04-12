package sort;

import java.util.Stack;

public class TreeOrder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int preOrder(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        while (null != root || !stack.isEmpty()) {
            if (null != root) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();

                if (--k == 0) {
                    return root.val;
                }

                root = root.right;
            }
        }

        return -1;
    }

    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);
        while (!s1.empty())  // 栈空时结束
        {
            root = s1.pop();
            s2.push(root);
            if (null != root.left) {
                s1.push(root.left);
            }
            if (null != root.right)
                s1.push(root.right);
        }
        while (!s2.empty()) {
            System.out.println(s2.pop().val);
        }
        return -1;
    }
}
