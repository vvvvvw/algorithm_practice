package LeetCode;

/**
 * Created by chencen on 2016/7/29.
 */
public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        if(null==s){
            return 0;
        }
        int maxlen=0;
        int len=0;
        int[] arr=new int[255];
        for(int i=0;i<s.length();i++){
            if(i+1-arr[s.charAt(i)]>len){
                len++;
            }else{
                len=i+1-arr[s.charAt(i)];
            }
            arr[s.charAt(i)]=i+1;
            if(maxlen<len){
                maxlen=len;
            }
        }
        return maxlen;
    }
    public static void main(String[] args){
        new Q3().lengthOfLongestSubstring("abba");
    }
}
