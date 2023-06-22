package Algorithm;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 7, 6, 2, 1, 4};
        System.out.println(Arrays.toString(getSortedNumbers(arr)));
    }
    public static int[] getSortedNumbers(int[] array) {
        // TODO: 4/9/2023 [1, 2, 3, 4, 5, 7, 6]
        for (int i = 0; i < array.length - 1; i++) {
                int currentValue = array[i]; // TODO: 4/9/2023  value 5
                int minimum = getMinimumValue(array); // TODO: 4/9/2023  minimum 4
                int indexOfMinimumValue = getIndexOfMinimumValue(array); // TODO: 4/9/2023  index 4
                array[indexOfMinimumValue] = currentValue;
                array[i] = minimum;

        }
        return array;
    }

    private static int getIndexOfMinimumValue(int[] array) {
        int minimumIndex = 0;
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }

//    private static int getIndexOfMinimumValue(int[] array) {
//        int minimumIndex = 0;
//        int mimimum = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < mimimum)
//                mimimum = array[i];
//                minimumIndex = i;
//        }
//        return minimumIndex;
//    }

    private static int getMinimumValue(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum)
                minimum = array[i];

        }
        return minimum;
    }


    private static int[] deleteCurrentMinimum(int minimum, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minimum) {
                continue;
            }
        }
        return array;
    }
}
