package LeetCode;

import jdk.nashorn.internal.objects.NativeUint8Array;

public class Main6 {

    /*
    0  - -(0+row*2-2) ---(0+row*4-4)
    1  -- (1+(row-1)*2-2)---(1+(row-1)*2-2)
     */

    public static String convert(String s, int numRows) {
        if(numRows>=s.length() || 1==numRows){
            return s;
        }

        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder(s.length());

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= len; j += (numRows - 1)*2) {
                if( j-i+1 >=1 && i!=numRows){
                    stringBuilder.append(s.charAt(j-i));
                }

                if( j+i-1 <=len && i!=1){
                    stringBuilder.append(s.charAt(j+i-2));
                }

            }
        }

        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
    }
}
