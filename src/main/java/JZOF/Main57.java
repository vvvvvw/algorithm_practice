package JZOF;

import java.util.ArrayList;
import java.util.List;

public class Main57 {
    public int[][] findContinuousSequence(int target) {
        if(1==target || 2 == target){
            return new int[][]{{target}};
        }

        List<int[]> resList = new ArrayList<>();

        int currentSum = 1;
        int from = 1;
        int halfIndex = 0==target%2?(target/2):(target/2+1);

        for (int i = 2; i <= halfIndex; i++) {
            currentSum += i;

            while (currentSum > target){
                currentSum -=from;
                from++;
            }

            if(target == currentSum){
                int[] arr = new int[i-from+1];
                for (int j = from; j <= i; j++) {
                    arr[j-from] = j;
                }
                resList.add(arr);
            }

        }
        Object object = new Object();

        return resList.toArray(new int[0][]);
    }

}
