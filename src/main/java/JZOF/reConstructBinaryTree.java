package JZOF;

import sun.reflect.generics.tree.Tree;

/**
 * Created by chencen on 2016/8/17.
 */
public class reConstructBinaryTree {
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }

    public TreeNode findRootNode(int[] pre,int[] in,int preStart,int inLeft,int inRight){
        if(inLeft>inRight){
            return null;
        }else if(inLeft==inRight){
            return new TreeNode(in[inLeft]);
        }
        TreeNode treeNode=null;
        for(int i=inLeft;i<=inRight;i++){
            if(in[i]==pre[preStart]){
                treeNode=new TreeNode(pre[preStart]);
                treeNode.left=findRootNode(pre,in,preStart+1,inLeft,i-1);
                treeNode.right=findRootNode(pre,in,preStart+i-inLeft+1,i+1,inRight);
                break;
            }
        }
        return treeNode;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(null==pre||pre.length==0||null==in||in.length==0){
            return null;
        }else if(pre.length==1||in.length==1){
            return new TreeNode(pre[0]);
        }
        return findRootNode(pre,in,0,0,in.length-1);

    }

    public static void main(String[] args){
        int[] pre={1,2,4,3,5,6};
        int[] in={4,2,1,5,3,6};
        new reConstructBinaryTree().reConstructBinaryTree(pre,in);
    }
}
