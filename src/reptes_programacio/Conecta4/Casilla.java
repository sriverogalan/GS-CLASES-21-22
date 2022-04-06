package reptes_programacio.Conecta4;

public class Casilla {
    private boolean isOcupada;
    private boolean isVacia;

    public Casilla(){
        isOcupada = false;
        isVacia = true;
    }

    public boolean getIsOcupada(){
        return isOcupada;
    }

    public boolean getIsVacia(){
        return isVacia;
    }

    public void setIsOcupada(boolean isOcupada){
        this.isOcupada = isOcupada;
    }

    public void setIsVacia(boolean isVacia){
        this.isVacia = isVacia;
    }
}
