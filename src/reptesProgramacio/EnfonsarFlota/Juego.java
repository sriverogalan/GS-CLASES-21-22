package reptesProgramacio.EnfonsarFlota;

public class Juego {
     public static void generarTableros(){
        Tablero tablero = new Tablero();
        Casilla[][] tableroAliado = tablero.generarTableroAliado();
        Casilla[][] tableroEnemigo = tablero.generarTableroEnemigo();

        imprimirTablero(tableroEnemigo, Colores.colorRojo);
        imprimirTablero(tableroAliado, Colores.colorAzul);
     }

     public static void imprimirTablero(Casilla[][] tablero, String color){
         System.out.println(color + "_________________________________________________________________________________________");
         for (int i = 0 ; i < tablero.length; i++){
             System.out.print(color + i);
             for (int j = 0; j < tablero[i].length; j++){
                 if (tablero[i][j].isTapada()){
                     System.out.print( " | " + " X "+ " | ");
                 }
             }
             System.out.println(Colores.coloresReset);
         }
     }


}
