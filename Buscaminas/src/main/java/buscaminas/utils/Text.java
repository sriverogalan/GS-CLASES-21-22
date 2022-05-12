package buscaminas.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {
    // SEPARATION
    public static void separation() {
        System.out.println("-----------------------------------------------------");
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