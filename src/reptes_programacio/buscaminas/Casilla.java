package reptes_programacio.buscaminas;

public class Casilla {
    private boolean tapada;
    private boolean bandera;
    private int bombaAlrededor;
    private boolean tieneBomba;

    public Casilla (){
        tapada = true;
        bandera = false;
        bombaAlrededor = 0;
        tieneBomba = false;
    }

    // GET

    public boolean getBandera() {
        return bandera;
    }

    public int getBombaAlrededor() {
        return bombaAlrededor;
    }

    public boolean getTapada() {
        return tapada;
    }

    public boolean getTieneBomba() {
        return tieneBomba;
    }

    // SET

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public void setBombaAlrededor(int bombaAlrededor) {
        this.bombaAlrededor = bombaAlrededor;
    }

    public void setTapada(boolean tapada) {
        this.tapada = tapada;
    }

    public void setTieneBomba(boolean tieneBomba) {
        this.tieneBomba = tieneBomba;
    }

}