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
    public static String escogeJugador1(Player player) {
        return Colores.ROJO + "Jugador"+ player.getId() +" , escoge tu nombre" + Colores.RESET;
    }

    public static void enQueColumnaQuieresMeterUnaFicha() {
        System.out.println(Colores.LILA + "\n En que columna quieres meter una ficha ? \n" + Colores.RESET);;
    }

    public static void errorAlPonerLasColumnas(){
        System.out.println(Colores.ROJO + "ERROR : No puedes meter fichas en esa columna" + Colores.RESET);
    }

    public static void errorJugar() {
        System.out.println(Colores.ROJO + "Error, intentalo de nuevo" + Colores.RESET);
    }

    public static void errorJugador() {
        System.out.println(Colores.ROJO + "Error al escribir el nombre del jugador, intentalo de nuevo" + Colores.RESET);
    }

    public static void separacion(){
        System.out.println("\n-----------------------------------------------------------------------------------------\n");
    }

    public static void escogeOtraColumna(){
        System.out.println(Colores.ROJO + "ERROR : Escoge otra columna esta esta llena" + Colores.RESET);
    }
    public static void turnoJugador(Player player) {
        System.out.println(player.getColor() + "Es tu turno Jugador : " + player.getName() + Colores.RESET);
    }
    public static void hasGanado(Player player) {
        System.out.println(player.getColor() + "Has ganado : " + player.getName() + Colores.RESET);
    }


}
