package reptes_programacio.Conecta4;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {

    private static List<Player> players = new ArrayList<>();

    public static void addPlayer(Player player) {
        int count = 0;
        players.add(player);
    }



    public static void removePlayer(Player player) {
        players.remove(player);
    }

    public static Player getPlayerByName(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

}
