package connecta4.board;

import connecta4.box.Box;
import connecta4.player.Player;

public class Board {
    private final Box[][] board;
    private final int rows = 6; // 6 filas
    private final int columns = 7; // 7 columnas

    public Board() {
        board = new Box[rows][columns];
        /*GENERAMOS EL TABLERO*/
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Box();
            }
        }
    }

    public void print() {
        int horizontalCounter = 0;
        for (int i = 0; i < board.length; i++) {
            if (i == 0) {
                printNumbersVerticaly(i);
            }
            System.out.print(" ( " + horizontalCounter++ + " ) ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private void printNumbersVerticaly(int i) {
        int contadorVertical = 0;
        for (int e = 0; e < board[i].length; e++) {
            if (e == 0) {
                System.out.print("       ");
            }
            System.out.print(" ( " + contadorVertical + " ) ");
            contadorVertical++;
            if (e == board[i].length - 1) {
                System.out.println();
            }
        }
    }

    public boolean uncover(int column, Player player) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][column].isEmpty()) {
                board[i][column].setEmpty(false);
                board[i][column].setName(player.getInitial());
                board[i][column].setColor(player.getColor());
                return true;
            }
        }
        return false;
    }
    public boolean isDraw() {
        for (Box[] boxes : board) {
            for (Box box : boxes) {
                if (box.isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isWin() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].isEmpty()) {
                    continue;
                }
                if (i + 3 < board.length) {
                    if (board[i][j].getName().equals(board[i + 1][j].getName()) &&
                        board[i][j].getName().equals(board[i + 2][j].getName()) &&
                        board[i][j].getName().equals(board[i + 3][j].getName())) {
                        return true;
                    }
                }
                if (j + 3 < board[i].length) {
                    if (board[i][j].getName().equals(board[i][j + 1].getName()) &&
                        board[i][j].getName().equals(board[i][j + 2].getName()) &&
                        board[i][j].getName().equals(board[i][j + 3].getName())) {
                        return true;
                    }
                }
                if (i + 3 < board.length && j + 3 < board[i].length) {
                    if (board[i][j].getName().equals(board[i + 1][j + 1].getName()) &&
                        board[i][j].getName().equals(board[i + 2][j + 2].getName()) &&
                        board[i][j].getName().equals(board[i + 3][j + 3].getName())) {
                        return true;
                    }
                }
                if (i + 3 < board.length && j - 3 >= 0) {
                    if (board[i][j].getName().equals(board[i + 1][j - 1].getName()) &&
                        board[i][j].getName().equals(board[i + 2][j - 2].getName()) &&
                        board[i][j].getName().equals(board[i + 3][j - 3].getName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}