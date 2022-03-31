package reptes_programacio.Conecta4;

public class Jugador {
    private int numPlayer;
    private String nom;
    private int wonParties;
    private int losingGames;

    public Jugador(String nom) {
        this.numPlayer = numPlayer;
        this.nom = nom;
        this.wonParties = 0;
        this.losingGames = 0;
    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getWonParties() {
        return wonParties;
    }

    public void setWonParties(int wonParties) {
        this.wonParties = wonParties;
    }

    public int getLosingGames() {
        return losingGames;
    }

    public void setLosingGames(int losingGames) {
        this.losingGames = losingGames;
    }

    public void addPartidaGuanyada() {
        this.wonParties++;
    }

    public void addPartidaPerduda() {
        this.losingGames++;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                " Nombre " + nom + '\'' +
                ", Partidas Ganadas " + wonParties +
                ", Partidas Perdidas " + losingGames +
                '}';
    }
}
