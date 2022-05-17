package buscaminas.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {
    // SEPARATION
    public static void separation() {
        System.out.println("-----------------------------------------------------");
    }

    public static void chooseNamePlayer() {
        System.out.println("Introduce tu nick: ");
    }

    // choose board size
    public static void chooseBoard() {
        System.out.println("Elige el tamaño del tablero: \n" +
                "1. Pequeño (8x8) con 10 minas \n" +
                "2. Mediano (16x16) con 40 minas \n" +
                "3. Grande (16x30) con 99 minas  \n" +
                "4. Custom (MAX : 30x30) con las minas que quieras\n");
    }
    public static void titleMinesweeper() {
        System.out.println("\n" +
                "██████╗░██╗░░░██╗░██████╗░█████╗░░█████╗░███╗░░░███╗██╗███╗░░██╗░█████╗░░██████╗\n" +
                "██╔══██╗██║░░░██║██╔════╝██╔══██╗██╔══██╗████╗░████║██║████╗░██║██╔══██╗██╔════╝\n" +
                "██████╦╝██║░░░██║╚█████╗░██║░░╚═╝███████║██╔████╔██║██║██╔██╗██║███████║╚█████╗░\n" +
                "██╔══██╗██║░░░██║░╚═══██╗██║░░██╗██╔══██║██║╚██╔╝██║██║██║╚████║██╔══██║░╚═══██╗\n" +
                "██████╦╝╚██████╔╝██████╔╝╚█████╔╝██║░░██║██║░╚═╝░██║██║██║░╚███║██║░░██║██████╔╝\n" +
                "╚═════╝░░╚═════╝░╚═════╝░░╚════╝░╚═╝░░╚═╝╚═╝░░░░░╚═╝╚═╝╚═╝░░╚══╝╚═╝░░╚═╝╚═════╝░\n");
    }

    public static void errorWriteNumbers(int min, int max) {
        System.out.println(Colors.RED + "ERROR : El número debe estar entre " + min + " y " + max + "." + Colors.RESET);
    }

    public static void errorWriteStringWhenIsNumber() {
        System.out.println(Colors.RED + "ERROR : No es un número ." + Colors.RESET);
    }

    public static void hasLose() {
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

    public static void hasWinned() {
        separation();
        System.out.println(Colors.GREEN + "\n" +
                "░██╗░░░░░░░██╗██╗███╗░░██╗███╗░░██╗███████╗██████╗░\n" +
                "░██║░░██╗░░██║██║████╗░██║████╗░██║██╔════╝██╔══██╗\n" +
                "░╚██╗████╗██╔╝██║██╔██╗██║██╔██╗██║█████╗░░██████╔╝\n" +
                "░░████╔═████║░██║██║╚████║██║╚████║██╔══╝░░██╔══██╗\n" +
                "░░╚██╔╝░╚██╔╝░██║██║░╚███║██║░╚███║███████╗██║░░██║\n" +
                "░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚══╝╚══════╝╚═╝░░╚═╝\n");
    }

}