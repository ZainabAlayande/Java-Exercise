package Algorithm;

public class CountDigit {
    int returnDigit(String[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }
        String temporary = String.valueOf(stringBuilder);
        String[] newArray = new String[temporary.length()];

        for (int i = 0; i < temporary.length(); i++) {
            newArray[i] = String.valueOf(temporary.charAt(i));
        }

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
                "X", "Y", "Z"};

        int countOfLetter = 0;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (newArray[i].contains(alphabet[j]))
                    countOfLetter++;
            }
        }
        int length = newArray.length;
        return length - countOfLetter;
    }
}
