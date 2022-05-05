package reptes_programacio.Conecta4;

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

    public Player(String nombre) {
        this.name = name;
    }
    private int getId() {
        return id;
    }
    private int setId(int id) {
        this.id = id;
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

