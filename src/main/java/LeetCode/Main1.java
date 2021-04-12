package LeetCode;


public class Main1 {

    public static int[] twoSum(int[] nums, int target) {
        if (null == nums || 1 >= nums.length) {
            throw new IllegalArgumentException();
        }

        int[] newNums = nums.clone();

        quickSort(newNums,0,nums.length-1);

        int low = 0;
        int high = newNums.length - 1;
        while (low < high) {
            if (target - newNums[low] < newNums[high]) {
                high--;
            } else if (target - newNums[low] > newNums[high]) {
                low++;
            } else {
                return getNumsFromOriginal(newNums[low], newNums[high],nums);
            }
        }
        throw new IllegalArgumentException();
    }

    private static int[] getNumsFromOriginal(int newNum, int newNum1, int[] nums) {
        int[] res = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == newNum || nums[i] == newNum1) {
                res[index++] = i;
            }
        }
        return res;
    }

    private static void quickSort(int[] nums,int low, int high) {
        if(low>=high){
            return;
        }

        int mid = mergeSort(nums,low,high);
        quickSort(nums,low,mid-1);
        quickSort(nums,mid+1,high);
    }

    private static int mergeSort(int[] nums, int low, int high) {
        int temp = nums[low];

        while (low<high){
            while ((high>low) && (nums[high]>=temp)) {
                high--;
            }
            nums[low] = nums[high];

            while ((high>low) && (nums[low]<=temp)) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{-10,-1,-18,-19},-19);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}