package LeetCodeAlgorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int[] array = {1, 1, 2, 2, 3, 4, 4, 4, 4, 5, 5, 6, 7, 8, 9, 9, 9, 9};

        for (int num: array) {
            set.add(num);
        }

        System.out.println(Arrays.toString(set.toArray()));
    }
}
