package JZOF;

public class Main56 {
    public int singleNumber(int[] nums) {

        int[] counts = new int[32];
        for (int num:nums) {
            for(int j = 0; j < 32; j++) {
                counts[j] += num & 1;
                num >>>= 1;
            }
        }

        int res = 0;
        int digit = 1;

        for (int count : counts) {
            res += (count%3)*digit;
            digit <<=1;
        }
        return res;
    }

    public static void main(String[] args) {
        Integer a = 0b11111111111111111111111111101100;
        System.out.println(Integer.toBinaryString(a).length());
        System.out.println(Integer.toBinaryString(a >> 1));
        System.out.println(Integer.toBinaryString(a >> 1).length());
        /*System.out.println(singleNumber());*/
        /*System.out.println("java 右移");
        Integer a = 0b11111111111111111111111111101100;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a >> 2)); // 有符号右移
        System.out.println(Integer.toBinaryString(a << 2).length()); // 无符号右移 }*/
    }
}
