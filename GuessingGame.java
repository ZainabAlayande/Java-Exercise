import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number to guess: ");
        int number = scanner.nextInt();

        //System.out.println(getRandomNumber(number));

    }

//    public static String getRandomNumber(int userInput) {
//        Random random = new Random();
//        int numberToBeGuessed =  1 + random.nextInt(100);
//
//        do {
//                if (userInput > numberToBeGuessed)
//                    return "Number too high";
//
//                else if (userInput < numberToBeGuessed)
//                    return "Number too low";
//
//                else return "Congrats, ";
//
//            } while (userInput != numberToBeGuessed);
//
//
//            }
//
//catch (IllegalArgumentException error) {
//        System.out.println(error.getMessage());
//        scanner.nextLine();
//        return null;
//    }
}
