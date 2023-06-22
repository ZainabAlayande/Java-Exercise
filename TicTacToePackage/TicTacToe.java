package TicTacToePackage;
import java.util.*;

public class TicTacToe {
    Scanner scanner = new Scanner(System.in);
    String[][] ticTacArray;
    Player thePlayer = new Player();


    public TicTacToe(String[][] ticTacArray) {
         thePlayer.player[0] = TicTacValues.O.getName();
         thePlayer.player[1] = TicTacValues.X.getName();
        this.ticTacArray = ticTacArray;
    }

    //Have a board
    //


    public void initializeBoardElementToEmptyString() {
        for (int i = 0; i < ticTacArray.length; i++) {
            for (int j = 0; j < ticTacArray.length; j++) {
                ticTacArray[i][j] = " ";
            }
        }
    }

    public void displayTicTacToeBoard() {
        for (String[] lists : ticTacArray) {
            display(Arrays.toString(lists));
        }
    }


    static void display(String prompt) {
        System.out.println(prompt);
    }


    public void playGame() /**throws IllegalArgumentException*/ {
        thePlayer.collectPlayerName();
        initializeBoardElementToEmptyString();
        displayTicTacToeBoard();
        newLine();
        for (int rowIndex = 0; rowIndex < 5; rowIndex++) {
            for (int columnIndex = 0; columnIndex < thePlayer.player.length; columnIndex++) {
                    System.out.println("take position player " + thePlayer.player[columnIndex]);
                    int currentPosition = scanner.nextInt();
                    int row = (currentPosition - 1) / 3;
                    int col = (currentPosition - 1) % 3;
                    /**if (!ticTacArray[row][col].equals(TicTacValues.EMPTY.getSymbol())) {
                        throw new IllegalArgumentException("Position has been taken");
                    }*/
                    ticTacArray[row][col] = thePlayer.playerName;



                displayTicTacToeBoard();
                winningMoves();

                if (rowIndex == 3) break;

            }
        }
        noWinner_playerDraws();
    }

    private void newLine() {
        System.out.println();
        System.out.println();
    }

    void noWinner_playerDraws() {
        display("");
        display("No winner, Its a Draw!!!");
        System.exit(0);
    }

    public boolean winningMoves() {
        if (ticTacArray[0][0].equals(TicTacValues.X.getName()) &&
                ticTacArray[0][1].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[0][2].equalsIgnoreCase(TicTacValues.X.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[1][0].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[1][1].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[1][2].equalsIgnoreCase(TicTacValues.X.getName())) {
            display("");
            display("You won");
            System.exit(0);

                 } else if (ticTacArray[2][0].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[2][1].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[2][2].equalsIgnoreCase(TicTacValues.X.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[0][0].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[1][0].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[2][0].equalsIgnoreCase(TicTacValues.X.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[0][1].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[1][1].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[2][1].equalsIgnoreCase(TicTacValues.X.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[0][2].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[1][2].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[2][2].equalsIgnoreCase(TicTacValues.X.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[0][0].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[1][1].equalsIgnoreCase(TicTacValues.X.getName()) &&
                ticTacArray[2][2].equalsIgnoreCase(TicTacValues.X.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[0][0].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[0][1].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[0][2].equalsIgnoreCase(TicTacValues.O.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[1][0].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[1][1].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[1][2].equalsIgnoreCase(TicTacValues.O.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[2][0].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[2][1].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[2][2].equalsIgnoreCase(TicTacValues.O.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[0][0].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[1][0].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[2][0].equalsIgnoreCase(TicTacValues.O.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[0][1].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[1][1].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[2][1].equalsIgnoreCase(TicTacValues.O.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[0][2].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[1][2].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[2][2].equalsIgnoreCase(TicTacValues.O.getName())) {
            display("");
            display("You won");
            System.exit(0);

        } else if (ticTacArray[0][2].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[1][1].equalsIgnoreCase(TicTacValues.O.getName()) &&
                ticTacArray[2][0].equalsIgnoreCase(TicTacValues.O.getName())) {
            display("");
            display("You won");
            System.exit(0);
        }
        return true;
    }

    public boolean isEmpty() {
        initializeBoardElementToEmptyString();
        for (int i = 0; i < ticTacArray.length; i++) {
            for (int j = 0; j < ticTacArray.length; j++) {
                if (Objects.equals(ticTacArray[i][j], " ")) return true;
            }
        }
        return false;
    }
}


