package reptes_programacio.Conecta4;

import java.util.Scanner;

public class Conecta4 {
    private static Scanner scanner = new Scanner(System.in);
    private static Jugador jugador1 = new Jugador("");
    private static Jugador jugador2 = new Jugador("");
    private static Tablero tablero = new Tablero();
    private static int turno = 42;

    public static void jugar() {
        try {
            Texto.principal();
            escogeNombreJugador(jugador1, Texto.escogeJugador1());
            jugador1.setJugador1(true);
            escogeNombreJugador(jugador2, Texto.escogeJugador2());
            juegaJugador1();
        } catch (Exception exception) {
            Texto.errorJugar();
            jugar();
        }
    }

    public static void escogeNombreJugador(Jugador jugador, String texto) {
        try {
            System.out.println(texto);
            jugador.setNombre(scanner.nextLine());
        } catch (Exception exception) {
            Texto.errorJugador();
            escogeNombreJugador(jugador, texto);
        }
    }

    private static void imprimirTableroJugador() {
        Texto.separacion();
        tablero.imprimirTablero();
        Texto.enQueColumnaQuieresMeterUnaFicha();
    }
    public static void juegaJugador(Jugador jugador) {
        try {
            imprimirTableroJugador();
            Texto.turnoJugador(jugador);
            destapaCasilla(scanner.nextInt(), jugador);
            compruebaSiHasGanado(jugador);
        } catch (Exception exception) {
            Texto.errorAlPonerLasColumnas();
            juegaJugador(jugador);
        }
    }
    private static void juegaJugador1() {
        juegaJugador(jugador1);
        juegaJugador2();
    }
    private static void juegaJugador2() {
        juegaJugador(jugador2);
        juegaJugador1();
    }

    public static void destapaCasilla(int columna, Jugador jugador) {
        tablero.destaparCasillaJugador(columna, jugador);
    }
    public static void compruebaSiHasGanado(Jugador jugador) {
        if (tablero.comprobarSiHasGanado(jugador)) {
            Texto.separacion();
            tablero.imprimirTablero();
            Texto.hasGanado(jugador);
            System.exit(0);
        }
    }
}
