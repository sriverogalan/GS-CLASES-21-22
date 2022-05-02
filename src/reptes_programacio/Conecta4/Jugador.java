package reptes_programacio.Conecta4;

public class Jugador {
    private String nombre;
    private boolean isJugador1;
    private String color;

    public Jugador(String nombre) {
        this.nombre = nombre;
        isJugador1 = false;
    }

    public boolean isJugador1() {
        return isJugador1;
    }

    public void setJugador1(boolean jugador1) {
        isJugador1 = jugador1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        if (isJugador1) {
            return "\u001B[31m";
        } else {
            return "\u001B[36m";
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
}
