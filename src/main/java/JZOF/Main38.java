package JZOF;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main38 {

    private List<String> res = new LinkedList<>();
    private char[] chars = null;

    public String[] permutation(String s) {
        chars = s.toCharArray();
        dfs(0);
        return res.toArray(new String[0]);
    }

    private void dfs(int p) {
        if((chars.length-1) == p){
            res.add(new String(chars));
            return;
        }
        Set<Character> characters = new HashSet<>();
        for (int i = p; i < chars.length; i++) {
            if(!characters.contains(chars[i])){
                characters.add(chars[i]);
                swap(p,i);
                dfs(p+1);
                swap(i,p);
            }
        }

    }

    private void swap(int p, int i) {
        char tmp = chars[p];
        chars[p] = chars[i];
        chars[i] = tmp;
    }

}
