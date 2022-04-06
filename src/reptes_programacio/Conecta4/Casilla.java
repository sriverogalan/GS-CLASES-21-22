package reptes_programacio.Conecta4;

public class Casilla {
    private boolean isOcupada;
    private boolean tieneFichaJugador1;
    private boolean tieneFichaJugador2;

    public Casilla(){
        isOcupada = false;
        tieneFichaJugador1 = false;
        tieneFichaJugador2 = false;
    }

    public boolean isOcupada() {
        return isOcupada;
    }

    public void setOcupada(boolean ocupada) {
        isOcupada = ocupada;
    }

    public boolean isTieneFichaJugador1() {
        return tieneFichaJugador1;
    }

    public void setTieneFichaJugador1(boolean tieneFichaJugador1) {
        this.tieneFichaJugador1 = tieneFichaJugador1;
    }

    public boolean isTieneFichaJugador2() {
        return tieneFichaJugador2;
    }

    public void setTieneFichaJugador2(boolean tieneFichaJugador2) {
        this.tieneFichaJugador2 = tieneFichaJugador2;
    }
}
