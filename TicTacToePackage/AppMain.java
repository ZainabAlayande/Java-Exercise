package TicTacToePackage;

import java.util.Scanner;

public class AppMain {
    static Scanner keyboardInputCollector = new Scanner(System.in);
        public static void main(String[] args) /**throws IllegalArgumentException*/ {
            String[][] ticTacArray = new String[3][3];
            TicTacToe ticTacToe = new TicTacToe(ticTacArray);

            welcomeToTicTacGame();
            ticTacToe.playGame();
        }

    static void welcomeToTicTacGame() {
        display("""
                ===============================
                         TIC TAC TOE GAME
                ===============================
                           TWO PLAYERS
                ===============================\040\040\040\040\040\040\040\040\040\040
                """);
    }

    static void display(String prompt) {
        System.out.println(prompt);
    }

    static String input(String prompt) {
        System.out.println(prompt);
        return keyboardInputCollector.next();
    }

    static int input(int number) {
        System.out.println(number);
        return keyboardInputCollector.nextInt();
    }
    }

