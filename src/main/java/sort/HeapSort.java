package sort;

public class HeapSort {

    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 0, 9};
        //打印排序前的数据
        System.out.println("排序前的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //直接插入排序
        heapSort(arr);
        //打印排序后的数据
        System.out.println();
        System.out.println("排序后的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void heapSort(int[] arr) {
        if (1 >= arr.length) {
            return;
        }

        //子节点: 2*n+1  2*n+2
        //父节点: (n+1)/2 -1
        for (int i = ((arr.length + 1) / 2 - 1); i >= 0; i--) {
            siftDown(arr, i, arr.length - 1);
        }

        swap(0, arr.length-1, arr);

        for (int i = arr.length - 2; i >= 1; i--) {
            siftDown(arr, 0, i);
            swap(0, i, arr);
        }
    }

    private static void swap(int i1, int i2, int[] arr) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    private static void siftDown(int[] arr, int from, int limit) {
        int maxIndex = -1;

        for (int i = from; i <= limit; i = 2 * i + 1) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;

            if (leftChild > limit && rightChild > limit) {
                continue;
            }

            if (rightChild > limit) {
                maxIndex = leftChild;
            } else {
                maxIndex = arr[leftChild] < arr[rightChild] ? rightChild : leftChild;
            }

            if (arr[maxIndex] > arr[i]) {
                swap(i, maxIndex, arr);
            }
        }
    }
}
