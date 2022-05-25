package connecta4.board;
import connecta4.box.Box;
import connecta4.player.Player;
import connecta4.player.PlayerManager;
import connecta4.utils.Text;
import java.util.Objects;
public class Board {
    private final Box[][] board;
    private final int rows = 6;
    private final int columns = 7;
    private int cardsOcuped = 0;
    public Board() {
        board = new Box[rows][columns];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Box();
            }
        }
    }
    public void print() {
        printNumbersHorizontaly();
        for (int i = 0; i < board.length; i++) {
            System.out.print(" ( " + i + " ) ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    private void printNumbersHorizontaly() {
        for (int e = 0; e < board[0].length; e++) {
            if (e == 0) {
                System.out.print("       ");
            }
            System.out.print(" ( " + e + " ) ");
            if (e == board[0].length - 1) {
                System.out.println();
            }
        }
    }
    public boolean insert(int column, Player player) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][column].isEmpty()) {
                board[i][column].setPlayer(player);
                cardsOcuped++;
                if (isWinner(i, column, player)) {
                    print();
                    Text.win(Objects.requireNonNull(PlayerManager.getPlayerById(player.getId())));
                    System.exit(1);
                } else if (isDraw()) {
                    Text.draw();
                    System.exit(1);
                }
                return true;
            }
        }
        return false;
    }
    public boolean isDraw() {
        return (cardsOcuped == rows * columns);
    }
    public boolean isWinner(int row, int column, Player player) {
        return (checkHorizontal(row, player) || checkVertical(column, player) || checkDiagonalRight(row, column, player) || checkDiagonalLeft(row, column, player));
    }
    private boolean checkHorizontal(int row, Player player) {
        int count = 0;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i].getPlayer() == player) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }
    private boolean checkVertical(int column, Player player) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column].getPlayer() == player) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }
    private boolean checkDiagonalRight(int row, int column, Player player) {
        int count = 0;
        for (int i = -3; i <= 3; i++) {
            if (row + i >= 0 && row + i < board.length && column + i >= 0 && column + i < board[row].length) {
                if (board[row + i][column + i].getPlayer() == player) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean checkDiagonalLeft(int row, int column, Player player) {
        int count = 0;
        for (int i = -3; i <= 3; i++) {
            if (row + i >= 0 && row + i < board.length && column - i >= 0 && column - i < board[row].length) {
                if (board[row + i][column - i].getPlayer() == player) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}