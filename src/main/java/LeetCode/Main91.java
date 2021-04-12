package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Main91 {

    private static final Set<String> codes = new HashSet<String>(26);

    static{
        for (int i = 1; i <= 26; i++) {
            codes.add(String.valueOf(i));
        }
    }

    public static int numDecodings(String s) {
        if (null == s || 0 == s.length()) {
            return 0;
        }
        if(1==s.length()){
            return codes.contains(s)?1:0;
        }
        if(2==s.length()){
            return (codes.contains(s)?1:0) + (((codes.contains(s.substring(0,1)))&&(codes.contains(s.substring(1,2))))?1:0);
        }

        int last2 = codes.contains(s.substring(0,1))?1:0;
        int last1 = (codes.contains(s.substring(0,2))?1:0) + (((codes.contains(s.substring(0,1)))&&(codes.contains(s.substring(1,2))))?1:0);
        int res = 0;

        for (int i = 2; i < s.length(); i++) {
            res = (codes.contains(s.substring(i,i+1))?last1:0) + (codes.contains(s.substring(i-1,i+1))?last2:0);
            last2 = last1;
            last1 = res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("12120"));
    }

}
