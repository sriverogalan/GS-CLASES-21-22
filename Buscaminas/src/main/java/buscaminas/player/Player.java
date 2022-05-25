package buscaminas.player;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player {
    private int id;
    private String name;
    public Player(String name){
        this.name = name;
    }
}

