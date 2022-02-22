package reptesProgramacio.EnfonsarFlota;

import java.util.Random;

public class Tablero {
    public int cruceros = 1;
    public int destructors = 1;

    public int LONG_X = 10;
    public int LONG_Y = 10;

    public Casilla[][] tableroAliado;
    public Casilla[][] tableroEnemigo;

    public Tablero() {
        tableroAliado = new Casilla[LONG_X][LONG_Y];
        tableroEnemigo = new Casilla[LONG_X][LONG_Y];
    }
 
    /** Getters */

    public Casilla[][] getTableroAliado() {
        return tableroAliado;
    } 
    
    public Casilla[][] getTableroEnemigo() {
        return tableroEnemigo;
    }

    /* Setters */

    public void setCruceros(int cruceros) {
        this.cruceros = cruceros;
    }

    public void setDestructors(int destructors) {
        this.destructors = destructors;
    }

    /* Metodes */

    public Casilla[][] generarTableroAliado(){
        for (int i = 0; i < tableroAliado.length; i++){
            for (int j = 0 ; j < tableroAliado.length ; j++){
                tableroAliado[i][j] = new Casilla();
            }
        }
        return tableroAliado;
    }
    
    public Casilla[][] generarTableroEnemigo(){
        for (int i = 0; i < tableroEnemigo.length; i++){
            for (int j = 0 ; j < tableroEnemigo.length ; j++){
                tableroEnemigo[i][j] = new Casilla();
            }
        }
        return tableroEnemigo;
    }

    public Casilla[][] generarBarcos(){
        Random rand1 = new Random();
        

        for (int i = 0; i < tableroAliado.length; i++){
            for (int j = 0 ; j < tableroAliado.length ; j++){
                tableroAliado[i][j] = new Casilla();
            }
        }
        return tableroAliado;
    }






}
