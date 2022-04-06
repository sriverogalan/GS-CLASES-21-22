package reptes_programacio.Conecta4;

import java.util.Scanner;

public class Conecta4 {
    private static Scanner scanner = new Scanner(System.in);
    private static Jugador jugador1 = new Jugador("");
    private static Jugador jugador2 = new Jugador("");
    private static Tablero tablero = new Tablero();

    public static void jugar(){
        try {
            tablero.generarTablero();
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

    public static void escogeNombreJugador(Jugador jugador, String texto){
        try {
            System.out.println(texto);
            jugador.setNombre(scanner.nextLine());
        } catch (Exception exception) {
            Texto.errorJugador();
            escogeNombreJugador(jugador, texto);
        }
    }

    private static void imprimirTableroJugador(){
        Texto.separacion();
        tablero.imprimirTablero();
        Texto.enQueColumnaQuieresMeterUnaFicha();
    }
    // LIMITAR SCANNER 0-6

    private static void juegaJugador1(){
        try {
            imprimirTableroJugador();
            Texto.turnoJugador(jugador1, Colores.ROJO);
            tablero.destaparCasillaJugador(scanner.nextInt(),jugador1);
            juegaJugador2();
        } catch (Exception exception) {
            Texto.errorAlPonerLasColumnas();
            juegaJugador1();
        }
    }

    private static void juegaJugador2(){
        try {
            imprimirTableroJugador();
            Texto.turnoJugador(jugador2, Colores.AZUL);
            tablero.destaparCasillaJugador(scanner.nextInt(),jugador2);
            juegaJugador1();
        } catch (Exception exception) {
            Texto.errorAlPonerLasColumnas();
            juegaJugador2();
        }
    }


}
