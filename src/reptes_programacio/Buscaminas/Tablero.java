package reptes_programacio.Buscaminas;

import java.util.Random;

public class Tablero {
    private int minas;
    private int banderas;
    private final Casilla[][] tablero;

    public Tablero(int x, int y) {
        tablero = new Casilla[x][y];
    }

    // GET

    public int getBanderas() {
        return banderas;
    }

    public int getMinas() {
        return minas;
    }

    public int getFilasTablero() {
        return tablero.length;
    }

    public int getColumnasTablero() {
        return tablero[0].length;
    }

    // SET

    public void setBanderas(int banderas) {
        this.banderas = banderas;
    }

    public void setMinas(int minas) {
        this.minas = minas;
    }


    // METODOS :

    public void generarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = new Casilla();
            }
        }
    }

    public void imprimirTablero() {
        Texto.lineasSepararFunciones();
        int contadorHorizontal = 1;

        for (int i = 0; i < tablero.length; i++) {
            if (i == 0) {
                imprimirNumerosVerticalmenteTablero(i);
            }
            System.out.print(" ( " + contadorHorizontal + " ) ");

            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].getBandera() && tablero[i][j].getTapada()) {
                    System.out.print(" ( B ) ");
                } else {
                    if (tablero[i][j].getTieneBomba() || tablero[i][j].getTapada() && !tablero[i][j].getTieneBomba()) {
                        System.out.print(" ( - ) ");

                    } else if (!tablero[i][j].getTapada()) {
                        System.out.print(" ( " + Colores.colorAzul + tablero[i][j].getBombaAlrededor() + Colores.coloresReset + " ) ");
                    }

                }
            }
            contadorHorizontal++;
            System.out.println();
        }
        Elegir.resultadoBandera(getBanderas());
    }

    public void imprimirTableroAlFinalizar() {
        Texto.lineasSepararFunciones();
        int contadorHorizontal = 1;

        for (int i = 0; i < tablero.length; i++) {
            if (i == 0) {
                imprimirNumerosVerticalmenteTablero(i);
            }
            System.out.print(" ( " + contadorHorizontal + " ) ");

            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].getTieneBomba()) {
                    System.out.print(Colores.colorRojo + " ( X ) " + Colores.coloresReset);
                } else if (tablero[i][j].getTapada() && !tablero[i][j].getTieneBomba()) {
                    System.out.print(Colores.colorCyan +" ( "+  tablero[i][j].getBombaAlrededor() +" ) "+ Colores.coloresReset);
                } else if (!tablero[i][j].getTapada()) {
                    System.out.print(Colores.colorCyan + " ( " +  tablero[i][j].getBombaAlrededor() +  " ) "+ Colores.coloresReset);
                }
            }
            contadorHorizontal++;
            System.out.println();
        }
        Elegir.resultadoBanderaFinal(getBanderas());
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

    public void destaparPrimeraVez() {
        int xInit = Elegir.eleccionCasilla(tablero.length, Texto.quitarPrimeraFila());
        int yInit = Elegir.eleccionCasilla(tablero[0].length, Texto.quitarPrimeraColumna());
        generarMinas(xInit, yInit);
        destaparCasilla(xInit, yInit);
    }

    public void generarMinas(int xInit, int yInit) {
        xInit = xInit - 1;
        yInit = yInit - 1;
        Random random = new Random();

        for (int z = 0; z < minas; z++) {

            int bombaX = random.nextInt(tablero.length);
            int bombaY = random.nextInt(tablero[0].length);

            if (xInit != bombaX && yInit != bombaY) {

                while (tablero[bombaX][bombaY].getTieneBomba()) {
                    bombaX = random.nextInt(tablero.length);
                    bombaY = random.nextInt(tablero[0].length);
                }
                tablero[bombaX][bombaY].setTieneBomba(true);
                tablero[bombaX][bombaY].setBombaAlrededor(-1);
                generadorNumerosAlrededorBombas(bombaX, bombaY, tablero.length, tablero[0].length);
            } else {
                z--;
            }
        }
        xInit = xInit + 1;
        yInit = yInit + 1;
        destaparCasilla(xInit, yInit);

    }

    public void posicionNumeroAlrededorBomba(int bombaX, int bombaY, int maxX, int maxY) {
        if (bombaX >= 0 && bombaY >= 0 && bombaX < maxX && bombaY < maxY) {
            if (!tablero[bombaX][bombaY].getTieneBomba()) {
                tablero[bombaX][bombaY].setBombaAlrededor(tablero[bombaX][bombaY].getBombaAlrededor() + 1);
            }
        }
    }

    private void generadorNumerosAlrededorBombas(int bombaX, int bombaY, int maxX, int maxY) {

        // filas de arriba
        posicionNumeroAlrededorBomba(bombaX - 1, bombaY - 1, maxX, maxY);
        posicionNumeroAlrededorBomba(bombaX - 1, bombaY, maxX, maxY);
        posicionNumeroAlrededorBomba(bombaX - 1, bombaY + 1, maxX, maxY);

        // fila medio
        posicionNumeroAlrededorBomba(bombaX, bombaY - 1, maxX, maxY);
        posicionNumeroAlrededorBomba(bombaX, bombaY, maxX, maxY);
        posicionNumeroAlrededorBomba(bombaX, bombaY + 1, maxX, maxY);

        //fila abajo
        posicionNumeroAlrededorBomba(bombaX + 1, bombaY - 1, maxX, maxY);
        posicionNumeroAlrededorBomba(bombaX + 1, bombaY, maxX, maxY);
        posicionNumeroAlrededorBomba(bombaX + 1, bombaY + 1, maxX, maxY);

    }

    public void destaparCasilla(int x, int y) {
        x = x - 1;
        y = y - 1;
        if (tablero[x][y].getTieneBomba()) {
            imprimirTableroAlFinalizar();
            Juego.hasPerdido();
            System.exit(0);
        } else {
            if (tablero[x][y].getTapada()) {
                if(tablero[x][y].getBandera()){
                    setBanderas(getBanderas()+1);
                }
                tablero[x][y].setTapada(false);
                if (tablero[x][y].getBombaAlrededor() == 0) {
                    encontrarCerosLadosDestapar(x, y);
                } else {
                    destapar(x, y);
                }
            } else {
                Texto.errorNoSeHaPodidoDestapar();
            }
            Juego.preguntaQueSeQuiereHacer();
        }

    }

    public int destapar(int x, int y) {
        if (tablero[x][y].getTapada()) {
            tablero[x][y].setTapada(false);
            if (!tablero[x][y].getTieneBomba() && tablero[x][y].getBombaAlrededor() == 0) {
                return 1;
            }
        }
        return 0;
    }

    public void posicionesTablero(boolean[][] ceros) {
        for (int i = 0; i < ceros.length; i++) {
            for (int j = 0; j < ceros[i].length; j++) {
                if (ceros[i][j]) {
                    encontrarCerosLadosDestapar(i, j);
                }
            }
        }
    }

    public void encontrarCasillaCerosLadosDestapar(int currentX, int currentY, boolean[][] ceros) {
        if ((currentX < tablero.length && currentY < tablero[0].length) && (currentX >= 0 && currentY >= 0)) {
            int reDes = destapar(currentX, currentY);

            if (reDes == 1) {
                ceros[currentX][currentY] = true;
            }
        }
    }

    public void encontrarCerosLadosDestapar(int x, int y) {
        boolean[][] ceros = new boolean[tablero.length][tablero[0].length];
        int ceroX = x;
        int ceroY = y;
        int currentX, currentY;
        x = ceroX;
        y = ceroY;

        if (x < tablero.length && y < tablero[0].length) {
            // Arriba izquierda
            currentX = x - 1;
            currentY = y - 1;
            encontrarCasillaCerosLadosDestapar(currentX, currentY, ceros);

            // Arriba centro
            currentX = x - 1;
            currentY = y;
            encontrarCasillaCerosLadosDestapar(currentX, currentY, ceros);

            // Arriba derecha
            currentX = x - 1;
            currentY = y + 1;
            encontrarCasillaCerosLadosDestapar(currentX, currentY, ceros);

            // centro derecha
            currentX = x;
            currentY = y + 1;
            encontrarCasillaCerosLadosDestapar(currentX, currentY, ceros);

            // centro izquierda
            currentX = x;
            currentY = y - 1;
            encontrarCasillaCerosLadosDestapar(currentX, currentY, ceros);

            // abajo derecha
            currentX = x + 1;
            currentY = y + 1;
            encontrarCasillaCerosLadosDestapar(currentX, currentY, ceros);

            // abajo centro
            currentX = x + 1;
            currentY = y;
            encontrarCasillaCerosLadosDestapar(currentX, currentY, ceros);

            // abajo izquierda
            currentX = x + 1;
            currentY = y - 1;
            encontrarCasillaCerosLadosDestapar(currentX, currentY, ceros);

            // -- //
            posicionesTablero(ceros);
        }
    }


    public void ponerBandera(int x, int y) {
        x = x - 1;
        y = y - 1;

        if (getBanderas() != 0) {
            if (!tablero[x][y].getBandera() && tablero[x][y].getTapada()) {
                tablero[x][y].setBandera(true);
                setBanderas(getBanderas() - 1);
            } else {
                Texto.errorPonlaEnOtroLado();
            }
        } else {
            Texto.errorNoQuedanBanderas();
        }
        Juego.preguntaQueSeQuiereHacer();

    }

    public void quitarBandera(int x, int y) {
        x = x - 1;
        y = y - 1;

        if (getBanderas() < getMinas()) {
            if (tablero[x][y].getBandera() && tablero[x][y].getTapada()) {
                tablero[x][y].setBandera(false);
                setBanderas(getBanderas() + 1);
            } else {
                Texto.errorAhiNoSePuedePorqueNoHayBandera();
            }
        } else {
            Texto.errorAhiNoSePuedePorqueNoHayBandera();
        }
        Juego.preguntaQueSeQuiereHacer();
    }

    public void saberSiVasGanando() {
        int contadorCasillasSinDestapar = 0;
        for (Casilla[] casillas : tablero) {
            for (Casilla casilla : casillas) {
                if (casilla.getTapada()) {
                    contadorCasillasSinDestapar++;
                }
            }
        }

        if (this.minas == contadorCasillasSinDestapar) {
            imprimirTableroAlFinalizar();
            Juego.hasGanado();
            System.exit(0);
        }
    }
}