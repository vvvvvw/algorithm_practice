package niuke;

import java.util.Scanner;

/**
 * Created by chencen on 2016/8/5.
 */
public class FindMoreThanHalf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int candicator = arr[0];
        int time = 1;
        for (int i = 1; i < num; i++) {
            if (candicator != arr[i]) {
                if (time == 0) {
                    candicator = arr[i];
                    time = 1;
                } else {
                    time--;
                }
            } else {
                time++;
            }
        }
        int amount=0;
        if(time!=0){
            for(int i=0;i<num;i++){
                if(arr[i]==candicator){
                    amount++;
                }
            }
            if(amount>num/2){
                System.out.println(candicator);
            }
        }
    }
}
