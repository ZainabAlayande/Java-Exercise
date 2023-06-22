package Algorithm;

import static java.lang.Character.codePointAt;

public class ArrangeLetterAlphabetically {
    public static void main(String[] args) {
        char[] array = {'C', 'T', 'O', 'A', 'Z', 'S'};
        System.out.println(ArrangeLetterAlphabetically.arrangeLetter(array));
    }


    public static char[] arrangeLetter(char[] charArray) {
        // TODO: 5/2/2023 {'C', 'T', 'O', 'A', 'Z', 'S'}
        String[] newCharArray = new String[charArray.length];

        int highestLetterInTermsOfAscii = charArray[0];

        for (int i = 0; i < charArray.length - 1; i++) {
            int currentLetter = charArray[i];
            int nextLetter = charArray[i + 1];
            if (currentLetter > nextLetter);
            int temp = currentLetter;
            currentLetter = nextLetter;
            nextLetter = temp;
        }


        return charArray;
    }
}
