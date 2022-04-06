package reptes_programacio.Conecta4;

import java.util.Scanner;

public class Conecta4 {
    private static Scanner scanner = new Scanner(System.in);
    private static Jugador jugador1 = new Jugador("Jugador 1");
    private static Jugador jugador2 = new Jugador("Jugador 2");
    private static Tablero tablero = new Tablero();

    public static void jugar(){
        try {
            Texto.principal();
            Texto.escogeJugador1();
            setNombreJugador(jugador1);
            Texto.escogeJugador2();
            setNombreJugador(jugador2);
            generarTablero();
        } catch (Exception exception) {
            Texto.errorJugar();
            jugar();
        }
    }

    public static void setNombreJugador(Jugador jugador){
        jugador.setNombre(scanner.nextLine());
        System.out.println(jugador.getNombre());
    }

    private static void generarTablero(){
        tablero.generarTablero();
        tablero.imprimirTablero();
    }

}
