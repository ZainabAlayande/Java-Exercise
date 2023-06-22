package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ClassHashMap {

    public static void main(String[] args) {
        Map<String, String[]> statesInNigeria = new HashMap<>();
        statesInNigeria.put("Akwa-Ibom", new String[]{"goat", "cow"});
        statesInNigeria.put("Niger", new String[]{"cat", "lion"});
        statesInNigeria.put("Lagos", new String[]{"dog", "ram"});
        statesInNigeria.put("Oyo", new String[]{"monkey", "donkey"});
        statesInNigeria.put("Osun", new String[]{"mouse", "rat"});
        statesInNigeria.put("Cross-River", new String[]{"fish", "hen"});

        statesInNigeria.keySet().forEach(k ->
                System.out.print(k + Arrays.toString(statesInNigeria.get(k)) + "´\n"));

        System.out.println();
        statesInNigeria.keySet().forEach(k -> Arrays.sort(statesInNigeria.get(k)));
        statesInNigeria.forEach((key, value) -> System.out.println(key + " : " + Arrays.toString(value)));
//        System.out.println("Map--> " + statesInNigeria);

        System.out.println();
        Map<String, Integer> people = new TreeMap<>();
        people.put("Zainab", 109);
        people.put("Damian", 85);
        people.put("Balablu", 149);
        System.out.println(people);
    }
}
