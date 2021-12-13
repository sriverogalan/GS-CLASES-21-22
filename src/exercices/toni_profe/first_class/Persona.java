package exercices.toni_profe.first_class;

public class Persona {
    public String nom;
    public int edat;
    public String dni;
    public char sexe;
    public long telefon;

    public Persona() {
    }

    public Persona(String nom, int edat, String dni, char sexe, long telefon) {
        this.nom = nom;
        this.edat = edat;
        this.dni = dni;
        this.sexe = sexe;
        this.telefon = telefon;
     }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public long getTelefon() {
        return telefon;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", dni='" + dni + '\'' +
                ", sexe=" + sexe +
                ", telefon=" + telefon +
                '}';
    }
}
