package buscaminas;

public class Texto {
    public static void lineasSepararFunciones() {
        System.out.println(Colores.coloresReset + "__________________________________________________________________________________________________ \n" +  Colores.coloresReset);
    }

    public static void inicioBuscaminas() {
        lineasSepararFunciones();
        System.out.println(Colores.colorVerde + " \n                                 BIENVENIDO AL BUSCAMINAS \n " + Colores.coloresReset);
    }

    public static void usuario() {
        lineasSepararFunciones();
        System.out.println(Colores.colorCyan + " \n INTRODUCE TU NICK PARA EMPEZAR : \n " + Colores.coloresReset);
    }

    public static String eligeDificultad() {
        lineasSepararFunciones();
        return Colores.colorCyan + "\nELIGE LA DIFICULTAD : \n" +
                "1. PRINCIPIANTE (8 filas, 8 columnas, 10 minas)\n" +
                "2. NORMAL (16 filas, 16 columnas, 40 minas)\n" +
                "3. DIFICIL (16 filas, 30 columnas, 99 minas)\n" +
                "4. PERSONALIZADO (Elige tu las filas, las columnas y las minas)\n" +
                " \n " + Colores.coloresReset ;
    }

    public static void eligeEleccionFilasPersonalizado() {
        lineasSepararFunciones();
        System.out.println(Colores.colorLila + " \n ELIGE LAS FILAS QUE QUIERAS UTILIZAR: (el minimo son 2 y el maximo son 100) \n " + Colores.coloresReset);
    }

    public static void eligeEleccionColumnasPersonalizado() {
        lineasSepararFunciones();
        System.out.println(Colores.colorAzul + " \n ELIGE LAS COLUMNAS QUE QUIERAS UTILIZAR: (el minimo son 2 y el maximo son 100) \n " + Colores.coloresReset);
    }

    public static void eligeBombasPersonalizado() {
        lineasSepararFunciones();
        System.out.println(Colores.colorAzul + " \n ELIGE LAS BOMBAS QUE QUIERAS USAR : (el minimo es de 1 bomba y el maximo es todas las casillas del tablero) \n " + Colores.coloresReset);
    }

    public static String quitarPrimeraFila() {
        lineasSepararFunciones();
        return Colores.colorCyan + " \nELIGE LA FILA, PARA PODER QUITAR LA PRIMERA CASILLA\n " + Colores.coloresReset;
    }

    public static String quitarPrimeraColumna() {
        lineasSepararFunciones();
        return Colores.colorCyan + " \nELIGE LA COLUMNA, PARA PODER QUITAR LA PRIMERA CASILLA\n " + Colores.coloresReset;
    }

    public static String queSeQuiereHacer() {
        return Colores.colorCyan +
                "\nQue quieres hacer :\n" +
                "1 . Salir\n" +
                "2 . Destapar Casilla\n" +
                "3 . Poner Bandera\n" +
                "4 . Quitar Bandera\n" + Colores.coloresReset;
    }

    public static String introduceFila() {
        return Colores.colorCyan + " \nPor favor introduce la Fila para destaparla:\n " + Colores.coloresReset;
    }
    public static String introduceColumna() {
        return Colores.colorCyan + " \nPor favor introduce la Columna para destaparla :\n " + Colores.coloresReset;
    }
    public static void destaparCasilla() {
        lineasSepararFunciones();
        System.out.println(Colores.colorCyan + " \nHas elegido DESTAPAR una CASILLA, para ello:\n " + Colores.coloresReset);
    }

    public static void ponerBandera() {
        lineasSepararFunciones();
        System.out.println(Colores.colorCyan + " \nHas elegido PONER BANDERA, para ello:\n " + Colores.coloresReset);
    }

    public static void quitarBandera() {
        lineasSepararFunciones();
        System.out.println(Colores.colorCyan + " \nHas elegido QUITAR BANDERA, para ello:\n " + Colores.coloresReset);
    }

