package Algorithm;

public class WordTokenization {

    public String[] tokenizeString(String string) {
        String regex;
        if (string.contains("/"))
            regex = "/";

        else if (string.contains("-")) {
            regex = "-";
        }

        else if (string.contains(",")) {
            regex = ",";
        }

        else if (string.contains("_")) {
            regex = "_";
        }

        else regex = " ";

        String[] delimeter = string.split(regex);
        return delimeter;
    }


}
