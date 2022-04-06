package reptes_programacio.Conecta4;

public class Tablero {
    private final Casilla[][] tablero;
    private int filas = 6;
    private int columnas = 7;
    private int turnoJugador1 = 0;
    private int turnoJugador2 = 0;
    private int MAX_TURNO = 21;

    public Tablero() {
        tablero = new Casilla[filas][columnas];
    }

    public void generarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = new Casilla();
            }
        }
    }

    public void imprimirTablero() {
        int contadorHorizontal = 1;
        for (int i = 0; i < tablero.length; i++) {
            if (i == 0) {
                imprimirNumerosVerticalmenteTablero(i);
            }
            System.out.print(" ( " + contadorHorizontal++ + " ) ");
            for (int j = 0; j < tablero[i].length; j++) {
                if (!tablero[i][j].getIsOcupada()) {
                    System.out.print(" ( - ) ");
                }
            }
            System.out.println();
        }
    }


    public void imprimirNumerosVerticalmenteTablero(int i) {
        int contadorVertical = 1;
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

}
