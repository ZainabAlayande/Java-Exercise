import ArrayLists.List;

import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        Arrays.stream(array).filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x));
    }
}
