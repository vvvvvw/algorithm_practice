package JZOF;

public class Main11 {
/*  todo 比较 第一个元素
    public static int minArray(int[] numbers) {
        if(null == numbers || 0 == numbers.length){
            throw new IllegalArgumentException();
        }

        int low = 0;
        int high = numbers.length-1;

        if(1==numbers.length){
            return numbers[0];
        }

        if(numbers[0]<numbers[numbers.length-1]){
            return numbers[0];
        }

        while(low<high){
            if(low == high -1){
                return Math.min(numbers[low],numbers[high]);
            }
            int mid = (low+high)/2;
            if(numbers[mid]>numbers[low]){
                //如果已经有序，直接返回
                if(numbers[low]<numbers[high]) {
                    return numbers[low];
                }else {
                    low = mid + 1;
                }
            }else if(numbers[mid]<numbers[low]){
                high = mid;
            }else if(numbers[mid]==numbers[low]){
                low ++;
            }
        }

        return numbers[low];
    }
*/


    //比较 high
    public static int minArray(int[] numbers) {
        if(null == numbers || 0 == numbers.length){
            throw new IllegalArgumentException();
        }

        int low = 0;
        int high = numbers.length-1;

        if(1==numbers.length){
            return numbers[0];
        }

        if(numbers[0]<numbers[numbers.length-1]){
            return numbers[0];
        }

        while(low<high){
            int mid = (low+high)/2;
            if(numbers[mid]<numbers[high]){
                high = mid;
            }else if(numbers[mid]>numbers[high]){
                low = mid +1;
            }else if(numbers[mid]==numbers[high]){
                high --;
            }
        }

        return numbers[high];
    }


    public static void main(String[] args) {
        System.out.println(minArray(new int[]{1,1,2,0,0,1}));
    }
}

