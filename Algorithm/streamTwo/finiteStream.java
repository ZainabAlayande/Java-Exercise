package Algorithm.streamTwo;

import java.util.Optional;
import java.util.stream.Stream;

public class finiteStream {
    public static void main(String[] args) {
        Stream stream = Stream.of(1, 2, 3, 4, 5);
        //stream.forEach(System.out::println);

        Stream<Integer> stream1 = Stream.empty();
        //stream1.forEach(System.out:: println);

        System.out.println(Stream.generate(() -> 1)
                .limit(10)
                .reduce((x, y) -> (x + y)));

    }
}
