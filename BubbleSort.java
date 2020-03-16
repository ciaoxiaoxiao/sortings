package Weekly.Week11Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        boolean swap;
        for (int i = 0; i < nums.length - 1; i++) {
            swap = false;
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{5, 2, 9, 4, 7, 6, 1, 3, 8};
        bubbleSort(test);
        System.out.println(Arrays.toString(test));
    }
}
