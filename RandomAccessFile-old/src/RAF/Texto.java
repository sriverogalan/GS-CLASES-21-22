package RAF;

public class Texto {

    public static void lineasSepararFunciones(){
        System.out.println(Colores.colorBlanco +"__________________________________________________________________________________________________ \n" + Colores.coloresReset);
    }

    public static void introduceId(){
        System.out.println("Introduce el ID del Articulo : ");
    }

    public static void elegirUsuario(){
        lineasSepararFunciones();
        System.out.println(Colores.colorVerde + "\n PARA EMPEZAR A UTILIZAR EL PROGRAMA, " +
                "DEBERAS INTRODUCIR QUE TIPO DE USUARIO ERES :" + Colores.coloresReset);
        System.out.println("\n" +
                "0. Salir del Programa." + "\n" +
                "1. Usuario." + "\n" +
                "2. Administrador." + "\n");
    }
    public static void elegirAdmin() {
        lineasSepararFunciones();
        System.out.println(Colores.colorLila + "Que desea hacer ADMINISTRADOR con los Articulos?? \n");
        System.out.println(
                        "0. Salir. \n" +
                        "1. Añadir. \n" +
                        "2. Eliminar. \n" +
                        "3. Editar. \n" +
                        "4. Leer. \n" + Colores.coloresReset);
    }

    public static void elegirCliente(){
        lineasSepararFunciones();

        System.out.println(Colores.colorCyan +"Que desea hacer CLIENTE con los Articulos??\n");
        System.out.println(
                "0. Salir. \n" +
                "1. Leer."  + Colores.coloresReset);
    }

    public static void elegirLeer(){
        lineasSepararFunciones();
        System.out.println(Colores.colorCyan + "Bienvenido a leer, para poder leer el archivo, me tienes que decir que quieres que haga : \n");
        System.out.println("0. Leera todos los articulos del fichero (Del articulo más viejo, al más reciente).");
        System.out.println("1. Ordenacion por categoria.");
        System.out.println("2. Ordenacion por precio de MENOR a MAYOR.");
        System.out.println("3. Ordenacion por precio de MAYOR a MENOR." + Colores.coloresReset);
    }

    public static void eligeCategoria(){
        lineasSepararFunciones();
        System.out.println(Colores.colorCyan + "Elige una categoria : \n");
        System.out.println("0. SALON.");
        System.out.println("1. CAMAS.");
        System.out.println("2. SOFAS.");
        System.out.println("3. SILLA.");
        System.out.println("4. MESAS." + Colores.coloresReset);
    }

    public static void eligeEditar(){
        Texto.lineasSepararFunciones();
        System.out.println(Colores.colorCyan + "Que desea hacer?\n");
        System.out.println("0. Cambiar la cantidad del Stock de un articulo.");
        System.out.println("1. Editar datos de un articulo en concreto.");
        System.out.println("2. Actualizar disponibilidad del articulo." + Colores.coloresReset);
    }

    public static void eligeEstaActivo(){
        Texto.lineasSepararFunciones();
        System.out.println("Como deseas que este el articulo?");
        System.out.println("0. Desactivado.");
        System.out.println("1. Activado.");
    }

    public static void eligeEstaEliminado(){
        Texto.lineasSepararFunciones();
        System.out.println("Como deseas que este el articulo?");
        System.out.println("0. No Eliminado.");
        System.out.println("1. Eliminar.");

    }
    // ERRORES

    public static void errorEligeOpcionCorrecta0hasta2(){
        System.out.println(Colores.colorRojo +"\n ERROR : ELIGE UNA OPCION ENTRE EL 0 - 2 \n" + Colores.coloresReset);
    }
    public static void errorEligeOpcionCorrecta0hasta4(){
        System.out.println(Colores.colorRojo +"\n ERROR : ELIGE UNA OPCION ENTRE EL 0 - 4 \n" + Colores.coloresReset);
    }
    public static void errorEligeOpcionCorrecta0hasta1(){
        System.out.println(Colores.colorRojo +"\n ERROR : ELIGE UNA OPCION ENTRE EL 0 - 1 \n" + Colores.coloresReset);
    }

    public static void errorEligeOpcionCorrecta0hasta3(){
        System.out.println(Colores.colorRojo +"\n ERROR : ELIGE UNA OPCION ENTRE EL 0 - 3 \n" + Colores.coloresReset);
    }

    public static void errorNumeroIdMismoId(){
        System.out.println(Colores.colorRojo + "\n ERROR : Este articulo NO TIENE la misma ID que uno que ya esta dentro, PRUEBA A AÑADIR UN ARTICULO CON ESE ID \n" + Colores.coloresReset);
    }

    public static void errorNumeroIdEstaDentro(){
        System.out.println(Colores.colorRojo + "\n ERROR : Este articulo tiene un ID con el mismo nombre, cambielo para poder continuar\n" + Colores.coloresReset);
    }

    public static void errorHasEscritoUnaLetra(){
        System.out.println(Colores.colorRojo + "\n ERROR : Has escrito letras, debes escribir un numero mayor que 0 \n" + Colores.coloresReset);
    }

    public static void errorHasEscritoUnNumeroMenorOMayorMaximoPermitido(){
        System.out.println(Colores.colorRojo + "\n ERROR : Has escrito un numero menor que 0 o MAYOR del maximo permitido\n" + Colores.coloresReset);
    }
    public static void errorHasEscritoUnNumeroMenor0(){
        System.out.println(Colores.colorRojo + "\n ERROR : Has escrito un numero menor que 0 o igual a 0, ESCRIBE UN NUMERO MAS ALTO\n" + Colores.coloresReset);
    }
    public static void noHayArticulosDeEsaCategoria(){
        System.out.println(Colores.colorRojo + "\n ERROR : NO HAY ARTICULOS DE ESTA CATEGORIA \n" + Colores.coloresReset);
    }

    public static void errorAlIntentarEliminarArticuloBorrado(){
        System.out.println(Colores.colorRojo + "\n ERROR : Al intentar eliminar un articulo ya eliminado \n" + Colores.coloresReset);
    }
    public static void errorNoSePuedeOrdenarPorqueNoHayNada(){
        System.out.println(Colores.colorRojo + "\n ERROR : No Se Puede Ordenar Porque No Hay Nada Dentro \n" + Colores.coloresReset);
    }
    public static void textoError(){
        System.out.println(Colores.colorRojo + "\n" +" ERROR : INTENTELO DE NUEVO " + Colores.coloresReset);
    }

}