package reptes_programacio.Conecta4;

import java.util.Scanner;

public class Tablero {
    private Scanner scanner = new Scanner(System.in);
    private final Casilla[][] tablero;
    private final int filas = 6; // 6 filas
    private final int columnas = 7; // 7 columnas

    public Tablero() {
        tablero = new Casilla[filas][columnas];
        /*GENERAMOS EL TABLERO*/
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = new Casilla();
            }
        }
    }

    public void imprimirTablero() {
        int contadorHorizontal = 0;
        for (int i = 0; i < tablero.length; i++) {
            if (i == 0) {
                imprimirNumerosVerticalmenteTablero(i);
            }
            System.out.print(" ( " + contadorHorizontal++ + " ) ");
            for (int j = 0; j < tablero[i].length; j++) {
                if (!tablero[i][j].isOcupada()) {
                    System.out.print(" ( - ) ");
                } else if (tablero[i][j].isTieneFichaJugador1()) {
                    System.out.print(Colores.ROJO + " ( X ) " + Colores.RESET);
                } else if (tablero[i][j].isTieneFichaJugador2()) {
                    System.out.print(Colores.AZUL + " ( O ) " + Colores.RESET);
                }
            }
            System.out.println();
        }
    }

    public void imprimirNumerosVerticalmenteTablero(int i) {
        int contadorVertical = 0;
        for (int e = 0; e < tablero[i].length; e++) {
            if (e == 0) {
                System.out.print("       ");
            }
            System.out.print(" ( " + contadorVertical + " ) ");
            contadorVertical++;
            if (e == tablero[i].length - 1) {
                System.out.println();
            }
        }
    }

    public void destaparCasillaJugador(int columna, Jugador jugador) {
        int fila = filas - 1;
        while (tablero[fila][columna].isOcupada()) {
            if (tablero[0][columna].isOcupada() || tablero[0][columna].isTieneFichaJugador1() || tablero[0][columna].isTieneFichaJugador2()) {
                Texto.escogeOtraColumna();
                destaparCasillaJugador(scanner.nextInt(), jugador);
                break;
            }
            fila--;
        }
        tablero[fila][columna].setOcupada(true); //destapamos la casilla
        if (jugador.isJugador1()) {
            tablero[fila][columna].setTieneFichaJugador1(true); //ponemos la ficha del jugador
        } else {
            tablero[fila][columna].setTieneFichaJugador2(true); //ponemos la ficha del jugador
        }
    }

    public boolean comprobarSiHasGanado(Jugador jugador) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].isTieneFichaJugador1()) {
                    if (comprobar4enRayaHorizontal(i, j, jugador)) {
                        return true;
                    }
                    if (comprobar4enRayaVertical(i, j, jugador)) {
                        return true;
                    }
                    if (comprobar4enRayaDiagonal(i, j, jugador)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}