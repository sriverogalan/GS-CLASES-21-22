package reptes_programacio.Conecta4.Box;

public class Box {
    private boolean isBuida;
    private String color;

    public Box(){
        isBuida = false;
        color = "";
    }

    public boolean isBuida() {
        return isBuida;
    }

    public void setBuida(boolean buida) {
        isBuida = buida;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}