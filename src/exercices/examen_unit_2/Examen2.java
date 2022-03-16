package exercices.examen_unit_2;

import java.util.Arrays;

/**
 * Created by Sergi Rivero
 * at 28/02/2022 16:21
 * Project: GS-CLASES-21-22
 * Class: Examen2
 */

public class Examen2 {
    public static void main(String[] args) {
        String str = "Hola que tal estas?";
        int contador1 = 0;
        char[] delimitadors = {' ','?'};
        String string = "";

        for (int i = 0 ; i < str.length(); i++){
            for (char delimitador : delimitadors){
                if (str.charAt(i) == delimitador){
                    contador1++;
                }
            }
        }
        String[] array = new String[contador1];
        int counter = 0 ;

        for (int i = 0 ; i < str.length(); i++){
            string += str.charAt(i);
            for (char delimitador : delimitadors){
                if (str.charAt(i) == delimitador){
                    array[counter] = string;
                    string = "";
                    counter++;
                }
            }
        }

        for (int i = 0 ; i < array.length; i++){
            System.out.println(array[i]);
        }

    }


}
