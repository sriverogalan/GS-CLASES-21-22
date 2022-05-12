package buscaminas.box;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Box {
    private boolean isOpen;
    private boolean isMine;
    private boolean isFlag;
    private int minesAround;

    public Box() {
        this.isOpen = false;
        this.isMine = false;
        this.isFlag = false;
        this.minesAround = 0;
    }

    @Override
    public String toString() {
        if (isOpen) {
            if (isMine) {
                return " ( * ) ";
            } else {
                return String.valueOf(minesAround);
            }
        } else if (isFlag) {
            return "( F )";
        } else {
            return "( X )";
        }
    }
}
