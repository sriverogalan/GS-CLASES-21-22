package buscaminas.board;

import buscaminas.box.Box;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Board {
    private int rows;
    private int columns;
    private int mines;
    private Box[][] board;
    public Board(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;

        board = new Box[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = new Box();
            }
        }
        this.putMines();
    }
    public void print() {
        for (int i = 0; i < rows; i++) {
            if (i == 0) {
                printVerticaly(i);
            }
            for (int j = 0; j < columns; j++) {
                if (j == 0) {
                    System.out.print("( " + i +" ) ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void printUncoverBoard() {
        for (int i = 0; i < rows; i++) {
            if (i == 0) {
                printVerticaly(i);
            }
            for (int j = 0; j < columns; j++) {
                if (j == 0) {
                    System.out.print("( " + i +" ) ");
                }
                System.out.print(board[i][j].printUncovered()+ " ");
            }
            System.out.println();
        }
    }
    public void printVerticaly(int i) {
        int counter = 0;
        for (int e = 0; e < board[i].length; e++) {
            if (e == 0) {
                System.out.print("      ");
            }
            System.out.print("( " + counter + " ) ");
            counter++;
            if (e == board[i].length - 1) {
                System.out.println();
            }
        }
    }
    public void putMines() {
        for (int i = 0; i < this.mines; i++) {
            int row = (int) (Math.random() * rows);
            int column = (int) (Math.random() * columns);
            if (board[row][column].isMine()) i--;
            board[row][column].setMine(true);
        }
        calculateMinesAround();
    }
    public void calculateMinesAround() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].isMine()) {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k >= 0 && k < rows && l >= 0 && l < columns) {
                                board[k][l].setMinesAround(board[k][l].getMinesAround() + 1);
                            }
                        }
                    }
                }
            }
        }
    }
    public void openBox(int row, int column) {
        if (board[row][column].isMine()) {
            board[row][column].setOpen(true);
        } else {
            board[row][column].setOpen(true);
            if (board[row][column].getMinesAround() == 0) {
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = column - 1; j <= column + 1; j++) {
                        if (i >= 0 && i < rows && j >= 0 && j < columns) {
                            if (!board[i][j].isOpen()) {
                                openBox(i, j);
                            }
                        }
                    }
                }
            }
        }
    }
    public void putFlag(int row, int column) {
        if (board[row][column].isOpen()) return;
        if (board[row][column].isFlag()) {
            board[row][column].setFlag(false);
        } else {
            board[row][column].setFlag(true);
        }
    }
    public boolean isWin() {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (!board[i][j].isMine() && board[i][j].isOpen()) {
                    count++;
                }
            }
        }
        if (count == rows * columns - mines) {
            return true;
        }
        return false;
    }
    public boolean isLose() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].isMine() && board[i][j].isOpen()) {
                    return true;
                }
            }
        }
        return false;
    }
}