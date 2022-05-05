package reptes_programacio.Buscaminas;

public class Usuario {

    private String nick;

    public Usuario (String nick){
        this.nick = nick;
    }

    public void setNombre(String nick){this.nick = nick;}

    public String getNombre() {
        return nick;
    }

    @Override
    public String toString() {
        return nick ;
    }
}
