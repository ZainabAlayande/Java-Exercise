package Algorithm;

import java.util.ArrayList;

public class Sudoku {

    public static void main(String[] args) {

        char[][] charArray = new char[][]{{
                '5', '3', '.', '.', '7', '.', '.', '.', '.',
                '6', '.', '.', '1', '9', '5', '.', '.', '.',
                '.', '9', '8', '.', '.', '.', '.', '6', '.',
                '8', '.', '.', '.', '6', '.', '.', '.', '3',
                '4', '.', '.', '8', '.', '3', '.', '.', '1',
                '7', '.', '.', '.', '2', '.', '.', '.', '6',
                '.', '6', '.', '.', '.', '.', '2', '8', '.',
                '.', '.', '.', '4', '1', '9', '.', '.', '5',
                '.', '.', '.', '.', '8', '.', '.', '7', '9'
        }};

        theSudoku(charArray);



    }

    public static boolean theSudoku(char[][] board) {
        int temp = 0;
        ArrayList<Character> rowContainer = new ArrayList<>();
        ArrayList<char[]> columnContainer = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                for (int k = 0; k < board.length; k++) {
                    rowContainer.add(board[i][j]);

                }

            }

        }







        return false;
    }
}
