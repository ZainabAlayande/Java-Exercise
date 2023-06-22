package Algorithm;

public class SquareRoot {


    public int getSquareRoot(int number) {

        if (number == 0) return 0;
        int result;
        int multiplier = 1 ;

        do {
            result = multiplier * multiplier;
            multiplier++;

        } while (result != number);

        return multiplier;

//        if (number == 0) return 0;
//        int result = 1;
//        int multiplier;
//        do {
//            for (multiplier = 1; multiplier <= number/2; multiplier++) {
//                result = multiplier * multiplier;
//                if (result == number) break;
//            }
//        } while (result != number);
//        return multiplier;
    }

    public int getSquare(int number) {
        if (number == 0) return 0;
        int result;
        int multiplier = 1;

        do {
                result = multiplier * multiplier;
                multiplier++;

        } while (result != number);

        return multiplier;
    }



}
