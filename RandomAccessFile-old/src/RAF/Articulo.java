package RAF;

public class Articulo implements Comparable{

    private int id; // 4 byte
    private String nombre; // 40 bytes
    private String descripcion; // 100 bytes
    private int precio; //  4 bytes
    private int numStock; //  4 bytes
    private Categoria categoria; // 4 byte
    private boolean activo = true; // 1 bytes
    private boolean estaEliminat = false; //1 bytes

    private static final int MAX_STRING_NOMBRE = 20;
    private static final int MAX_STRING_DESCRIPCION = 50;

    public Articulo(int id, String nombre, String descripcion, int precio, int numStock, Categoria categoria){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.numStock = numStock;
        this.categoria = categoria;
    }

    public Articulo(){}

    // AJUSTAR NOMS PERQUE NO ES PASI DE EL MAXIM DE L'STRING
    public String getNomAjustat(){
        String adjustedNom = this.nombre;
        if (adjustedNom.length() > MAX_STRING_NOMBRE) {
            adjustedNom = adjustedNom.substring(0, MAX_STRING_NOMBRE);
            return adjustedNom;
        }
        for (int i = this.nombre.length(); i < MAX_STRING_NOMBRE; i++) {
            adjustedNom += " ";
        }
        return adjustedNom;
    }
    // AJUSTAR DESCRIPCIO PERQUE NO ES PASI DE EL MAXIM DE L'STRING
    public String getDescripcionAjustat(){
        String adjustedDesc = this.descripcion;
        if (adjustedDesc.length() > MAX_STRING_DESCRIPCION) {
            adjustedDesc = adjustedDesc.substring( 0 , MAX_STRING_DESCRIPCION );
            return adjustedDesc;
        }
        for (int i = this.descripcion.length(); i < MAX_STRING_DESCRIPCION; i++) {
            adjustedDesc += " ";
        }
        return adjustedDesc;
    }

    // GET

    public Categoria getCategoria() {
        return categoria;
    }

    public int getId() {
        return id;
    }

    public static int getMaxStringNombre() {
        return MAX_STRING_NOMBRE;
    }

    public static int getMaxStringDescripcion() {
        return MAX_STRING_DESCRIPCION;
    }

    public int getPrecio() {
        return precio;
    }

    public int getNumStock() {
        return numStock;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean isEstaEliminat() {
        return estaEliminat;
    }


    // SET

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNumStock(int numStock) {
        this.numStock = numStock;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setEstaEliminat(boolean estaEliminat) {
        this.estaEliminat = estaEliminat;
    }

    // DEVOLVER SI ESTA ACTIVO O NO:

    public String activo(){
        if (activo){
            return "ACTIVO";
        } else {
            return Colores.colorRojo + "DESACTIVADO" + Colores.coloresReset;
        }
    }

    // ToString

    @Override
    public String toString() {
        return    Colores.colorAzul + " ID : " + Colores.colorBlanco + id
                + Colores.colorAzul + " NOMBRE DEL ARTICULO : " + Colores.colorBlanco + nombre
                + Colores.colorAzul + " DESCRIPCION DEL ARTICULO : " + Colores.colorBlanco + descripcion
                + Colores.colorAzul + " PRECIO: " + Colores.colorBlanco + precio
                + Colores.colorAzul + " NUMERO STOCK: " + Colores.colorBlanco + numStock
                + Colores.colorAzul + " CATEGORIA : " + Colores.colorBlanco + categoria
                + Colores.colorAzul + " EL PRODUCTO ESTA ACTUALMENTE : " + Colores.colorBlanco + activo() + Colores.coloresReset;
    }

    // Comparar articulos
    @Override
    public int compareTo(Object o) {
        return this.precio-((Articulo)o).getPrecio();
    }
}