package com.webfm.game;

import static com.webfm.constants.StringConstant.LINE_SEPARATOR;
import static com.webfm.constants.StringConstant.SPACE;

public class TicTacToe {

    private char[][] grid = new char[][]{
            {'.', '.', '.'},
            {'.', '.', '.'},
            {'.', '.', '.'}
    };

    @Override
    public String toString() {
        final var builder = new StringBuilder();
        builder.append("Grille du Morpion : ").append(LINE_SEPARATOR);
        for (char[] line : grid) {
            for (char cell : line) {
                builder.append(SPACE).append(cell).append(SPACE);
            }
            builder.append(LINE_SEPARATOR);
        }
        return builder.toString();
    }
}
