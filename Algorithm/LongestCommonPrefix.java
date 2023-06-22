package Algorithm;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] array = {"plower", "ilow", "llight"};
        System.out.println(getLongestCommonPrefix(array));

    }

    private static String getLongestCommonPrefix(String[] array) {
        String prefix = array[0];

        for (int i = 1; i <= array.length - 1; i++) {
            while (array[i].indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);

            if (prefix == "")
                return "";
        }

        return prefix;
    }
}
