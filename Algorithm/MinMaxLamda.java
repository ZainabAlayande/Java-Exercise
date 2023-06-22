package Algorithm;

import java.util.Arrays;

public class MinMaxLamda {
    public static void main(String[] args) {
        int[] array = {3, 5, 4, 1, 6, 9};
        swap(array);
    }


    private static void swap (int[] arr) {
        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr));

    }
}
