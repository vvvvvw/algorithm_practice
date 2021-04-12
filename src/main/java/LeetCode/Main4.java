package LeetCode;


public class Main4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        quickSort(nums1,0,nums1.length-1);
        quickSort(nums2,0, nums2.length-1);

        int midIndex = nums1.length + nums2.length;
        midIndex = (0==midIndex%2)?midIndex/2:(midIndex+1)/2;

        int nums1FromIndex = 0;
        int nums2FromIndex = 0;
        int nums1ToIndex = nums1.length-1;
        int nums2ToIndex = nums2.length-1;
        int currentNum1 = 0;
        int currentNum2 = 0;

        for (int i = 1; i <= midIndex; i++) {
            if(nums1FromIndex>=nums1.length){
                currentNum1 = nums2[nums2FromIndex];
                nums2FromIndex++;
            }else if(nums2FromIndex>=nums2.length){
                currentNum1 = nums1[nums1FromIndex];
                nums1FromIndex++;
            }else if(nums1[nums1FromIndex]>nums2[nums2FromIndex]){
                currentNum1 = nums2[nums2FromIndex];
                nums2FromIndex++;
            }else{
                currentNum1 = nums1[nums1FromIndex];
                nums1FromIndex++;
            }

            if(nums1ToIndex<0){
                currentNum2 = nums2[nums2ToIndex];
                nums2ToIndex--;
            }else if(nums2ToIndex<0){
                currentNum2 = nums1[nums1ToIndex];
                nums1ToIndex--;
            }else if(nums1[nums1ToIndex]<nums2[nums2ToIndex]){
                currentNum2 = nums2[nums2ToIndex];
                nums2ToIndex--;
            }else{
                currentNum2 = nums1[nums1ToIndex];
                nums1ToIndex--;
            }
        }

        return (currentNum1+currentNum2)/2.0;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }

        int mid = merge(arr,low,high);
        quickSort(arr,low,mid);
        quickSort(arr,mid+1,high);
    }

    private static int merge(int[] arr, int low, int high) {

        int temp = arr[low];

        while (low<high){
            while(arr[high]>=temp&&low<high){
                high--;
            }
            arr[low] = arr[high];

            while(arr[low]<=temp&&low<high){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low]= temp;
        return low;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2}));
    }
}
