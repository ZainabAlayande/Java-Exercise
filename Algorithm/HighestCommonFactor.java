package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class HighestCommonFactor {
    // TODO: 4/14/2023 5, 10

    public static void main(String[] args) {
        System.out.println(getHighestFactors(90, 36, 270));
    }

    public static List<Integer> getHighestFactors(int... variable) {
        List<Integer> allowMe = new ArrayList<>();
        int divisor = 2;
        int count;

        int length = variable.length;
        for (int i = 0; i < length; i++) {
            count = 0;
            for (int j = 0; j < variable.length; j++) {
                if (variable[j] % divisor == 0) {
                    count++;
                    variable[j] = variable[j] / divisor;
                }
            }

            if (count == 0)
                divisor++;
            length++;

            if (count == variable.length)
                allowMe.add(divisor);


        }
        return allowMe;
    }


}