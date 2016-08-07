package niuke;

import java.util.Scanner;

/**
 * Created by chencen on 2016/8/5.
 */
public class FillToPalindromicWithLeastStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        String longestPalin=scanner.next();
        char[] strings=new char[2*str.length()-longestPalin.length()];
        int left1=0,left2=0;
        int lindex=0,rindex=2*str.length()-longestPalin.length()-1;
        int right1=str.length()-1,right2=str.length()-1;
        for(int i=0;i<=Math.ceil(longestPalin.length()/2.0);i++){
            while(str.charAt(left2)!=longestPalin.charAt(i)){
                left2++;
            }
            while(str.charAt(right2)!=longestPalin.charAt(i)){
                right2--;
            };
            for(int j=left1;j<left2;j++){
                strings[lindex++]=str.charAt(j);
                strings[rindex--]=str.charAt(j);
            }
            for(int j=right1;j>right2;j--){
                strings[lindex++]=str.charAt(j);
                strings[rindex--]=str.charAt(j);
            }
            strings[lindex++]=str.charAt(left2);
            strings[rindex--]=str.charAt(right2);
            left1=left2=left2+1;
            right1=right2=right2-1;
        }
        System.out.println(strings);
    }
}
