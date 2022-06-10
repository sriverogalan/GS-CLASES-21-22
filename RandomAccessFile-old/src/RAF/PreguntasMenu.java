package RAF;

import java.io.IOException;
import java.util.Scanner;

import static RAF.Texto.errorNumeroIdMismoId;

public class PreguntasMenu {
    private static final Scanner scan = new Scanner(System.in);

    public static int numeroId(ArticuloIO articuloIO) throws IOException {
        int numId = CondicionesErroresMenu.idCorrecto();

        if (articuloIO.obtenerSiEstaEliminado(numId)) {
            Texto.errorAlIntentarEliminarArticuloBorrado();
            return numeroId(articuloIO);
        }
        if (articuloIO.obtenerSiElIdEstaDentro(numId)) {
            return numId;
        } else {
            errorNumeroIdMismoId();
            return numeroId(articuloIO);
        }
    }

    public static int numeroIdEstaDentro(ArticuloIO articuloIO) throws IOException {
        Texto.lineasSepararFunciones();
        int numId = CondicionesErroresMenu.idCorrecto();


        if (articuloIO.obtenerSiEstaEliminado(numId) || !articuloIO.obtenerSiElIdEstaDentro(numId)) {
            return numId;
        } else {
            Texto.errorNumeroIdEstaDentro();
            return numeroIdEstaDentro(articuloIO);
        }
    }

    public static String stringNombre() {
        Texto.lineasSepararFunciones();
        System.out.println("Introduce el NOMBRE del Articulo");
        return scan.nextLine();
    }

    public static String stringDescripcion() {
        Texto.lineasSepararFunciones();
        System.out.println("Introduce la DESCRIPCION del Articulo");
        return scan.nextLine();
    }

    public static int numeroPrecio() {
        Texto.lineasSepararFunciones();
        return CondicionesErroresMenu.numMenor0Correcto("Añade el Precio : ");
    }

    public static int numStock() {
        Texto.lineasSepararFunciones();
        return CondicionesErroresMenu.numMenor0Correcto("Añade el Stock que tiene : ");
    }

    public static Categoria eligeCategoria() {
        switch (CondicionesErroresMenu.eligeCategoria()) {
            case 0:
                return Categoria.SALON;
            case 1:
                return Categoria.CAMAS;
            case 2:
                return Categoria.SOFAS;
            case 3:
                return Categoria.SILLA;
            case 4:
                return Categoria.MESAS;
            default:
                Texto.textoError();
                eligeCategoria();
                break;
        }
        return null;
    }

    public static boolean estaActivo() {
        return switch (CondicionesErroresMenu.eligeEstaActivo()) {
            case 0 -> false;
            case 1 -> true;
            default -> estaActivo();
        };
    }

    public static boolean estaEliminado() {
        return switch (CondicionesErroresMenu.eligeSiEstaEliminado()) {
            case 0 -> false;
            case 1 -> true;
            default -> estaEliminado();
        };
    }

    public static void cambiarCantidadStock(ArticuloIO articuloIO) throws IOException {
        Texto.lineasSepararFunciones();
        articuloIO.cambiarStock(numeroId(articuloIO), numStock());
    }

    public static void editarDatosDeUnArticulo(ArticuloIO articuloIO) throws IOException {
        Texto.lineasSepararFunciones();
        articuloIO.editarArticulo(new Articulo(numeroId(articuloIO), stringNombre(), stringDescripcion(), numeroPrecio(), numStock(), eligeCategoria()));
    }

    public static void actualizarDisponibilidadArticulo(ArticuloIO articuloIO) throws IOException {
        Texto.lineasSepararFunciones();
        articuloIO.actualizarStock(numeroId(articuloIO), estaActivo());
    }

    public static void eliminarArticulo(ArticuloIO articuloIO) throws IOException {
        Texto.lineasSepararFunciones();
        articuloIO.eliminarArticulo(numeroId(articuloIO), estaEliminado());
    }
}