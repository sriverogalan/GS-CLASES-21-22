package reptes_programacio.Conecta4;

public class Jugador {
    private String nombre;
    private int numeroPartidasGanadas;
    private int numeroPartidasPerdidas;
    private int numeroPartidasEmpatadas;
    private boolean isJugador1;
    private int turno = 21;

    public Jugador(String nombre) {
        this.nombre = nombre;
        isJugador1 = false;
        this.numeroPartidasGanadas = numeroPartidasGanadas;
    }

    public int getNumeroPartidasPerdidas() {
        return numeroPartidasPerdidas;
    }

    public void setNumeroPartidasPerdidas(int numeroPartidasPerdidas) {
        this.numeroPartidasPerdidas = numeroPartidasPerdidas;
    }

    public int getNumeroPartidasEmpatadas() {
        return numeroPartidasEmpatadas;
    }

    public void setNumeroPartidasEmpatadas(int numeroPartidasEmpatadas) {
        this.numeroPartidasEmpatadas = numeroPartidasEmpatadas;
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

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String toString() {
        return this.nombre + " " + this.numeroPartidasGanadas;
    }

}
