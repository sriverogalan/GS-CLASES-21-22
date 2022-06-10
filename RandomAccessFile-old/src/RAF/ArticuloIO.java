package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;

public class ArticuloIO {

    private static final int articuloSize = 4 + (Articulo.getMaxStringNombre() * 2) +
            (Articulo.getMaxStringDescripcion() * 2) + 4 + 4 + 4 + 1 + 1; // 158 bytes

    private final RandomAccessFile file ;

    public ArticuloIO(String nombreFichero, String mode) throws FileNotFoundException {
        file = new RandomAccessFile(nombreFichero, mode);
    }

    //METODOS

    /**
     * Añade el articulo al final del fichero
     */

    public void add(Articulo articulo) throws IOException {
        // fer boolea un si esta eliminat
        if (obtenerSiEstaEliminado(articulo.getId())) {
            file.seek(colocarArticulo(articulo.getId()));
        } else {
            file.seek(file.length());
        }
        escribirArticulo(articulo);
    }

    public int colocarArticulo(int id) throws IOException {
        for (int i = 0; i < getContadorArticulos(); i++) {
            file.seek((long) i * articuloSize);
            if (id == file.readInt()) {
                return (int) ((long) i * articuloSize);
            }
        }
        return -1;
    }


    /**
     * Añade el articulo
     */

    public void escribirArticulo(Articulo articulo) throws IOException {
        file.writeInt(articulo.getId());
        file.writeChars(articulo.getNomAjustat());
        file.writeChars(articulo.getDescripcionAjustat());
        file.writeInt(articulo.getPrecio());
        file.writeInt(articulo.getNumStock());
        file.writeInt(articulo.getCategoria().getIdCategoria());
        file.writeBoolean(articulo.isActivo());
        file.writeBoolean(articulo.isEstaEliminat());
    }

    /**
     * Lee todos los articulos que hay en el documento, y esta limitado a 10     *
     */

    public void leerArticulos() throws IOException {
        Articulo articulo;
        for (int i = 0; i < getContadorArticulos(); i++) {
            file.seek((long) i * articuloSize);
            articulo = leerArticulo();
            if (!articulo.isEstaEliminat()) {
                System.out.println(articulo);
            }
        }
    }

    /**
     * Lee el articulo y lo ordena por categoria
     */

    public void ordenacionArticulosCategoria(Categoria categoria) throws IOException {
        boolean haSalidoBien = false;
        Articulo articulo;

        for (int i = 0; i < getContadorArticulos(); i++) {
            file.seek((long) i * articuloSize);
            articulo = leerArticulo();
            if (articulo.isActivo() && !articulo.isEstaEliminat() && articulo.getCategoria() == categoria) {
                System.out.println(articulo);
                haSalidoBien = true;
            }
        }
        if (!haSalidoBien) {
            Texto.noHayArticulosDeEsaCategoria();
        }
    }

    /**
     * Ordena los articulos de mayor a menor metiendolos en un ArrayList y utilizando un CompareTo de la clase Articulo
     */

    public void ordenacionArticulosMenorAMayor() throws IOException {
        imprimirArticulosArrayList(ordenacionArticulosPorPrecioAscendente(meterArticulosArrayList()));
    }

    /**
     * Ordena los articulos de MENOR a MAYOR metiendolos en un ArrayList y utilizando un CompareTo
     */

    public void ordenacionArticulosMayorAMenor() throws IOException {
        imprimirArticulosArrayList(ordenacionArticulosPorPrecioDescendente(meterArticulosArrayList()));
    }

    /**
     * Mete los Articulos en un ArrayList para hacer las operaciones de ordenacion
     */

    public ArrayList<Articulo> meterArticulosArrayList() throws IOException {
        ArrayList<Articulo> articulos = new ArrayList<>();
        Articulo articulo;
        for (int i = 0; i < getContadorArticulos(); i++) {
            file.seek((long) i * articuloSize);
            articulo = leerArticulo();
            if (articulo.isActivo() && !articulo.isEstaEliminat()) {
                articulos.add(articulo);
            }
        }
        return articulos;
    }

    /**
     * Ordena ascendentemente y retorna el ArrayList
     */

