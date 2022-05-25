package buscaminas.menu;

import buscaminas.board.Board;
import buscaminas.player.Player;
import buscaminas.utils.Text;
import lombok.Getter;

import java.util.Scanner;

public class Game {
    private static final Scanner scanner = new Scanner(System.in);
    @Getter private static Board board;
    private static Player player;
    public static void start() {
        Text.welcome(); // Welcome message
        Text.chooseNamePlayer(); // Player name
        player = new Player(scanner.nextLine());
        Text.chooseDifficulty();
        switch (scanner.nextInt()) {
            case 1 -> generateBoard(8, 8, 10);
            case 2 -> generateBoard(16, 16, 40);
            case 3 -> generateBoard(16, 30, 99);
            case 4 -> customBoard();
        }
        play();
    }
    private static void generateBoard(int rows, int cols, int mines) {
        board = new Board(rows, cols, mines);
    }
    private static void customBoard() {
        Text.enterRows();
        int rows = scanner.nextInt();
        Text.enterCols();
        int cols = scanner.nextInt();
        Text.enterMines();
        int mines = scanner.nextInt();
        generateBoard(rows, cols, mines);
    }
    private static void play() {
        Text.separation();
        board.print();
        menu();
    }
    public static void menu() {
        Text.menuChoose();
        switch (scanner.nextInt()) {
            case 1 -> {
                Text.openBox();
                board.openBox(scanner.nextInt(),scanner.nextInt());
            }
            case 2 -> {
                Text.putFlag();
                board.putFlag(scanner.nextInt(),scanner.nextInt());
            }
            case 3 -> quit();
        }
        if (board.isWin()) {
            board.printUncoverBoard();
            Text.hasWinned(player);
            quit();
        } else if (board.isLose()) {
            board.printUncoverBoard();
            Text.hasLose(player);
            quit();
        }
        play();
    }
    private static void quit() {
        Text.quit(player);
        System.exit(-1);
    }
}