package JZOF;

public class Main13 {

    public static int movingCount(int m, int n, int k) {
        if(m<0||n<0||k<0){
            throw new IllegalArgumentException();
        }
        boolean[][] matrix = new boolean[m][n];
        return dfs(0,0,k,matrix);

    }

    private static int dfs(int row, int column, int k, boolean[][] matrix) {
        if(0>row||0>column||row>=matrix.length||column>=matrix[0].length||matrix[row][column]){
            return 0;
        }
        matrix[row][column] = true;
        if(!needRecord(row,column,k)){
            return 0;
        }
        return  1
                + dfs(row-1,column,k,matrix)
                + dfs(row+1,column,k,matrix)
                + dfs(row,column-1,k,matrix)
                + dfs(row,column+1,k,matrix);
    }

    private static boolean needRecord(int row, int column, int k) {
        return (getSum(row) + getSum(column)) <= k;
    }

    private static int getSum(int num) {
        int res = 0;
        while (0!=num){
            res = res+(num%10);
            num /=10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(16,8,4));

    }

}
