package reptes_programacio.Conecta4;

public class Texto {
    public static void principal() {
        System.out.println(Colores.LILA +
                " ░█████╗░░█████╗░███╗░░██╗███████╗░█████╗░████████╗░█████╗░        ░░██╗██╗ \n"   +
                " ██╔══██╗██╔══██╗████╗░██║██╔════╝██╔══██╗╚══██╔══╝██╔══██╗        ░██╔╝██║ \n" +
                " ██║░░╚═╝██║░░██║██╔██╗██║█████╗░░██║░░╚═╝░░░██║░░░███████║        ██╔╝░██║ \n" +
                " ██║░░██╗██║░░██║██║╚████║██╔══╝░░██║░░██╗░░░██║░░░██╔══██║        ███████║ \n" +
                " ╚█████╔╝╚█████╔╝██║░╚███║███████╗╚█████╔╝░░░██║░░░██║░░██║        ╚════██║ \n" +
                " ░╚════╝░░╚════╝░╚═╝░░╚══╝╚══════╝░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝        ░░░░░╚═╝ \n\n\n" + Colores.RESET
        );
    }
    public static Texto escogeJugador1() {
        System.out.println(Colores.LILA + "Jugador 1, escoge tu nombre" + Colores.RESET);
        return null;
    }

    public static void escogeJugador2() {
        System.out.println(Colores.LILA + "Jugador 2, escoge tu nombre" + Colores.RESET);
    }


    public static void errorJugar() {
        System.out.println(Colores.ROJO + "Error, intentalo de nuevo" + Colores.RESET);
    }
}
