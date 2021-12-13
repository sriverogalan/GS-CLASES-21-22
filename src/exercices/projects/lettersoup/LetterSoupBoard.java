package exercices.projects.lettersoup;

public class LetterSoupBoard {

    public static void generarTablero(){
        char[][] tablero = new char[10][10];
        char[] alfabet = {'a','b','c','d','e','g','h','i','j','k','l','m','n','o','p','q','r','s','t','v','w','x','y','z'};
    }



    public static void imprimirTablero(char[][] tablero){
        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0; i < tablero.length;i++) {
            if (i == 0){
                System.out.print("    ");
                for (int x = 0; x < tablero[i].length; x++){
                    System.out.print("[" + contador1++ + "] ");
                }
                System.out.println();
            }
            System.out.print("[" + contador2++ + "] ");
            for (int j = 0; j < tablero[i].length; j++){
                System.out.print("[" + tablero[i][j] + "] ");
            }
            System.out.println();
        }
    }

}
