package sort;

public class SortMain {

    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 0, 9};
        //打印排序前的数据
        System.out.println("排序前的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //直接插入排序
        mergeSort(arr, 0, arr.length-1, new int[arr.length]);
        //打印排序后的数据
        System.out.println();
        System.out.println("排序后的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void binaryInsertSort(int[] arr) {

        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            int low = 0;
            int high = i - 1;
            int mid;

            while (low <= high) {
                mid = (low + high) / 2;

                if (arr[mid] > arr[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            temp = arr[i];
            for (int j = i; j > high + 1; j--) {
                arr[j] = arr[j - 1];
            }
            arr[high + 1] = temp;
        }
    }


    public static void xierSort(int[] arr) {
        int length = arr.length;
        if (1 >= length) {
            return;
        }

        int step = length / 2;

        while (0 != step) {

            for (int i = 0; i <= step - 1; i++) {
                insertSort(i, step, arr);
            }
            step = step / 2;
        }
    }

    private static void insertSort(int start, int step, int[] arr) {
        int length = arr.length;
        int temp;
        int j;

        for (int i = start + step; i < length - 1; i = i + step) {
            for (j = i - step; j >= 0 && arr[j] > arr[i]; j = j - step) {
                temp = arr[j + step];
                arr[j + step] = arr[j];
                arr[j] = temp;
            }
            arr[j + step] = arr[i];
        }
    }

    public static void bubbleSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int length = arr.length;
        int temp;

        for (int i = 0; i < length - 1; i++) {
            boolean flag = false;

            //这个地方-1是需要注意的
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }

        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int index = mergeSort(arr, start, end);
        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        int guard = arr[low];

        while (low < high) {
            while (low < high && arr[high] >= guard) {
                high--;
            }
            //先从后到前遍历，如果有替换，保证有空位
            arr[low] = arr[high];

            while (low < high && arr[low] <= guard) {
                low++;
            }

            arr[high] = arr[low];
        }
        arr[low] = guard;
        return low;
    }

    public static void chooseSort(int[] arr) {
        if (1 >= arr.length) {
            return;
        }

        int length = arr.length;

        for (int i = 0; i < length; i++) {

            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            if (i != index) {
                swap(i, index, arr);
            }
        }
    }

    private static void swap(int i, int index, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[index];
        arr[index] = tmp;
    }

    private static void heapSort(int[] arr) {
        if (1 >= arr.length) {
            return;
        }

        //第一个非叶节点：arr.length/2-1
        //子节点： 2*n+1  2*n+2
        //父节点:  (n+1)/2-1
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            siftDown(i, arr, arr.length);
        }

        for (int i = 0; i < arr.length - 1; i++) {

            swap(0, arr.length-1-i, arr);
            siftDown(0, arr, arr.length-1);
        }

    }

    //从小到大排序  大顶堆
    private static void siftDown(int i, int[] arr, int length) {
        //第一个非叶节点：arr.length/2-1
        //子节点： (n+1)*2-1  (n+1)*2
        //父节点:  (n+1)/2-1
        int temp = arr[i];
        for (int k = 2 * i + 1; k <= length; k = 2 * k + 1) {
            if ((k + 1 <= length) && arr[k] < arr[k + 1]) {
                k++;
            }
            if (arr[k] > temp) {
                swap(i, k, arr);
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;
    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;//左序列指针
        int j = mid + 1;//右序列指针
        int t = 0;//临时数组指针

        while (i <= mid & j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = arr[i++];
        }

        while (j <= right) {
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }

}
