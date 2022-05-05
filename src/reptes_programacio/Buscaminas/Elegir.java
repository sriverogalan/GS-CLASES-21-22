package reptes_programacio.Buscaminas;

import java.util.Scanner;

public class Elegir {
    public static Scanner scanner = new Scanner(System.in);

    public static Usuario nickUsuario() {
        Texto.usuario();
        return new Usuario(scanner.nextLine());
    }

    public static int eleccion0al4(String string) {
        try {
            int a;
            do {
                System.out.println(string);

                while (!scanner.hasNextInt()) {
                    Texto.errorEligeOpcionCorrecta0hasta4();
                    System.out.println(string);
                    scanner.next();
                }
                a = scanner.nextInt();
                if (a < 0 || a > 4) {
                    Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
                }
                if (a == -0) {
                    Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
                }
            } while (a < 0 || a > 4 || a == -0);
            return a;
        } catch (Exception exception) {
            Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            eleccion0al4(string);
        }
        return -1;
    }

    public static int eleccionFilasPersonalizado() {
        int a;
        do {
            Texto.eligeEleccionFilasPersonalizado();

            while (!scanner.hasNextInt()) {
                Texto.errorEscribeNumeros();
                Texto.eligeEleccionFilasPersonalizado();
                scanner.next();
            }
            a = scanner.nextInt();
            if (a < 2 || a > 100) {
                Texto.errorEligeLasFilasQueQuierasUsar();
            }
        } while (a < 2 || a > 100);
        return a;
    }

    public static int eleccionColumnasPersonalizado() {
        int a;
        do {
            Texto.eligeEleccionColumnasPersonalizado();

            while (!scanner.hasNextInt()) {
                Texto.errorEscribeNumeros();
                Texto.eligeEleccionColumnasPersonalizado();
                scanner.next();
            }
            a = scanner.nextInt();
            if (a < 2 || a > 100) {
                Texto.errorEligeLasFilasQueQuierasUsar();
            }
        } while (a < 2 || a > 100);
        return a;

    }

    public static int eleccionBombas(int columnas, int filas) {
        int minas;
        do {
            Texto.eligeBombasPersonalizado();

            while (!scanner.hasNextInt()) {
                Texto.errorEscribeNumeros();
                Texto.eligeBombasPersonalizado();
                scanner.next();
            }
            minas = scanner.nextInt();
            if (minas < 1 || minas > minasMaximas(columnas, filas)) {
                Texto.errorHayMuchasBombas();
            }
        } while (minas < 1 || minas > minasMaximas(columnas, filas));
        return minas;
    }

    public static int minasMaximas(int columnas, int filas) {
        return columnas * filas - 1;
    }

    public static int eleccionCasilla(int max, String texto) {
        int a;
        do {
            System.out.println(texto);

            while (!scanner.hasNextInt()) {
                Texto.errorEscribeNumeros();
                System.out.println(texto);
                scanner.next();
            }
            a = scanner.nextInt();
            if (a < 0 || a > max) {
                Texto.errorQuitarPrimeraCasilla();
            }
            if (a == -0) {
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
                eleccionCasilla(max,texto);
            }
        } while (a < 0 || a > max);
        return a;
    }

    public static void resultadoBandera(int contadorBanderas) {
        if (contadorBanderas > 0) {
            System.out.println(Colores.colorVerde + "\nTe quedan " + contadorBanderas + " banderas\n" + Colores.coloresReset);
        } else {
            System.out.println(Colores.colorRojo + "\nQuita alguna bandera para poder utilizarla\n" + Colores.coloresReset);
        }
    }

    public static void resultadoBanderaFinal(int contadorBanderas) {
        if (contadorBanderas > 0) {
            System.out.println(Colores.colorVerde + "\nTe han quedado " + contadorBanderas + " banderas\n" + Colores.coloresReset);
        } else {
            System.out.println(Colores.colorRojo + "\nNo te ha quedado ninguna bandera\n" + Colores.coloresReset);
        }
    }

}
