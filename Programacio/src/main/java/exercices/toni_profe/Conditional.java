package exercices.toni_profe;

import java.util.Scanner;

public class Conditional {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean siEsPositivo() {
        return scanner.nextInt() > 0;
    }

    public static boolean siEsMultiple() {
        return scanner.nextInt() % 2 == 0;
    }

    public static String comparadorNum(int a, int b) {
        if (a > b) {
            return a + " es major que " + b;
        } else if (a == b) {
            return a + " es igual que " + b;
        } else {
            return a + " es menor que " + b;
        }
    }

    public static String diaSetmanaIf(int dia) {
        if (dia == 1) {
            return "Dilluns";
        } else if (dia == 2) {
            return "Dimarts";
        } else if (dia == 3) {
            return "Dimecres";
        } else if (dia == 4) {
            return "Dijous";
        } else if (dia == 5) {
            return "Divendres";
        } else if (dia == 6) {
            return "Dissabte";
        } else if (dia == 7) {
            return "Diumenge";
        } else {
            return "Escriu un numero de s'1 al 7";
        }
    }

    public static String diaSetmanaSwitch(int dia) {
        switch (dia) {
            case 1 -> {
                return "Dilluns";
            }
            case 2 -> {
                return "Dimarts";
            }
            case 3 -> {
                return "Dimecres";
            }
            case 4 -> {
                return "Dijous";
            }
            case 5 -> {
                return "Divendres";
            }
            case 6 -> {
                return "Dissabte";
            }
            case 7 -> {
                return "Diumenge";
            }
            default -> {
                return "Escriu un numero de s'1 al 7";
            }
        }
    }

    public static void indicaTiempoHorario(int hora) {
        if (hora > 8 && hora < 12) {
            System.out.println("Matí");
        } else if (hora >= 12 && hora < 17) {
            System.out.println("Migdia");
        } else if (hora >= 17 && hora < 20) {
            System.out.println("Horabaixa");
        } else if (hora >= 20 && hora < 23) {
            System.out.println("Vespre");
        }
    }

    public static String notaQueTienes(int nota) {
        if (nota > 0 && nota < 4) {
            return "Insuficient";
        } else if (nota == 5) {
            return "Suficient";
        } else if (nota == 6) {
            return "Bé";
        } else if (nota == 7 || nota == 8) {
            return "Notable";
        } else if (nota == 9 || nota == 10) {
            return "Excelente";
        }
        return "Escribe un numero del 0 - 10";
    }

    public static boolean siLaFechaEsCorrecta() {
        int dia = scanner.nextInt(), mes = scanner.nextInt(), any = scanner.nextInt();

        if (dia > 0 && dia < 31 && mes > 0 && mes < 12) {
            return any > 0;
        }
        return false;
    }

    public static boolean majorEdat(int edat) {
        return edat > 18;
    }

    public static void quantitatDobers(int total) {
        final int[] valorB = {50,20,10,5,2,1};
        int[] totalB = new int[valorB.length];

        System.out.println("El preu total es de " + total + " € \n");

        for (int i = 0; i < totalB.length; i++){
            if (total >= valorB[i]) {
                totalB[i] = total / valorB[i];
                total = total - totalB[i] * valorB[i];
            }
        }
        for (int i = 0 ; i < totalB.length; i++){
            System.out.println("SON " + totalB[i] + " BILLETS DE " + valorB[i] + " €" );
        }
    }

}
