package buscaminas.board;

import buscaminas.box.Box;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Board {
    private int rows;
    private int columns;
    private int mines;
    private Box[][] board;

    public Board(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;

        board = new Box[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = new Box();
            }
        }
    }
}
