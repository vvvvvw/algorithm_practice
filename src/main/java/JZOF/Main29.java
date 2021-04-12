package JZOF;

public class Main29 {
    public int[] spiralOrder(int[][] matrix) {
        if(0==matrix.length || 0 == matrix[0].length){
            return new int[0];
        }

        int[] res = new int[matrix.length*matrix[0].length];
        int left = 0,right = matrix[0].length-1,low = 0,high = matrix.length - 1;

        int i = 0;
        while (true){
            for (int k = left; k <= right ; k++) {
                res[i++] = matrix[low][k];
            }
            if(++low>high) break;
            for (int k = low; k <= high ; k++) {
                res[i++] = matrix[k][right];
            }
            if(--right<left) break;
            for (int k = right; k >= left ; k--) {
                res[i++] = matrix[high][k];
            }
            if(--high<low) break;
            for (int k = high; k >= low ; k--) {
                res[i++] = matrix[k][left];
            }
            if(++left>right) break;
        }
        return res;
    }

}
