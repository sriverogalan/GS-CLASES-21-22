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
                            "3. Lila\n"+
                            "4. Amarillo\n");
    }
    public void chooseName(int i) {
        System.out.println("Introduce el nombre del jugador " + (i + 1));
    }
    public void columnToWhichYouWantToInSertCard() {
        System.out.println(Colors.PURPLE + "\n En que columna quieres meter una ficha ? \n" + Colors.RESET);;
    }
    public void errorChooseColumns(){
        System.out.println(Colors.RED + "ERROR : No puedes meter fichas en esa columna porque esta llena" + Colors.RESET);
    }
    public void separation(){
        System.out.println("\n-----------------------------------------------------------------------------------------\n");
    }
    public void turnPlayer(Player player) {
        System.out.println(player.getColor() + "Es tu turno Jugador : " + player.getName() + Colors.RESET);
    }
    public void win(Player player) {
        System.out.println(Colors.GREEN +"\n" +
                "██╗░░██╗░█████╗░░██████╗        ░██████╗░░█████╗░███╗░░██╗░█████╗░██████╗░░█████╗░\n" +
                "██║░░██║██╔══██╗██╔════╝        ██╔════╝░██╔══██╗████╗░██║██╔══██╗██╔══██╗██╔══██╗\n" +
                "███████║███████║╚█████╗░        ██║░░██╗░███████║██╔██╗██║███████║██║░░██║██║░░██║\n" +
                "██╔══██║██╔══██║░╚═══██╗        ██║░░╚██╗██╔══██║██║╚████║██╔══██║██║░░██║██║░░██║\n" +
                "██║░░██║██║░░██║██████╔╝        ╚██████╔╝██║░░██║██║░╚███║██║░░██║██████╔╝╚█████╔╝\n" +
                "╚═╝░░╚═╝╚═╝░░╚═╝╚═════╝░        ░╚═════╝░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝╚═════╝░░╚════╝░\n\n" + Colors.RESET);

        System.out.println(player.getColor() + "Enhorabuena jugador " + player.getName() + " le has ganado a tu contrincante!" + Colors.RESET);
    }
    public void draw() {
        System.out.println(Colors.YELLOW + "\n" +
                "███████╗███╗░░░███╗██████╗░░█████╗░████████╗███████╗\n" +
                "██╔════╝████╗░████║██╔══██╗██╔══██╗╚══██╔══╝██╔════╝\n" +
                "█████╗░░██╔████╔██║██████╔╝███████║░░░██║░░░█████╗░░\n" +
                "██╔══╝░░██║╚██╔╝██║██╔═══╝░██╔══██║░░░██║░░░██╔══╝░░\n" +
                "███████╗██║░╚═╝░██║██║░░░░░██║░░██║░░░██║░░░███████╗\n" +
                "╚══════╝╚═╝░░░░░╚═╝╚═╝░░░░░╚═╝░░╚═╝░░░╚═╝░░░╚══════╝\n" + Colors.RESET);

        System.out.println(Colors.YELLOW + "Y si hechamos otra para desempatar?" + Colors.RESET);
    }
    public void errorWriteNumbers(int min, int max) {
        System.out.println(Colors.RED + "ERROR : No puedes meter fichas ahi tienes que elegir un numero del " + min + " al " + max + Colors.RESET);
    }
    public void errorWriteStringWhenIsNumber() {
        System.out.println(Colors.RED + "ERROR : Pon un numero que aqui no va texto!" + Colors.RESET);
    }
}