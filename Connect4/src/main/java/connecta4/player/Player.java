package connecta4.player;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player {
    private int id;
    private String name;
    private String color;
    private int wins;
    private int loses;
    public Player(String name, String color){
        this.id = id;
        this.name = name;
        this.color = color;
        this.wins = wins;
        this.loses = loses;
    }
    public String getInitial(){
        return name.substring(0,1);
    }
}

