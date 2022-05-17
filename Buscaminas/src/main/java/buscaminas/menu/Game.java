package buscaminas.menu;
import buscaminas.board.Board;
import buscaminas.player.Player;
import buscaminas.utils.Choose;
import buscaminas.utils.Text;
import lombok.NoArgsConstructor;

import java.util.Scanner;
public class Game {
    private static Board board;
    private static Player player ;
    private static final Scanner scanner = new Scanner(System.in);
    public static void start() {
        Text.titleMinesweeper();
        Text.chooseNamePlayer();;
        player = new Player(scanner.nextLine());
        Text.chooseBoard();
        switch (Choose.chooseInt(1,4)) {
            case 1 -> generateBoard(8, 8, 10);
            case 2 -> generateBoard(16, 16, 40);
            case 3 -> generateBoard(16, 30, 99);
            case 4 -> customBoard();
        }
        play();
    }
    private static void generateBoard(int rows, int cols, int mines) {
        board = new Board(rows, cols, mines);
        board.generateMines();
    }
    private static void customBoard() {
        System.out.println("Introduce el número de filas");
        int rows = Choose.chooseInt(1, 30);
        System.out.println("Introduce el número de columnas");
        int cols = Choose.chooseInt(1, 30);
        System.out.println("Introduce el número de minas");
        int mines = Choose.chooseInt(1, rows * cols - 1);
        generateBoard(rows, cols, mines);
        board.generateMines();
    }
    private static void play() {
        board.print();
    }


}
