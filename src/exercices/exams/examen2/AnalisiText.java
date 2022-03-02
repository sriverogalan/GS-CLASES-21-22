package exercices.exams.examen2;

import java.io.IOException;
import java.util.Locale;

public class AnalisiText {
    private static final String provaExecucio = "Una noia anomenada Anna va anar a cercar al b)osc un home, alla hi va trobar un cec que intentava trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";
    private static final char[] delimitadors = new char[]{' ', '-', ',', '.', '!', '?'};

    public static char[] arrayCharsLowerCase() {
        String textLowerCase = provaExecucio.toLowerCase();
        char[] array = new char[textLowerCase.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = textLowerCase.charAt(i);
        }

        return array;
    }

    public static void imprimirArrayChars(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static boolean teDelimitadors(int index) {
        char[] array = arrayCharsLowerCase();

        for (int i = 0; i < delimitadors.length; i++) {
            if (array[index] == delimitadors[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean exercici5(int index) {
        if (index == 0) {
            return true;
        }
        for (int i = 0; i < provaExecucio.length(); i++) {
            if (provaExecucio.charAt(i) == provaExecucio.charAt(index - 1)) {
                for (int j = 0; j < delimitadors.length; j++) {
                    if (provaExecucio.charAt(i) == delimitadors[j]) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static int exercici6(int index) {
        int counter = 0;
        boolean isDelimitator = false;

        for (int i = index; i < provaExecucio.length(); i++) {
            for (int j = 0; j < delimitadors.length; j++) {
                if (provaExecucio.charAt(i) == delimitadors[j]) {
                    isDelimitator = true;
                }
            }
            if (isDelimitator) {
                break;
            }
            counter++;
        }
        return counter;
    }

    public static String exercici7(int index) {
        for (int i = 0; i < provaExecucio.length(); i++) {

        }

        return " ";
    }

}
