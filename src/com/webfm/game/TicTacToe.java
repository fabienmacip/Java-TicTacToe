package com.webfm.game;

import static com.webfm.constants.StringConstant.LINE_SEPARATOR;
import static com.webfm.constants.StringConstant.SPACE;

public class TicTacToe {

    private char[][] grid = new char[][]{
            {'.', '.', '.'},
            {'.', '.', '.'},
            {'.', '.', '.'}
    };

    public void processInput(Player player, int playerInput) {
        final var row = (playerInput - 1) / 3;
        final var column = (playerInput - 1) % 3;
        if (grid[row][column] == '.') {
            if (player.equals(Player.FIRST)) {
                grid[row][column] = 'X';
            } else {
                grid[row][column] = 'O';
            }
        }
    }

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
