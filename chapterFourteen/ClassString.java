package chapterFourteen;

public class ClassString {
    public static void main(String[] args) {
        String s = new String("hello");
        char[] charArray = new char[5];

        System.out.println(s);

        String theString = "Hello World";

        for (int i = theString.length() - 1; i >= 0; i--) {
            System.out.print(theString.charAt(i));
        }

        System.out.println();
        System.out.println();

        theString.getChars(0, 5, charArray, 0);

        for (char chars: charArray) {
            System.out.println(chars);
        }
    }
}
