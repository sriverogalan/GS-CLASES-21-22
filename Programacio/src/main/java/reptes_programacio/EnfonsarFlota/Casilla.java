package main.java.reptes_programacio.EnfonsarFlota;

public class Casilla {
    public boolean tapada = true;
    public boolean teVaixell = false;
    public boolean tieneBarcoAlrededor = false;

    public Casilla (){
        this.tapada = tapada;
        this.teVaixell = teVaixell;
        this.tieneBarcoAlrededor = tieneBarcoAlrededor;
    }

    /** Getters */
    public boolean isTapada() {
        return tapada;
    }

    public boolean isTeVaixell() {
        return teVaixell;
    }

    public boolean isTieneBarcoAlrededor() {
        return tieneBarcoAlrededor;
    }

    /** Setters */

    public void setTapada(boolean tapada) {
        this.tapada = tapada;
    }

    public void setTeVaixell(boolean teVaixell) {
        this.teVaixell = teVaixell;
    }

    public void setTieneBarcoAlrededor(boolean tieneBarcoAlrededor) {
        this.tieneBarcoAlrededor = tieneBarcoAlrededor;
    }
}