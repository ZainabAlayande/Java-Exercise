package LeetCodeQuestions;

import ArrayLists.ArrayList;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(101);

        }

    private static ArrayList fizzBuzz(int lengthOfNumber) {
        ArrayList res = new ArrayList();
        for (int i = 1; i <= lengthOfNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add(Integer.parseInt("FizzBuzz"));
            } else if (i % 3 == 0) {
                res.add(Integer.parseInt("Fizz"));
            } else if (i % 5 == 0) {
                res.add(Integer.parseInt("Buzz"));
            } else {
                res.add(Integer.parseInt(Integer.toString(i)));
            }
        }
        return res;
    }
}

