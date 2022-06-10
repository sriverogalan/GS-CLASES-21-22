package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static RAF.PreguntasMenu.*;


/** Leer admin leer usuario
 *  Falta tener en cuenta los errores de la aplicacion
 *  Ordenar visualmente el programa
 *  Refactorizar codigo
 * */

public class Menu {

    private static Scanner scan = new Scanner(System.in);

    private static ArticuloIO articuloIO;

    static {
        try {
            articuloIO = new ArticuloIO("RAF/fitxer.txt", "rw");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR AL PONER LA UBICACION DEL ARCHIVO COMPRUEBE QUE LA RUTA ESTA BIEN");;
        }
    }

    public static void iniciarArchivosAccesoAleatorio() throws Exception {
        Texto.lineasSepararFunciones();
        System.out.println(Colores.colorAzul + "\n" +
                "          █▀▀█ █▀▀█ █▀▀ █  █  ▀  ▀█ █▀ █▀▀█ █▀▀ 　 █▀▀▄ █▀▀ 　 █▀▀█ █▀▀ █▀▀ █▀▀ █▀▀ █▀▀█ \n" +
                "          █▄▄█ █▄▄▀ █   █▀▀█  █   █▄█  █  █ ▀▀█ 　 █  █ █▀▀ 　 █▄▄█ █   █   █▀▀ ▀▀█ █  █ \n" +
                "          ▀  ▀ ▀ ▀▀ ▀▀▀ ▀  ▀  ▀    ▀   ▀▀▀▀ ▀▀▀ 　 ▀▀▀  ▀▀▀ 　 ▀  ▀ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀▀ \n" +
                "\n" +
                "                        █▀▀█ █   █▀▀ █▀▀█ ▀▀█▀▀ █▀▀█ █▀▀█  ▀  █▀▀█ \n" +
                "                        █▄▄█ █   █▀▀ █▄▄█   █   █  █ █▄▄▀  █  █  █ \n" +
                "                        ▀  ▀ ▀▀▀ ▀▀▀ ▀  ▀   ▀   ▀▀▀▀ ▀ ▀▀  ▀  ▀▀▀▀ \n" + Colores.coloresReset);
        System.out.println();
        eleccionUsuario();
        /**
         * Inicia todo el programa
         * solo es visual y llama a un metodo
         * donde se ejecuta un switch para la eleccion de usuario
         * */
    }

    public static void eleccionUsuario() throws Exception {
        switch (CondicionesErroresMenu.eligeUsuario()) {
            case 0 -> System.exit(0);
            case 1 -> {
                Usuario cliente = new Usuario(false);
                menuCliente(cliente);
            }
            case 2 -> {
                Usuario admin = new Usuario(true);
                menuAdmin(admin);
            }
            default -> eleccionUsuario();
        }
    }

    private static void menuAdmin(Usuario admin) throws IOException {
        switch (CondicionesErroresMenu.eligeAdministrador()) {
            case 0 -> System.exit(0);
            case 1 -> {
                inserir();
                menuAdmin(admin);
            }
            case 2 -> {
                eliminar();
                menuAdmin(admin);
            }
            case 3 -> {
                editar();
                menuAdmin(admin);
            }
            case 4 -> {
                leer();
                menuAdmin(admin);
            }
            default -> {
                Texto.textoError();
                menuAdmin(admin);
            }
        }

    }

    private static void menuCliente(Usuario cliente) throws IOException {
        switch (CondicionesErroresMenu.eligeCliente()) {
            case 0 -> System.exit(0);
            case 1 -> {
                leer();
                menuCliente(cliente);
            }
            default -> {
                Texto.textoError();
                menuCliente(cliente);
            }
        }
    }

    public static void inserir() throws IOException {
        Texto.lineasSepararFunciones();
        articuloIO.add(new Articulo(PreguntasMenu.numeroIdEstaDentro(articuloIO),PreguntasMenu.stringNombre(),PreguntasMenu.stringDescripcion(),PreguntasMenu.numeroPrecio(),PreguntasMenu.numStock(),PreguntasMenu.eligeCategoria()));
    }

    private static void leer() throws IOException {
        switch (CondicionesErroresMenu.eligeLeer()) {
            case 0 -> Menu.articuloIO.leerArticulos();
            case 1 -> {
                switch (CondicionesErroresMenu.eligeLeerCategoria()) {
                    case 0 -> articuloIO.ordenacionArticulosCategoria(Categoria.SALON);
                    case 1 -> articuloIO.ordenacionArticulosCategoria(Categoria.CAMAS);
                    case 2 -> articuloIO.ordenacionArticulosCategoria(Categoria.SOFAS);
                    case 3 -> articuloIO.ordenacionArticulosCategoria(Categoria.SILLA);
                    case 4 -> articuloIO.ordenacionArticulosCategoria(Categoria.MESAS);
                    default -> leer();
                }
            }
            case 2 -> articuloIO.ordenacionArticulosMenorAMayor();
            case 3 -> articuloIO.ordenacionArticulosMayorAMenor();
            default -> leer();
        }
    }

    private static void editar() throws IOException {
        switch (CondicionesErroresMenu.eligeEditar()) {
            case 0 -> cambiarCantidadStock(articuloIO);
            case 1 -> editarDatosDeUnArticulo(articuloIO);
            case 2 -> actualizarDisponibilidadArticulo(articuloIO);
            default -> {
                Texto.textoError();
                editar();
            }
        }
    }

    private static void eliminar() throws IOException {
        PreguntasMenu.eliminarArticulo(articuloIO);
    }

}
