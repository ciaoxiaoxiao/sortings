package Weekly.Week11Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class BucketSort {
    /*
    * Hash code(decide num should be put in which bucket) and #buckets is determined by self??
    * Advantage: when the data is uniformly
    *
    * Time: depends on the sort algorithm to sort every bucket
    * worst:O(n^2) best: O(n + k) average: O(n)
    * */
    public static void bucketSort(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num: array) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int bucketNum = (max - min) / array.length;
        List<Integer>[] buckets = new List[bucketNum];

        for (int i = 0; i < bucketNum; i++) {
            buckets[i] = new LinkedList<>();
        }

        for (int num: array) {
            buckets[hash(num)].add(num);
        }

        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
        }

        int i = 0;
        // Merge buckets to get sorted array
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                array[i++] = num;
            }
        }
    }

    private static int hash(int num) {
        return num / 10;
    }
    public static void main(String[] args) {
        int[] data = { 4, 3, 4, 5, 6, 9, 1, 5 };
        bucketSort(data);
        System.out.println(Arrays.toString(data));
    }
}
