package Algorithm;

import java.util.Arrays;

public class ReverseArrayWithTwoPointerTechnique {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    private static int[] reverseArray(int[] array) {
        int temp = 0;
        int left = 0;
        int right = array.length-1;

        while (left < right) {
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        return array;
    }
}
