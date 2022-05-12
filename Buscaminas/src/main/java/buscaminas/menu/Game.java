package buscaminas.menu;

import buscaminas.board.Board;
import buscaminas.utils.Choose;
import buscaminas.utils.Text;

import java.util.Scanner;

public class Game {
    private static Board board;
    private static final Scanner scanner = new Scanner(System.in);
    public static void start() {
        switch (Choose.chooseInt(1,4)) {
            case 1 -> generateBoard(8, 8, 10);
            case 2 -> generateBoard(16, 16, 40);
            case 3 -> generateBoard(16, 30, 99);
            case 4 -> customBoard();
        }
    }
    private static void generateBoard(int rows, int cols, int mines) {
        board = new Board(rows, cols, mines);
    }
    private static void customBoard() {
        System.out.println("Introduce el número de filas");
        int rows = Choose.chooseInt(1, 30);
        System.out.println("Introduce el número de columnas");
        int cols = Choose.chooseInt(1, 30);
        System.out.println("Introduce el número de minas");
        int mines = Choose.chooseInt(1, rows * cols - 1);
        generateBoard(rows, cols, mines);
    }

    public static void play() {
        board.print();
        while (!board.isFinished()) {
            int row = Choose.chooseInt(0, board.getRows() - 1);
            int col = Choose.chooseInt(0, board.getColumns() - 1);
            board.reveal(row, col);
        }
        board.print();
        if (board.isWin()) {
            Text.hasWinned();
        } else {
            Text.hasLost();
        }
    }

}
