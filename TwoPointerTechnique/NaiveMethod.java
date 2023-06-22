package TwoPointerTechnique;

import java.util.Arrays;

public class NaiveMethod {
    public static void main(String[] args) {
        int[] array = { 8, 9, 5, 2,11, 10, 3 };
        int value = 17;

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //System.out.println(isPairSum(array, array.length, value));
    }

    private static int isPairSum(int[] A, int N, int X) {
        // Nested for loops for iterations
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // As equal i and j means same element
                if (i == j)
                    // continue keyword skips the execution
                    // for following condition
                    continue;
                // Condition check if pair exists
                if (A[i] + A[j] == X)
                    return 1;
                // By now the array is sorted
                if (A[i] + A[j] > X)
                    // Break keyword to hault the execution
                    break;
            }
        }
        // No pair found with given sum.
        return 0;
    }
}

