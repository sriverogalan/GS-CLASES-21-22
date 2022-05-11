package connecta4.utils;

import connecta4.player.Player;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {
    public void principal() {
        System.out.println(Colors.PURPLE +
                " ░█████╗░░█████╗░███╗░░██╗███████╗░█████╗░████████╗░█████╗░        ░░██╗██╗ \n"   +
                " ██╔══██╗██╔══██╗████╗░██║██╔════╝██╔══██╗╚══██╔══╝██╔══██╗        ░██╔╝██║ \n" +
                " ██║░░╚═╝██║░░██║██╔██╗██║█████╗░░██║░░╚═╝░░░██║░░░███████║        ██╔╝░██║ \n" +
                " ██║░░██╗██║░░██║██║╚████║██╔══╝░░██║░░██╗░░░██║░░░██╔══██║        ███████║ \n" +
                " ╚█████╔╝╚█████╔╝██║░╚███║███████╗╚█████╔╝░░░██║░░░██║░░██║        ╚════██║ \n" +
                " ░╚════╝░░╚════╝░╚═╝░░╚══╝╚══════╝░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝        ░░░░░╚═╝ \n\n\n" + Colors.RESET
        );
    }

    public void chooseColor(int i) {
        System.out.println("Introduce el color del jugador " + (i + 1));
        System.out.println("1. Rojo\n"+
                            "2. Verde\n"+
                            "3. Purple\n"+
                            "4. Yellow\n");
    }
    //chooseName(int i)
    public void chooseName(int i) {
        System.out.println("Introduce el nombre del jugador " + (i + 1));
    }
    public void columnToWhichYouWantToInSertCard() {
        System.out.println(Colors.PURPLE + "\n En que columna quieres meter una ficha ? \n" + Colors.RESET);;
    }
    public void errorChooseColumns(){
        System.out.println(Colors.RED + "ERROR : No puedes meter fichas en esa columna porque esta llena" + Colors.RESET);
    }
    public void errorPlay() {
        System.out.println(Colors.RED + "Error, intentalo de nuevo" + Colors.RESET);
    }
    public static void errorWrotePlayer() {
        System.out.println(Colors.RED + "Error al escribir el nombre del jugador, intentalo de nuevo" + Colors.RESET);
    }
    public void separation(){
        System.out.println("\n-----------------------------------------------------------------------------------------\n");
    }
    public void chooseOtherColumn(){
        System.out.println(Colors.RED + "ERROR : Escoge otra columna esta esta llena" + Colors.RESET);
    }
    public void turnPlayer(Player player) {
        System.out.println(player.getColor() + "Es tu turno Jugador : " + player.getName() + Colors.RESET);
    }
    public void win(Player player) {
        System.out.println(player.getColor() + "Has ganado : " + player.getName() + Colors.RESET);
    }
    public void draw() {
        System.out.println(Colors.YELLOW + "Empate" + Colors.RESET);
    }
}
