package JZOF;

public class Main63 {

    public static int maxProfit(int[] prices) {
        if(1<=prices.length){
            return 0;
        }
        int max = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max,prices[i]-min);
            min = Math.min(min,prices[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
