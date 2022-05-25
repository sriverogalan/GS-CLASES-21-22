package buscaminas.utils;

import buscaminas.player.Player;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {
    // SEPARATION
    public static void separation() {
        System.out.println("-----------------------------------------------------");
    }

    public static void chooseDifficulty() {
        System.out.println(Colors.CYAN + "\nELIGE LA DIFICULTAD : \n" +
                "1. PRINCIPIANTE (8 filas, 8 columnas, 10 minas)\n" +
                "2. NORMAL (16 filas, 16 columnas, 40 minas)\n" +
                "3. DIFICIL (16 filas, 30 columnas, 99 minas)\n" +
                "4. PERSONALIZADO (Elige tu las filas, las columnas y las minas)\n" +
                " \n " + Colors.RESET ); 
    }
    public static void enterRows() {
        System.out.println(Colors.CYAN + "\nIntroduce las filas (Minimo 4 - Maximo 30): " + Colors.RESET);
    }
    public static void enterCols() {
        System.out.println(Colors.CYAN + "\nIntroduce las columnas (Minimo 4 - Maximo 30): " + Colors.RESET);
    }
    public static void enterMines() {
        System.out.println(Colors.CYAN + "\nIntroduce las minas : " + Colors.RESET);
    }

    public static void openBox() {
        System.out.println(Colors.CYAN + "Que casilla quieres destapar? " + Colors.RESET);
    }
    public static void putFlag() {
        System.out.println(Colors.CYAN + "En que casilla quieres poner la bandera?. " + Colors.RESET);
    }

    public static void chooseNamePlayer() {
        System.out.println(Colors.CYAN + "Elige el nombre del jugador : " + Colors.RESET);
    }

    public static void welcome() {
        System.out.println(Colors.CYAN + " \n                                 BIENVENIDO AL BUSCAMINAS \n " + Colors.RESET);
    }
    public static void hasLose(Player player) {
        System.out.println(Colors.RED +
                "\n                _.-^^---....,,--       \n" +
                "            _--                  --_  \n" +
                "           <                        >)\n" +
                "           |                         | \n" +
                "            \\._                   _./  \n" +
                "               ```--. . , ; .--'''       \n" +
                "                     | |   |             \n" +
                "                  .-=||  | |=-.   \n" +
                "                  `-=#$%&%$#=-'   \n" +
                "                     | ;  :|     \n" +
                "            _____.,-#%&$@%#&#~,._____");
        System.out.println(
                "\n" +
                        "   ██████╗░░█████╗░░█████╗░░█████╗░███╗░░░███╗   ██╗\n" +
                        "   ██╔══██╗██╔══██╗██╔══██╗██╔══██╗████╗░████║   ██║\n" +
                        "   ██████╦╝██║░░██║██║░░██║██║░░██║██╔████╔██║   ██║\n" +
                        "   ██╔══██╗██║░░██║██║░░██║██║░░██║██║╚██╔╝██║   ╚═╝\n" +
                        "   ██████╦╝╚█████╔╝╚█████╔╝╚█████╔╝██║░╚═╝░██║   ██╗\n" +
                        "   ╚═════╝░░╚════╝░░╚════╝░░╚════╝░╚═╝░░░░░╚═╝   ╚═╝\n\n");
    }

    public static void hasWinned(Player player) {
        separation();
        System.out.println(Colors.GREEN + "\n" +
                "░██╗░░░░░░░██╗██╗███╗░░██╗███╗░░██╗███████╗██████╗░\n" +
                "░██║░░██╗░░██║██║████╗░██║████╗░██║██╔════╝██╔══██╗\n" +
                "░╚██╗████╗██╔╝██║██╔██╗██║██╔██╗██║█████╗░░██████╔╝\n" +
                "░░████╔═████║░██║██║╚████║██║╚████║██╔══╝░░██╔══██╗\n" +
                "░░╚██╔╝░╚██╔╝░██║██║░╚███║██║░╚███║███████╗██║░░██║\n" +
                "░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚══╝╚══════╝╚═╝░░╚═╝\n");
    }
    public static void menuChoose() {
        System.out.println(Colors.CYAN + " \n" +
                "1. Destapar casilla \n" +
                "2. Bandera (Poner/Quitar) \n" +
                "3. SALIR\n" +
                " \n " + Colors.RESET);
    }

    public static void quit(Player player) {
        System.out.println(Colors.RED + "Gracias por jugar " + player.getName() + " ." + Colors.RESET);
    }
}