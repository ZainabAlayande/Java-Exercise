package Algorithm;

import java.util.Scanner;

public class Femi {

    public static void main(String[] args) {
        //threeConsecutiveNumber();
        System.out.println(forFemi( 3,9, 1));
    }

    public static int forFemi(int threeConsecutiveNumber, int number, int index) {
        int[] newArray = new int[threeConsecutiveNumber];
        int middleNumber = number/3;
        newArray[1] = middleNumber;
        newArray[0] = middleNumber - 1;
        newArray[2] = middleNumber + 1;

        return newArray[index];
    }




}
