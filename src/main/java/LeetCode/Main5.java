package LeetCode;

public class Main5 {
    //l(i,j) = l(i+1,j-1)?( s(i)==s(j)?1:0 + l(i-1,j-1) ) : 0
    public static String longestPalindrome(String s) {
        if(s.isEmpty()){
            return s;
        }
        String res = s.substring(0,1);

        int max = 1;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        dp[len-1][len-1] = true;

        for (int i = len-2; i >=0 ; i--) {
            dp[i][i] = true;
            for (int j = i+1; j < len; j++) {
                if((i+1)==j){
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                }else {
                    dp[i][j] = dp[i + 1][j - 1]&&(s.charAt(i) == s.charAt(j));
                }
                if(dp[i][j]&&(j-i+1)>max){
                    max = (j-i+1);
                    res = s.substring(i,j+1);
                }
            }
        }
        return res;
    }

    //todo 也可以使用中心扩展

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcda"));
    }

}
