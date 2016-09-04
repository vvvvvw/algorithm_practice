package LeetCode;

/**
 * Created by chencen on 2016/9/4.
 */
public class Permutation_Sequence60 {
    public String getPermutation(int n, int k) {
        if(k<0||n<=0){
            return "";
        }
        int toDiv=1;
        for(int i=1;i<=n;i++){
            toDiv*=i;
        }
        if(k>toDiv){
            return "";
        }
        toDiv/=n;
        char[] chars=new char[n];
        char[] res=new char[n];
        for(int i=0;i<n;i++){
            chars[i]=(char)('1'+i);
        }
        int index=-1;
        int leave=k;
        int indexCopy=-1;
        for(int i=n-1;i>=0;i--){
            index=leave%toDiv==0?leave/toDiv:leave/toDiv+1;
            indexCopy=index;
            for(int j=0;j<n;j++) {
                if (chars[j] == 0) {
                    continue;
                }
                if (--index == 0) {
                    res[n-1-i] = chars[j];
                    chars[j] = 0;
                    break;
                }
            }
                if(i!=0) {
                    leave = leave - toDiv * (indexCopy - 1);
                    toDiv = toDiv / i;
                }else{
                    leave=1;
                    toDiv=1;
                }
            }
        return new String(res);

    }
    public static void main(String[] args){
        System.out.println(new Permutation_Sequence60().getPermutation(3,5));
    }

}
