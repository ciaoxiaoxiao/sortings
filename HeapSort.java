package Weekly.Week11Sorting;

import java.util.Arrays;

public class HeapSort {
    public static void sort(int[] nums, int n) {
        int lastHeapPos = n - 1;
        makeHeap(nums, n);

        while (lastHeapPos > 0) {
            swap(nums, 0, lastHeapPos);
            reheapify(nums, lastHeapPos);
            lastHeapPos--;
        }

    }

    private static void makeHeap(int[] nums, int n) {
        int child, parentPos = 0;
        for (int i = (n - 2) / 2; i >= 0; i--) {
            parentPos = i;
            while (parentPos * 2 + 1 < n) {
                child = parentPos * 2 + 1;
                if (child < n - 1 && nums[child + 1] > nums[child]) {
                    child++;
                }
                if (nums[child] > nums[parentPos]) {
                    swap(nums, child, parentPos);
                    parentPos = child;
                }
                else {
                    break;
                }
            }
        }
    }

    private static void reheapify(int[] nums, int n) {
        int parentPos = 0, child = 0;
        while (parentPos * 2 + 1 < n) {
            child = parentPos * 2 + 1;
            if (child < n - 1 && nums[child + 1] > nums[child]) {
                child++;
            }
            if (nums[child] > nums[parentPos]) {
                swap(nums, child, parentPos);
                parentPos = child;
            }
            else {
                return;
            }
        }
    }

    private static void swap(int[] data, int i, int lastHeapPosition) {
        int temp = data[i];
        data[i] = data[lastHeapPosition];
        data[lastHeapPosition] = temp;
    }

    public static void main(String[] args) {
        int[] test = new int[]{5, 2, 9, 4, 7, 6, 1, 3, 8};
        sort(test, test.length);
        System.out.println(Arrays.toString(test));
    }
}
