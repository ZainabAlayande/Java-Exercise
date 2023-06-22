package TicTacToePackage;
import java.util.Scanner;
public class Player {
    Scanner scanner = new Scanner(System.in);
    String[] player = new String[2];
    static int currentPlayer;
    public  String symbol;
    public String playerName;
    String playerOne = TicTacValues.X.getName();
    String playerTwo = TicTacValues.O.getName();

    public Player() {
        if (currentPlayer == 0) {
            symbol = TicTacValues.X.getSymbol();
            playerName = playerOne;
        }

        else if (currentPlayer == 1) {
            symbol = TicTacValues.O.getSymbol();
            playerName = playerTwo;
        }

        incrementCurrentPlayer();
    }


    public static void incrementCurrentPlayer() {
        currentPlayer++;
        //if (currentPlayer >= 1) currentPlayer = 0;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void collectPlayerName() {
        System.out.println();
        System.out.println("Enter name of player one");
        player[0] = scanner.next();


        System.out.println("Enter name player two");
        player[1] = scanner.next();
        System.out.println();
    }
}