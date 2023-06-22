package Algorithm;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String[] the_arr = {"h", "e", "l", "l", "o"};
        System.out.println(Arrays.toString(reverseString(the_arr)));
        System.out.println(Arrays.toString(reverseString(the_arr)));
        System.out.println(Arrays.toString(methodSystemArrayCopy(the_arr)));

    }

    public static String[] reverseString(String[] the_string) {
        int index = 0;
        String[] array = new String[the_string.length];
        for (int i = the_string.length - 1; i >= 0; i--) {
            array[index] = the_string[i];
            index++;
        }

        return array;
    }

    private static String[] methodSystemArrayCopy(String[] the_string) {
        String[] newArray = new String[the_string.length];
        System.arraycopy(the_string,the_string.length-1, newArray, 0, the_string.length);
//        System.arraycopy(array, 0, newArray, 0, newArray.length);


        return newArray;
    }

    public static String[] reverseArrayWithTwoPointer(String[] the_string) {
        String[] arr = {"h", "e", "l", "l", "o"};

        int left = 0;
        int right = the_string.length - 1;
        String temp;

        while (left < right) {
            temp = the_string[left];
            the_string[left] = the_string[right];
            the_string[right] = temp;
            left++;
            right--;
        }

        return the_string;
    }


}
