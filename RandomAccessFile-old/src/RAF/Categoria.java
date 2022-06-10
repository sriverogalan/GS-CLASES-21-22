package RAF;

public enum Categoria {
    SALON (0), CAMAS(1),
    SOFAS(2), SILLA(3),
    MESAS(4);

    private int idCategoria;

    private Categoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }



}
