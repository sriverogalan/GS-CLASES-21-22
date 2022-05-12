package connecta4.player;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player {
    private int id;
    private String name;
    private String color;
    public Player(String name, String color){
        this.name = name;
        this.color = color;
    }
    public String getInitial(){
        return name.substring(0,1);
    }
}

