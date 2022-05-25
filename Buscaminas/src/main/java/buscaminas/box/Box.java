package buscaminas.box;

import buscaminas.utils.Colors;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

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
    public void open() {
        this.isOpen = true;
    }
    public void toggleFlag() {
        this.isFlag = !this.isFlag;
    }
    public void setMine() {
        this.isMine = true;
    }
    public void setMinesAround(int minesAround) {
        this.minesAround = minesAround;
    }
    // printUncovered()
    public String printUncovered() {
        this.isOpen = true;
        return this.toString();
    }
    @Override
    public String toString() {
        if (isOpen) {
            if (isMine) {
                return "( * )";
            } else {
                if (minesAround == 0) {
                    return Colors.BLUE + "( "+ minesAround +" )" + Colors.RESET;
                } else if (minesAround == 1) {
                    return Colors.GREEN + "( "+ minesAround +" )" + Colors.RESET;
                } else if (minesAround == 2) {
                    return Colors.YELLOW + "( "+ minesAround +" )" + Colors.RESET;
                } else if (minesAround >= 3) {
                    return Colors.RED + "( "+ minesAround +" )" + Colors.RESET;
                }
                return "( "+ minesAround +" )";
            }
        } else if (isFlag) {
            return "( F )";
        } else {
            return "( - )";
        }
    }
}
