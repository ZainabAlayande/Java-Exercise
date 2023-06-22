package ChapterNine;

import java.util.Arrays;

public class TheString {

    public static void main(String[] args) {

        int[] array = {10, 12, 3, 4};
        int[] arrayTwo = new int[4];

        int index = 0;
        for (int i = array.length -1; i >= 0; i--) {
            arrayTwo[index] = array[i];
            index++;
        }

        System.out.println(Arrays.toString(arrayTwo));
    }

}
