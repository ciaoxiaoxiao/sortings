package Weekly.Week11Sorting;

import java.util.Arrays;

public class QuickSort {
    public static int[] quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int pivot = partition(nums, left, right);
            quickSort(nums, left, pivot - 1);
            quickSort(nums, pivot + 1, right);
        }
        return nums;
    }

    private static int partition(int[] nums, int left, int right) {
        int pivotIdx = left;
        int pivot = nums[pivotIdx];
        int l = left + 1;
        int r = right;
        while (l <= r) {
            if (nums[l] > pivot && nums[r] < pivot) {
                swap(nums, l++, r--);
            }
            if (nums[l] <= pivot) {
                l++;
            }
            if (nums[r] >= pivot) {
                r--;
            }
        }
        swap(nums, pivotIdx, r);
        return r;
    }

    private static void swap(int[] nums, int n1, int n2) {
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 9, 4, 7, 6, 1, 3, 8};
        quickSort(nums, 0, nums.length - 1);
    }
}
