import com.webfm.exceptions.TicTacToeInvalidInputException;
import com.webfm.game.Player;
import com.webfm.game.TicTacToe;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        final var game = new TicTacToe();

        var player = Player.FIRST;

        while (true) {
            try {
                System.out.println(game);
                System.out.println("Joueur " + player + ", veuillez saisir un des chiffres [1-9] :");
                final var inputUser = getInputUser();

                game.processInput(player, (Integer) inputUser);

                if (game.checkWin()) {
                    System.out.println(game);
                    System.out.println("Le joueur " + player + " a gagné la partie ! :");
                    break;
                }

                if (game.checkDraw()) {
                    System.out.println(game);
                    System.out.println("Match NUL !");
                    break;
                }

                player = nextPlayer(player);
            } catch (TicTacToeInvalidInputException e){
                System.out.println(e.getMessage());
            }


        }

    }

    private static Object getInputUser() throws TicTacToeInvalidInputException {
        final var scanner = new Scanner(System.in);
        var input = scanner.nextInt();
        if(input < 1 || input > 9) {
            throw new TicTacToeInvalidInputException("Le chiffre doit être entre 1 et 9.");
        }
        return input;
    }

    private static Player nextPlayer(Player player) {
        if (player.equals(Player.FIRST)) {
            return Player.SECOND;
        } else {
            return Player.FIRST;
        }
    }
}
