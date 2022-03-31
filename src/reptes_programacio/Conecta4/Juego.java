package reptes_programacio.Conecta4;

import java.util.Scanner;

public class Juego {
    private static Scanner scanner = new Scanner(System.in);

    public static void jugar(){
        Texto.printPrincipal();
        Jugador jugador1 = new Jugador(scanner.nextLine());
    }




}
