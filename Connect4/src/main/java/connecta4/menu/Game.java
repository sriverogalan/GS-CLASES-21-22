package connecta4.menu;

import connecta4.board.Board;
import connecta4.player.Player;
import connecta4.player.PlayerManager;
import connecta4.utils.Colors;
import connecta4.utils.Text;

import java.util.Objects;
import java.util.Scanner;

import static connecta4.utils.Choose.*;

public class Game {
    private static final Board board = new Board();
    public static void play() {
        Text.principal();
        createPlayers(2);
        startGame();
    }
    public static void createPlayers(int numPlayers) {
        for (int i = 0; i < numPlayers; i++) {
            Scanner scan = new Scanner(System.in);
            Text.chooseName(i);
            String name = scan.nextLine();
            Text.chooseColor(i);
            switch (chooseInt(1,4)) {
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
        for (int i = 0; i < 21; i++) {
            turnPlayer(1);
            turnPlayer(2);
        }
    }
    public static void turnPlayer(int playerId) {
        printBoard();
        Text.turnPlayer(Objects.requireNonNull(PlayerManager.getPlayerById(playerId)));
        int column = chooseInt(0,6);
        if (!board.insert(column, PlayerManager.getPlayerById(playerId))) {
            Text.errorChooseColumns();
            turnPlayer(playerId);
        }
    }
}