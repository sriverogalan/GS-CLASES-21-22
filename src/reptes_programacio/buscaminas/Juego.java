package reptes_programacio.buscaminas;


import static reptes_programacio.buscaminas.Elegir.*;

public class Juego {

    private static Usuario usuario;
    private static Tablero tablero;

    public static void empezarJuego() {
        Texto.inicioBuscaminas();
        usuario = nickUsuario();
        elegirDificultad();
    }

    public static void elegirDificultad() {
        try {
            switch (eleccion0al4(Texto.eligeDificultad())) {
                case 1 -> generarTablero(8, 8, 10);
                case 2 -> generarTablero(16, 16, 40);
                case 3 -> generarTablero(16, 30, 99);
                case 4 -> personalizado();
            }
        } catch (Exception exception) {
            Texto.errorAlgoHaFallado();
            elegirDificultad();
        }
    }

    public static void generarTablero(int x, int y, int minas) {
        tablero = new Tablero(x, y);
        tablero.setMinas(minas);
        tablero.setBanderas(minas);
        tablero.generarTablero();

        quitarPrimeraCasilla();
    }

    public static void personalizado() {
        try {
            int filas = eleccionFilasPersonalizado();
            int columnas = eleccionColumnasPersonalizado();

            generarTablero(filas, columnas, eleccionBombas(columnas, filas));
            quitarPrimeraCasilla();
        } catch (Exception exception) {
            Texto.errorAlgoHaFallado();
            personalizado();
        }
    }

    public static void quitarPrimeraCasilla() {
        tablero.imprimirTablero();
        tablero.destaparPrimeraVez();
        preguntaQueSeQuiereHacer();
    }

    public static void preguntaQueSeQuiereHacer() {
        try {
            tablero.saberSiVasGanando();
            tablero.imprimirTablero();

            switch (eleccion0al4(Texto.queSeQuiereHacer())) {
                case 1 -> {
                    System.out.println(Colores.colorAzul + "Adios, gracias por jugar" + Colores.coloresReset);
                    System.exit(0);
                }
                case 2 -> destaparCasilla();
                case 3 -> ponerBandera();
                case 4 -> quitarBandera();
            }
        } catch (Exception exception) {
            Texto.errorAlgoHaFallado();
            preguntaQueSeQuiereHacer();
        }
    }

    public static void destaparCasilla() {
        Texto.destaparCasilla();
        tablero.destaparCasilla(introducirFilas(), introducirColumnas());
    }

    public static void ponerBandera() {
        Texto.ponerBandera();
        tablero.ponerBandera(introducirFilas(), introducirColumnas());
    }

    public static void quitarBandera() {
        Texto.quitarBandera();
        tablero.quitarBandera(introducirFilas(), introducirColumnas());
    }

    public static void hasGanado() {
        Texto.hasGanado();
        System.out.println("HAS GANADO " + usuario.getNombre() + " !!!!" + Colores.coloresReset);
    }

    public static void hasPerdido() {
        Texto.hasPerdido();
        System.out.println("Le has dado a una Bomba. \n" +
                "USUARIO: " + usuario.getNombre() +
                "\nIntentalo de nuevo y quizas ganas. \n" + Colores.coloresReset);
    }

    public static int introducirFilas() {
        return eleccionCasilla(tablero.getFilasTablero(), Texto.introduceFila());
    }

    public static int introducirColumnas() {
        return eleccionCasilla(tablero.getColumnasTablero(), Texto.introduceColumna());
    }
}