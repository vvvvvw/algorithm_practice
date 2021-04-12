package sort;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 0, 9};
        //打印排序前的数据
        System.out.println("排序前的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //直接插入排序
        mergeSort(arr, 0, arr.length - 1,new int[arr.length]);
        //打印排序后的数据
        System.out.println();
        System.out.println("排序后的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arrA, int from, int to, int[] arrB) {
        if (from >= to) {
            return;
        }

        int mid = (from + to) / 2;
        mergeSort(arrA, from, mid, arrB);
        mergeSort(arrA, mid + 1, to, arrB);
        merge(arrA, from, mid, to, arrB);
    }

    private static void merge(int[] arrA, int from, int mid, int to, int[] arrB) {
        int index = 0;
        int low = from;
        int high = mid+1;

        while (low <= mid && (high <= to)) {
            if(arrA[low]<=arrA[high]){
                arrB[index++] = arrA[low];
                low++;
            }else{
                arrB[index++] = arrA[high];
                high++;
            }
        }
        while (low<=mid){
            arrB[index++] = arrA[low++];
        }

        while (high<=to){
            arrB[index++] = arrA[high++];
        }

        for (int i = from; i <= to; i++) {
            arrA[i] = arrB[i - from];
        }

    }

}
