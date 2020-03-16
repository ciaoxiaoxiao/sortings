package Weekly.Week11Sorting;

public class MergeSort {
    public static int[] mergesort(int nums[ ], int low, int high)
    {
        int mid = (low + high) / 2;
        if (low < high) {
            mergesort(nums, low, mid);
            mergesort(nums, mid + 1, high);
            merge(nums, low, mid, high);
            print(nums);
            System.out.println();
        }
        return nums;
    }

    private static void merge(int[ ] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[x + low] = temp[x];
        }
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 9, 4, 7, 6, 1, 3, 8};
        mergesort(nums, 0, nums.length - 1);
    }
}
