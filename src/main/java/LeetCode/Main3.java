package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Main3 {

    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=0){
            return 0;
        }

        int currentFitStrStartIndex = 0;
        int longestLen = 0;
        int currentLen = 0;
        Map<Character,Integer> dupRecordMap = new HashMap<Character,Integer>(s.length());


        for (int i = 0; i < s.toCharArray().length; i++) {
            char ch = s.charAt(i);

            if(!dupRecordMap.containsKey(ch)||dupRecordMap.get(ch)<currentFitStrStartIndex){
                currentLen++;

                if(longestLen<currentLen){
                    longestLen = currentLen;
                }
            }else{
                int lastIndex = dupRecordMap.get(ch);
                currentLen = i - lastIndex;
                currentFitStrStartIndex = lastIndex+1;
            }
            dupRecordMap.put(ch,i);
        }

        return longestLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

}