    public ArrayList<Articulo> ordenacionArticulosPorPrecioAscendente(ArrayList<Articulo> articulos) {
        Collections.sort(articulos);
        return articulos;
    }

    /**
     * Ordena ascendentemente, y luego lo gira y retorna el ArrayList
     */

    public ArrayList<Articulo> ordenacionArticulosPorPrecioDescendente(ArrayList<Articulo> articulos) {
        ordenacionArticulosPorPrecioAscendente(articulos);
        Collections.reverse(articulos);
        return articulos;
    }

    /**
     * Imprime los articulos por pantalla
     */

    public void imprimirArticulosArrayList(ArrayList<Articulo> articulos) {
        for (Articulo a : articulos) {
            System.out.println(a);
        }
        if (articulos == null || articulos.size() == 0){
            Texto.errorNoSePuedeOrdenarPorqueNoHayNada();
        }
    }

    /**
     * Lee articulos
     */

    public Articulo leerArticulo() throws IOException {
        Articulo articulo = new Articulo();
        if (file.getFilePointer() % articuloSize == 0) {
            setsArticulo(articulo);
        }
        return articulo;
    }

    /**
     * hace los sets del articulo y lo retorna
     */

    public Articulo setsArticulo(Articulo articulo) throws IOException {

        articulo.setId(file.readInt());
        articulo.setNombre(leerString(Articulo.getMaxStringNombre()));
        articulo.setDescripcion(leerString(Articulo.getMaxStringDescripcion()));
        articulo.setPrecio(file.readInt());
        articulo.setNumStock(file.readInt());
        int categoria = file.readInt();
        articulo.setCategoria(Categoria.values()[categoria]);
        articulo.setActivo(file.readBoolean());
        articulo.setEstaEliminat(file.readBoolean());

        return articulo;
    }

    /**
     * Leer String: LEE EL STRING QUE LE PASAN POR PARAMETRO PARA METERLO TODO EN UN STRING
     */

    public String leerString(int stringLength) throws IOException {
        String name = "";
        for (int i = 0; i < stringLength; i++) {
            name += file.readChar();
        }
        return name;
    }

    /**
     * DA EL INDEX DEL ARTICULO SEGUN LA ID PASADA POR PARAMETRO TE RETORNA DEL "INDEX" DEL NUMERO DE ARTICULO QUE ES
     * SI NO ESTA LO QUE BUSCAMOS RETORNA -1
     */

    public int getArticuloIndex(int id) throws IOException {
        for (int i = 0; i < getContadorArticulos(); i++) {
            file.seek((long) i * articuloSize);
            if (id == file.readInt()) {
                return i;
            }
        }
        return -1;
    }

    public void cambiarStock(int id, int numStock) throws IOException {
        int index = getArticuloIndex(id);
        file.seek((long) index * articuloSize + 148);
        file.writeInt(numStock);
    }

    public void editarArticulo(Articulo articulo) throws IOException {
        int index = getArticuloIndex(articulo.getId());
        file.seek((long) index * articuloSize);
        escribirArticulo(articulo);
    }

    public void actualizarStock(int id, boolean isActive) throws IOException {
        int index = getArticuloIndex(id);
        file.seek((long) index * articuloSize + 156);
        file.writeBoolean(isActive);
    }

    public boolean obtenerSiElIdEstaDentro(int id) throws IOException {
        for (int i = 0; i < getContadorArticulos(); i++) {
            file.seek((long) i * articuloSize);
            if (id == file.readInt()) {
                return true;
            }
        }
        return false;
    }

    public void eliminarArticulo(int id, boolean eliminar) throws IOException {
        int index = getArticuloIndex(id);
        file.seek((long) index * articuloSize + 157);
        file.writeBoolean(eliminar);
    }

    /**
     * CONTADOR DE ARTICULOS, DEVUELVE LOS ARTICULOS QUE HAY (int)
     */

    private int getContadorArticulos() throws IOException {
        return (int) (file.length() / articuloSize);
    }

    public boolean obtenerSiEstaEliminado(int id) throws IOException {
        for (int i = 0; i < getContadorArticulos(); i++) {
            file.seek((long) i * articuloSize);
            if (id == file.readInt()) {
                file.seek((long) i * articuloSize + 157);
                return file.readBoolean();
            }
        }
        return false;
    }
}