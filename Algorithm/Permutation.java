package Algorithm;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        int[] array = {1, 2, 3};
        permutation.permuteNumber(array);
    }

    public int[][] permuteNumber(int[] array) {
        int[][] newArray = new int[3][6];
        // TODO: 4/11/2023 [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]


        int currentIndex = 0;
        for (int i = 0; i < array.length; i++) {
            swap(array, i, currentIndex);
            System.out.println(Arrays.deepToString(permuteNumber(array)));
            swap(array, i, currentIndex + 1);
        }
        return newArray;
    }

    private void swap(int[] array, int i, int currentIndex) {
        int temp = array[i];
        array[i] = array[currentIndex];
        array[currentIndex] = array[i];
    }

}

