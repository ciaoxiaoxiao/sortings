package Weekly.Week11Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num: nums) {
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]] = count[nums[i]] + 1;
        }

        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums[idx++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{3, 4, 5, 1, 2, 2, 3, 6};
        countingSort(test);
        System.out.println(Arrays.toString(test));
    }
}
