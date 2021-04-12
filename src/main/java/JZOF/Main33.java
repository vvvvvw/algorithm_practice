package JZOF;

public class Main33 {

    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }

    private boolean recur(int[] postorder,int left,int right){
        if(left>=right){
            return true;
        }
        int x = left;
        while (postorder[x]<=postorder[right] && x<right) {
            x++;
        }
        int m = x;
        while (postorder[x] > postorder[right]) x++;
        return x == right && recur(postorder,left,m-1) && recur(postorder,m,right-1);
    }
}
