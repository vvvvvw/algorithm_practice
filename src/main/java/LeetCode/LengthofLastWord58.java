package LeetCode;

/**
 * Created by chencen on 2016/9/4.
 */
public class LengthofLastWord58 {
    public int lengthOfLastWord(String s) {
        if(null==s&&s.length()==0){
            return 0;
        }
        int wordLen=0;
        char lastChar=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(lastChar==' '){
                    wordLen=0;
                }
                wordLen++;
            }
            lastChar=s.charAt(i);
        }
        return wordLen;
    }
}
