package exercices.exams.Examen2solucio;

import groovyjarjarpicocli.CommandLine;

/**
 * Created by Sergi Rivero
 * at 16/03/2022 16:48
 * Project: GS-CLASES-21-22
 * Class: MetodeCaesar
 */


public class MetodeCaesar {

    public static char[] abecedari() {
        String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        char[] array = new char[abecedario.length()];

        for (int i = 0; i < abecedario.length(); i++) {
            array[i] = abecedario.charAt(i);
        }
        return array;
    }

    public static char[] abecedariXifrat(int numXifratge) {
        char[] abecedario = abecedari();
        char[] arrayFinal = new char[abecedario.length];
        int aux = numXifratge;
        int counter = 0;

        for (int i = 0; i < abecedario.length; i++) {
            if (i >= numXifratge) {
                arrayFinal[counter++] = abecedario[i];
            } else {
                arrayFinal[abecedario.length - 1 - aux] = abecedario[i];
                aux--;
            }
        }
        return arrayFinal;
    }


    public static String xifrar(String str, int numXifratge) {
        char[] abecedari = abecedari();
        char[] abecedariXifrat = abecedariXifrat(numXifratge);

        String stringFinal = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < abecedari.length; j++) {
                if (str.charAt(i) == ' '){
                    stringFinal += " ";
                    break;
                }
                if (str.charAt(i) == abecedari[j]) {
                    stringFinal += abecedariXifrat[j];
                }
            }
        }
        return stringFinal;
    }

    public static String desxifrar (String str, int numXifratge){
        char[] abecedari = abecedari();
        char[] abecedariXifrat = abecedariXifrat(numXifratge);

        String stringFinal = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < abecedariXifrat.length; j++) {
                if (str.charAt(i) == ' '){
                    stringFinal += " ";
                    break;
                }
                if (str.charAt(i) == abecedariXifrat[j]) {
                    stringFinal += abecedari[j];
                }
            }
        }
        return stringFinal;
    }


    public static void imprimirArray(char[] arrayFinal) {
        for (int k = 0; k < arrayFinal.length; k++) {
            System.out.println(arrayFinal[k]);
        }
    }

    public static String convertirArray(char[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }
        return str;
    }


}
