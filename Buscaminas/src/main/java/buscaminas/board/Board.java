package buscaminas.board;

import buscaminas.box.Box;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private int rows;
    private int columns;
    private int mines;
    private int flags = mines;
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
    }

    public void print() {
        printNumbersHorizontaly();
        for (int i = 0; i < rows; i++) {
            System.out.print(" ( " + i + " ) ");
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    private void printNumbersHorizontaly() {
        for (int e = 0; e < board[0].length; e++) {
            if (e == 0) {
                System.out.print("      ");
            }
            System.out.print(" ( " + e + " )");
            if (e == board[0].length - 1) {
                System.out.println();
            }
        }
    }
    public void generateMines() {
        int minesLeft = mines;
        int row = (int) (Math.random() * rows);
        int column = (int) (Math.random() * columns);

        board[row][column].setMine(true);
        minesLeft--;

        while (minesLeft > 0) {
            row = (int) (Math.random() * rows);
            column = (int) (Math.random() * columns);

            if (!board[row][column].isMine()) {
                board[row][column].setMine(true);
                minesLeft--;
            }
        }
    }
    public void putFlag(int row, int column) {
        if (!board[row][column].isOpen()) {
            if (board[row][column].isFlag()) {
                board[row][column].setFlag(false);
                flags = flags--;
            } else {
                board[row][column].setFlag(true);
                flags = flags--;
            }
        }
    }





}