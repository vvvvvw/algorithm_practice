package sort;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 0, 9};
        //打印排序前的数据
        System.out.println("排序前的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //直接插入排序
        quickSort(arr, 0, arr.length - 1);
        //打印排序后的数据
        System.out.println();
        System.out.println("排序后的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = merge(arr, low, high);
        quickSort(arr, 0, mid);
        quickSort(arr, mid + 1, high);
    }

    private static int merge(int[] arr, int low, int high) {
        if (low == high) {
            return low;
        }

        int temp = arr[low];

        while (low < high) {
            while (arr[high] >= temp && high > low) {
                high--;
            }

            arr[low] = arr[high];

            while (arr[low] <= temp && high > low) {
                low++;
            }

            arr[high] = arr[low];
        }

        arr[low] = temp;

        return low;
    }


}
