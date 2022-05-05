package exercices.exams.examen2;

public class Main {
    public static void main(String[] args) {
       int[][] a = AnalisiText.arrayBidimensionalConteAparicions();
       char[] letters = {'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z'};


       for (int i = 0 ; i < a.length; i++){
           for (int j = 0; j < a[i].length ; j++){
               System.out.print(letters[i] + " + ");
               System.out.print(letters[j] + " -> ");
               System.out.print(a[i][j] + " | ");
           }
           System.out.println();
       }

    }
}
