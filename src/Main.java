import com.webfm.game.Player;
import com.webfm.game.TicTacToe;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);
        final var game = new TicTacToe();

        var player = Player.FIRST;

        while (true) {
            System.out.println(game);
            System.out.println("Joueur " + player + ", veuillez saisir un des chiffres [1-9] :");
            final var playerInput = scanner.nextInt();

            game.processInput(player, playerInput);

            player = nextPlayer(player);
        }

    }

    private static Player nextPlayer(Player player) {
        if (player.equals(Player.FIRST)) {
            return Player.SECOND;
        } else {
            return Player.FIRST;
        }
    }
}
