package reptes_programacio.Conecta4;

public class Jugador {
    private String nombre;
    private int numeroPartidasGanadas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.numeroPartidasGanadas = numeroPartidasGanadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPartidasGanadas() {
        return numeroPartidasGanadas;
    }

    public void setNumeroPartidasGanadas(int numeroPartidasGanadas) {
        this.numeroPartidasGanadas = numeroPartidasGanadas;
    }

    public void incrementaPartidasGanadas() {
        this.numeroPartidasGanadas++;
    }

    public void decrementaPartidasGanadas() {
        this.numeroPartidasGanadas--;
    }

    public String toString() {
        return this.nombre + " " + this.numeroPartidasGanadas;
    }

}
