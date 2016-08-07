package LeetCode;

/**
 * Created by chencen on 2016/7/29.
 */
public class Q5 {
/*    public String longestPalindrome(String s) {
        if(null==s||0==s.length()||1==s.length()){
            return s;
        }
        int left=-1;
        int right=-1;
        int len=0;
        int maxlen=0;
        String res=null;
        for(int i=0;i<s.length();i++){
            left=i-1;
            right=i+1;
            len=1;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                len+=2;
                left--;
                right++;
            }
            if(len>maxlen){
                res=s.substring(++left,right);
                maxlen=len;
            }
            left=i;
            right=i+1;
            len=0;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                len+=2;
                left--;
                right++;
            }
            if(len>maxlen){
                res=s.substring(++left,right);
                maxlen=len;
            }
        }
        return res;
    }*/
public String longestPalindrome(String s) {
    if(null==s||0==s.length()||1==s.length()){
        return s;
    }
    int left=-1;
    int right=-1;
    int len=0;
    int maxlen=0;
    String res=null;
    for(int i=0;i<s.length();i++){
        left=i-1;
        right=i+1;
        len=1;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            len+=2;
            left--;
            right++;
        }
        if(len>maxlen){
            res=s.substring(++left,right);
            maxlen=len;
        }
        left=i;
        right=i+1;
        len=0;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            len+=2;
            left--;
            right++;
        }
        if(len>maxlen){
            res=s.substring(++left,right);
            maxlen=len;
        }
    }
    return res;
}
    public static void main(String[] args){
        new Q5().longestPalindrome("ccc");
    }
}