    public static void hasPerdido() {
        lineasSepararFunciones();
        System.out.println(Colores.colorRojo +
                "\n                _.-^^---....,,--       \n" +
                "            _--                  --_  \n" +
                "           <                        >)\n" +
                "           |                         | \n" +
                "            \\._                   _./  \n" +
                "               ```--. . , ; .--'''       \n" +
                "                     | |   |             \n" +
                "                  .-=||  | |=-.   \n" +
                "                  `-=#$%&%$#=-'   \n" +
                "                     | ;  :|     \n" +
                "            _____.,-#%&$@%#&#~,._____");
        System.out.println(
                "\n" +
                        "   ██████╗░░█████╗░░█████╗░░█████╗░███╗░░░███╗   ██╗\n" +
                        "   ██╔══██╗██╔══██╗██╔══██╗██╔══██╗████╗░████║   ██║\n" +
                        "   ██████╦╝██║░░██║██║░░██║██║░░██║██╔████╔██║   ██║\n" +
                        "   ██╔══██╗██║░░██║██║░░██║██║░░██║██║╚██╔╝██║   ╚═╝\n" +
                        "   ██████╦╝╚█████╔╝╚█████╔╝╚█████╔╝██║░╚═╝░██║   ██╗\n" +
                        "   ╚═════╝░░╚════╝░░╚════╝░░╚════╝░╚═╝░░░░░╚═╝   ╚═╝\n\n");
    }
    public static void hasGanado() {
        lineasSepararFunciones();
        System.out.println(Colores.colorVerde + "\n" +
                "░██╗░░░░░░░██╗██╗███╗░░██╗███╗░░██╗███████╗██████╗░\n" +
                "░██║░░██╗░░██║██║████╗░██║████╗░██║██╔════╝██╔══██╗\n" +
                "░╚██╗████╗██╔╝██║██╔██╗██║██╔██╗██║█████╗░░██████╔╝\n" +
                "░░████╔═████║░██║██║╚████║██║╚████║██╔══╝░░██╔══██╗\n" +
                "░░╚██╔╝░╚██╔╝░██║██║░╚███║██║░╚███║███████╗██║░░██║\n" +
                "░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚══╝╚══════╝╚═╝░░╚═╝\n");
    }





    //ERRORES

    public static void errorPonlaEnOtroLado() {
        System.out.println( Colores.colorRojo + "\nERROR : Intenta ponerla en otro lado \n" + Colores.coloresReset);
    }
    public static void errorNoQuedanBanderas() {
        System.out.println( Colores.colorRojo + "\nERROR : No te quedan banderas, intenta quitar alguna\n" + Colores.coloresReset);
    }

    public static void errorAhiNoSePuedePorqueNoHayBandera() {
        System.out.println( Colores.colorRojo + "\nERROR : Ahi no se puede intentelo de nuevo\n" + Colores.coloresReset);
    }

    public static void errorEligeLasFilasQueQuierasUsar() {
        System.out.println( Colores.colorRojo + "\n ERROR : ELIGE UNA OPCION ENTRE EL 2 - 100 \n" + Colores.coloresReset);
    }
    public static void errorNoSeHaPodidoDestapar() {
        System.out.println( Colores.colorRojo + "\n ERROR : No se ha podido destapar porque ya estaba destapada \n" + Colores.coloresReset);
    }

    public static void errorHayMuchasBombas() {
        System.out.println( Colores.colorRojo + "\n ERROR : HAY DEMASIADAS BOMBAS \n" + Colores.coloresReset);
    }

    public static void errorEscribeNumeros() {
        System.out.println( Colores.colorRojo + "\n ERROR : NO SE PERMITE TEXTO, ESCRIBE NUMEROS \n" +  Colores.coloresReset);
    }

    public static void errorAlgoHaFallado() {
        System.out.println( Colores.colorRojo + "\n ERROR : INTENTELO DE NUEVO, ALGO HA FALLADO \n" + Colores.coloresReset);
    }

    public static void errorQuitarPrimeraCasilla() {
        System.out.println( Colores.colorRojo + "\n ERROR : ELIGE UNA CASILLA QUE ESTE EN EL TABLERO \n" + Colores.coloresReset);
    }

    public static void errorEligeOpcionCorrecta0hasta4() {
        System.out.println( Colores.colorRojo + "\n ERROR : ELIGE UNA OPCION ENTRE EL 1 - 4 \n" +  Colores.coloresReset);
    }

    public static void errorHasEscritoUnNumeroMenorOMayorMaximoPermitido() {
        System.out.println( Colores.colorRojo + "\n ERROR : Has escrito un numero menor que 0 o MAYOR del maximo permitido\n" + Colores.coloresReset);
    }

}