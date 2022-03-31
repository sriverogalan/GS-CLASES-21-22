package reptes_programacio.Conecta4;

public class Tablero {

    // Classe Tablero
    private int filas = 6;
    private int columnas = 7;
    private boolean[][] tablero;
    private int turno = 0;

    /* CONSTRUCTOR */

    public Tablero() {
        this.filas = filas;
        this.columnas = columnas;
        this.tablero = new boolean[filas][columnas];
        this.turno = 0;
    }

    /* GETTERS & SETERS */

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getTurno() {
        return turno;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public void setTablero(boolean[][] tablero) {
        this.tablero = tablero;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public boolean[][] getTablero() {
        return tablero;
    }

    public boolean getCasilla(int fila, int columna) {
        return tablero[fila][columna];
    }

    public void setCasilla(int fila, int columna, boolean valor) {
        tablero[fila][columna] = valor;
    }



}