package JZOF;

public class Main4 {
    //从右上角开始遍历
    //从二维数组的右上角开始查找。如果当前元素等于目标值，则返回 true。如果当前元素大于目标值，则移到左边一列。如果当前元素小于目标值，则移到下边一行。
    //可以证明这种方法不会错过目标值。如果当前元素大于目标值，说明当前元素的下边的所有元素都一定大于目标值，因此往下查找不可能找到目标值，往左查找可能找到目标值。如果当前元素小于目标值，说明当前元素的左边的所有元素都一定小于目标值，因此往左查找不可能找到目标值，往下查找可能找到目标值。
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(null == matrix || 0 == matrix.length || 0 == matrix[0].length){
            return false;
        }

        int row = 0;
        int column = matrix[0].length - 1;

        while(row<matrix.length && column>=0){
            if(matrix[row][column] == target){
                return true;
            }else if(matrix[row][column] > target){
                column --;
            }else{
                row ++;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(findNumberIn2DArray(matrix,5));
    }

}
