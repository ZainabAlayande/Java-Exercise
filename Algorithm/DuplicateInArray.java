package Algorithm;

import java.util.Arrays;

public class DuplicateInArray {

    public static void main(String[] args) {
        char[] array = {5, 5, 1, 8, 2, 2, 7, 3, 4, 4, 9};

        System.out.println(check(array));

    }

    public static boolean check(char[] array) {
        int[] result = new int[array.length];
        Arrays.sort(array);
        int mover = 0;
//        1, 2, 2, 3, 4, 4, 5, 5, 7, 8, 9;

        result[mover] = array[0];
//        [1,  ,  ,  ,  ,  ,]

        for (int i = 1; i < array.length; i++) {
            if (array[mover] == array[i])
                mover++;


        }

        return true;
    }
}
