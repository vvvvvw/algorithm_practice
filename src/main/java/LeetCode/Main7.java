package LeetCode;

public class Main7 {

    public static int reverse(int x) {
        if(0==x){
            return 0;
        }

        //使用long型也能实现
        int res = 0;

        while(0!=x){
            int temp = (x%10) + 10*res;
            if((temp - x % 10) / 10 != res){ //最关键的一步
                return 0 ;
            }
            x = x/10;
        }

        return res;
    }

public static void main(String[] args) {
    System.out.println(reverse(3458));
}
}
