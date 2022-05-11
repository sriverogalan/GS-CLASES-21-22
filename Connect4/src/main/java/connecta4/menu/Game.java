package connecta4.menu;

import connecta4.board.Board;
import connecta4.player.Player;
import connecta4.player.PlayerManager;
import connecta4.utils.Colors;
import connecta4.utils.Text;

import java.util.Objects;
import java.util.Scanner;

public class Game {
    private static Scanner scanner = new Scanner(System.in);
    private static Board board = new Board();

    public static void jugar() {
        try {
            Text.principal();
            createPlayers(2);
            startGame();
        } catch (Exception e) {
            jugar();
        }
    }

    public static void createPlayers(int numeroJugadores) {
        for (int i = 0; i < numeroJugadores; i++) {
            Scanner scan = new Scanner(System.in);
            Text.chooseName(i);
            String name = scanner.nextLine();
            Text.chooseColor(i);
            switch (scanner.nextInt()) {
                case 1 -> PlayerManager.addPlayer(new Player(name, Colors.RED));
                case 2 -> PlayerManager.addPlayer(new Player(name, Colors.GREEN));
                case 3 -> PlayerManager.addPlayer(new Player(name, Colors.PURPLE));
                case 4 -> PlayerManager.addPlayer(new Player(name, Colors.YELLOW));
                default -> PlayerManager.addPlayer(new Player(name, Colors.CYAN));
            }
        }
    }

    private static void printBoard() {
        Text.separation();
        board.print();
        Text.columnToWhichYouWantToInSertCard();
    }

    public static void startGame() {
        int column;
        for (int i = 0; i < 21; i++) {
            turnPlayer(1);
            turnPlayer(2);
        }
    }

    public static void turnPlayer(int playerId) {
        Scanner scan = new Scanner(System.in);
        printBoard();
        Text.turnPlayer(Objects.requireNonNull(PlayerManager.getPlayerById(playerId)));
        if (!board.uncover(scan.nextInt(), PlayerManager.getPlayerById(playerId))) {
            Text.errorChooseColumns();
            turnPlayer(playerId);
        }
        if (board.isDraw()) {
            Text.draw();
            System.exit(0);
        }
        if (board.isWin(PlayerManager.getPlayerById(playerId))) {
            board.print();
            Text.win(PlayerManager.getPlayerById(playerId));
            System.exit(0);
        }
    }
}
