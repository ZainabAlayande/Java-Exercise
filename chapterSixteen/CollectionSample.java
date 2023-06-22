package chapterSixteen;

import java.util.*;

public class CollectionSample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(30);
        List<Integer> number = new LinkedList<>();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<String> words = Arrays.asList("erre", "ghfg");

        List<String> names = List.of("James", "Birthday geh", "Austin");
        nums.add(7);
        nums.add(90);
        nums.add(23);
        nums.add(89);
        nums.add(30);
        //nums.add(6, 20);
        //System.out.println(nums);


        List<Integer> syncList = Collections.synchronizedList(nums);
        syncList.add(87);
        syncList.add(12);
        syncList.add(20);

        Set<String> strings = new TreeSet<>();
        strings.add("Lade");
        strings.add("Moyin");
        strings.add("AbdulMalik");
        strings.add("Greenade");
        System.out.println(strings);




//        System.out.println(integerList);
//        System.out.println(syncList);


    }
}
