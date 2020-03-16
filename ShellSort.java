package Weekly.Week11Sorting;

import java.util.Arrays;

public class ShellSort{
    public static void shellSort(int array[], int n){
        for (int gap = n/2; gap > 0; gap /= 2){
            for (int i = gap; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap){
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    public static void main(String args[]){
        int[] data={9, 8, 3, 7, 5, 6, 4, 1};
        int size=data.length;
        shellSort(data, size);
        System.out.println(Arrays.toString(data));
    }
}
