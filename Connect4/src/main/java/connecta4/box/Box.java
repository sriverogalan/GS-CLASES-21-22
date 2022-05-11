package connecta4.box;

import connecta4.utils.Colors;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box {
    private boolean isEmpty;
    private String name;
    private String color;

    public Box() {
        isEmpty = true; // box is not empty
        name = "";
    }

    @Override
    public String toString() {
        if (isEmpty) return " ( - ) ";
        else return color + " ( " + name + " ) " + Colors.RESET;
    }
}