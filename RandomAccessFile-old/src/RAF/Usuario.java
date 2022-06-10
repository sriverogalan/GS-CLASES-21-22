package RAF;

public class Usuario {

    private boolean isAdmin;

    public Usuario(boolean isAdmin){
        this.isAdmin = isAdmin;
    }


    // GET

    public boolean isAdmin() {
        return isAdmin;
    }

    // SET

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

}
