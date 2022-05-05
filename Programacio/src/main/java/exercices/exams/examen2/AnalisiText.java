package exercices.exams.examen2;

public class AnalisiText {
    private static final String provaExecucio = "Una noia anomenada Anna va anar a cercar al b)osc un home, alla hi va trobar un cec cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell daquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";
    private static final char[] delimitadors = new char[]{' ', '-', ',', '.', '!', '?'};
    private static char[] letter = {'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z'};

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

    public static boolean exercici5_esIniciDeParaula(int index) {
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

    public static int exercici6_longitudParaula(int index) {
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

    public static String exercici7_retornaParaula(int index) {
        String paraula = "";
        boolean isDelimited = false;
        for (int i = index; i < provaExecucio.length(); i++) {
            for (int j = 0; j < delimitadors.length; j++) {
                if (provaExecucio.charAt(i) == delimitadors[j]) {
                    isDelimited = true;
                    break;
                }
            }
            if (isDelimited) {
                break;
            }
            paraula += provaExecucio.charAt(i);
        }
        return paraula;
    }

    public static boolean exercici8_esPalindroma(String paraula) {
        boolean isPalindroma = true;
        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) != paraula.charAt(paraula.length() - i - 1)) {
                isPalindroma = false;
                break;
            }
        }
        return isPalindroma;
    }

    public static int exercici9_numeroPalindromes() {
        char[] chars = arrayCharsLowerCase();
        String var_temp = "";
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            if (exercici5_esIniciDeParaula(i)) {
                if (exercici8_esPalindroma(exercici7_retornaParaula(i))) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static String[] exercici10_paraulesPalindromes() {
        char[] chars = arrayCharsLowerCase();
        String var_temp = "";
        int counter = 0;
        int j = 0;
        String[] array = new String[exercici9_numeroPalindromes()];

        for (int i = 0; i < chars.length; i++) {
            if (exercici5_esIniciDeParaula(i)) {
                if (exercici8_esPalindroma(exercici7_retornaParaula(i))) {
                    array[j++] = exercici7_retornaParaula(i);
                }
            }
        }
        return array;
    }


    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[][] arrayBidimensionalConteAparicions() {
        int[][] array = new int[letter.length][letter.length];
        char[] chars = arrayCharsLowerCase();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 1; k < chars.length; k++) {
                    if (chars[k - 1] == letter[i] && chars[k] == letter[j]) {
                        array[i][j]++;
                    }
                }
            }
        }
        return array;
    }


}
