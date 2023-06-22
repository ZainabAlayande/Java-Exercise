package chapterSixteen;

import java.util.*;

public class WordTypeCount {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);

    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (String key: sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());

    }

    private static void createMap(Map<String, Integer> myMap) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");

        for (String token: tokens) {
            String word = token.toLowerCase();

            if (myMap.containsKey(word)) {
                int count = myMap.get(word);
                System.out.println(count);
                myMap.put(word, count + 1);
            }
            else {
                myMap.put(word, 1);
            }
        }
    }


}
