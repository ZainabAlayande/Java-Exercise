package Algorithm;

import chapterSeven.Array;

import java.util.Arrays;

public class SortUnsortedArray {

    public static void main(String[] args) {

        int[] arr = {98, 23, 12, 56};
        System.out.println(Arrays.toString(sortArray(arr)));


    }

    public static int[] sortArray(int[] theArray) {
        int left = 0;
        int right = theArray.length - 1;
        int temp = 0;

        int[] arr = {98, 23, 12, 56};

        while (left < right) {
            if (theArray[left] > theArray[right])
                temp = theArray[left];
            theArray[left] = theArray[right];
            theArray[right] = temp;
            left++;
            right--;

        }
        return theArray;
    }
}
