package LeetCodeQuestions;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(6690));
    }

    private static boolean isPalindrome(int number) {
        if (number <= 0 || number % 10 == 0) {
            return false;
        }

        String numberToString = String.valueOf(number);
        String sameNumberToString = String.valueOf(number);
        char[] charArrayTwo = sameNumberToString.toCharArray();
        char[] charArray = numberToString.toCharArray();
        int count = 0;
        int lastIndex = charArray.length - 1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charArrayTwo[lastIndex])
                count = count + 1;
            System.out.println(count);
            lastIndex--;

            if (count == charArray.length)
                return true;
        }

        System.out.println(count);
        return false;
    }
}
