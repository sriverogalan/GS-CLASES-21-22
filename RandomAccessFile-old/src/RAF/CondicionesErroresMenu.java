package RAF;

import java.util.Scanner;

public class CondicionesErroresMenu {

    private static final Scanner scan = new Scanner(System.in);

    public static int eligeUsuario(){
        int a;
        do {
            Texto.elegirUsuario();

            while (!scan.hasNextInt()) {
                Texto.errorEligeOpcionCorrecta0hasta2();
                Texto.elegirUsuario();
                scan.next();
            }
            a = scan.nextInt();
            if (a < 0 || a > 2 ){
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            }
        } while (a < 0 || a > 2 );
        return a;
    }

    public static int eligeAdministrador(){
        int b;
        do {
            Texto.elegirAdmin();
            while (!scan.hasNextInt()) {
                Texto.errorEligeOpcionCorrecta0hasta4();
                Texto.elegirAdmin();
                scan.next();
            }
            b = scan.nextInt();
            if (b < 0 || b > 4 ){
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            }
        } while (b < 0 || b > 4 );
        return b;
    }

    public static int eligeCliente(){
        int a;
        do {
            Texto.elegirCliente();
            while (!scan.hasNextInt()) {
                Texto.errorEligeOpcionCorrecta0hasta1();
                Texto.elegirCliente();
                scan.next();
            }
            a = scan.nextInt();
            if (a < 0 || a > 1 ){
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            }
        } while (a < 0 || a > 1 );
        return a;
    }

    public static int eligeLeer(){
        int a;
        do {
            Texto.elegirLeer();
            while (!scan.hasNextInt()) {
                Texto.errorEligeOpcionCorrecta0hasta3();
                Texto.elegirLeer();
                scan.next();
            }
            a = scan.nextInt();
            if (a < 0 || a > 3 ){
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            }
        } while (a < 0 || a > 3 );
        return a;
    }

    public static int eligeLeerCategoria(){
        int a;
        do {
            Texto.eligeCategoria();
            while (!scan.hasNextInt()) {
                Texto.errorEligeOpcionCorrecta0hasta4();
                Texto.eligeCategoria();
                scan.next();
            }
            a = scan.nextInt();
            if (a < 0 || a > 4 ){
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            }
        } while (a < 0 || a > 4 );
        return a;
    }

    public static int eligeEditar(){
        int a;
        do {
            Texto.eligeEditar();
            while (!scan.hasNextInt()) {
                Texto.errorEligeOpcionCorrecta0hasta2();
                Texto.eligeEditar();
                scan.nextLine();
            }
            a = scan.nextInt();
            if (a < 0 || a > 2 ){
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            }
        } while (a < 0 || a > 2 );
        return a;
    }

    public static int idCorrecto(){
        int a;
        do {
            Texto.introduceId();
            while (!scan.hasNextInt()) {
                Texto.errorHasEscritoUnaLetra();
                Texto.introduceId();
                scan.next();
            }
            a = scan.nextInt();
            if (a <= 0){
                Texto.errorHasEscritoUnNumeroMenor0();
            }
        } while (a <= 0);
        return a;
    }

    public static int numMenor0Correcto(String texto){
        int a;
        do {
            System.out.println(texto);
            while (!scan.hasNextInt()) {
                Texto.errorHasEscritoUnaLetra();
                System.out.println(texto);
                scan.next();
            }
            a = scan.nextInt();
            if (a < 0){
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            }
        } while (a < 0);
        return a;
    }

    public static int eligeCategoria(){
        int a;
        do {
            Texto.eligeCategoria();
            while (!scan.hasNextInt()) {
                Texto.errorEligeOpcionCorrecta0hasta4();
                Texto.eligeCategoria();
                scan.next();
            }
            a = scan.nextInt();
            if (a < 0 || a > 4 ){
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            }
        } while (a < 0 || a > 4 );
        return a;
    }
    public static int eligeEstaActivo(){
        int a;
        do {
            Texto.eligeEstaActivo();
            while (!scan.hasNextInt()) {
                Texto.errorEligeOpcionCorrecta0hasta1();
                Texto.eligeEstaActivo();
                scan.next();
            }
            a = scan.nextInt();
            if (a < 0 || a > 1 ){
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            }
        } while (a < 0 || a > 1 );
        return a;
    }

    public static int eligeSiEstaEliminado(){
        int a;
        do {
            Texto.eligeEstaEliminado();
            while (!scan.hasNextInt()) {
                Texto.errorEligeOpcionCorrecta0hasta1();
                Texto.eligeEstaEliminado();
                scan.next();
            }
            a = scan.nextInt();
            if (a < 0 || a > 1 ){
                Texto.errorHasEscritoUnNumeroMenorOMayorMaximoPermitido();
            }
        } while (a < 0 || a > 1 );
        return a;
    }
}