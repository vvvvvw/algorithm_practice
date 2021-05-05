package zuochengyun;

public class HannuotaStack6 {


/*
    public static int hanNuoProblem(int num, String left, String mid, String right, int total){
        int step = 0;
        step += move(num, left, mid);
        step += move(num, mid, right);
        if (total == num){
            return step;
        }
        step += hanNuoProblem(num + 1, "left", "mid", "mid", total);
        step += move(num, right, mid);
        step += move(num, mid, left);
        step += hanNuoProblem(num + 1, "mid", "right", "right", total);
        step += move(num, left, mid);
        step += move(num, mid, right);
        return step;
    }

    public static int move(int num, String from, String to){
        if (from != to) {
            System.out.println("move " + num + " from " + from + " to " + to);
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(hanNuoProblem(1, "left", "mid", "right", 2));
    }
*/























    public static void main(String[] args) {
        System.out.println(HanNuo(2,"left","mid","right"));

    }

    private static int HanNuo(int n, String left,String mid,String right){
        int step = 0;
        if (n==1){
            step += move(1, left, mid);
            step += move(1, mid,right);
            return step;
        }
        step += HanNuo(n-1,left,mid,right);
        step += move(n,left,mid);
        step += HanNuo(n-1,right,mid,left);
        step += move(n,mid,right);
        step += HanNuo(n-1,left,mid,right);
        return step;
    }

    private static int move(int n, String from, String to) {
        if (from.equalsIgnoreCase(to)){
            return 0;
        }else{
            System.out.printf("move %d from %s to %s\n", n, from, to);
            return 1;
        }
    }
}
