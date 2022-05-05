package connecta4.menu;

import connecta4.board.Board;
import connecta4.player.Player;
import connecta4.player.PlayerManager;
import connecta4.utils.Texto;

import java.util.Scanner;

public class Game {
    private static Scanner scanner = new Scanner(System.in);
    private static Board board = new Board();

    public static void jugar() {
        try {
            Texto.principal();
            escogeNombreJugador(Texto.escogeJugador());
            escogeNombreJugador(Texto.escogeJugador());
            juegaJugador1();
        } catch (Exception exception) {
            Texto.errorJugar();
            jugar();
        }
    }

    public static void escogeNombreJugador(String texto) {
        try {
            System.out.println(texto);
            PlayerManager.addPlayer(new Player(scanner.nextLine()));
            //player.setNombre(scanner.nextLine());

        } catch (Exception exception) {
            Texto.errorJugador();
            escogeNombreJugador(texto);
        }
    }

    private static void imprimirTableroJugador() {
        Texto.separacion();
        board.imprimirTablero();
        Texto.enQueColumnaQuieresMeterUnaFicha();
    }
    public static void juegaJugador(Player player) {
        try {
            imprimirTableroJugador();
            Texto.turnoJugador(player);
            destapaCasilla(scanner.nextInt(), player);
            compruebaSiHasGanado(player);
        } catch (Exception exception) {
            Texto.errorAlPonerLasColumnas();
            juegaJugador(player);
        }
    }
    private static void juegaJugador1() {
        juegaJugador(player1);
        juegaJugador2();
    }
    private static void juegaJugador2() {
        juegaJugador(player2);
        juegaJugador1();
    }

    public static void destapaCasilla(int columna, Player player) {
        board.destaparCasillaJugador(columna, player);
    }
    public static void compruebaSiHasGanado(Player player) {
        if (board.comprobarSiHasGanado(player)) {
            Texto.separacion();
            board.imprimirTablero();
            Texto.hasGanado(player);
            System.exit(0);
        }
    }
}
