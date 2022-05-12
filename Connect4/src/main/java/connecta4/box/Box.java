package connecta4.box;

import connecta4.player.Player;
import connecta4.utils.Colors;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter @NoArgsConstructor
public class Box {
    Player player;
    public boolean isEmpty() {
        //if (player == null) return true;
        //return false;

        return ( player == null );
    }
    public String getName() {
        if (player == null)
            return null;

        return player.getName();
    }
    @Override
    public String toString() {
        if (isEmpty())
            return " ( - ) ";

        return player.getColor() + " ( " + player.getName() + " ) " + Colors.RESET;
    }
}