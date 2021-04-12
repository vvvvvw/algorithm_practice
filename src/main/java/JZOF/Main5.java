package JZOF;

public class Main5 {

    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.length() * 3);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(32 == ch){
                stringBuilder.append("%20");
            }else{
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();

    }

}
