import java.util.List;
import java.util.Scanner;

public class Game {
  IMode mode;
  Board board;
  Dice dice;
  List<Player> players;
  Displayer displayer;
  Scanner sc = new Scanner(System.in);

  public Game(List<Player> players, String mode, int n, List<Jumpable> jumpables) {
    this.players = players;
    dice = new Dice(6);
    board = new Board(n, jumpables);
    displayer = new Displayer(this.board, this.players);
    this.mode = new DifficultMode(dice, board, displayer);
  }

  public void run() {
    while (true) {
      for (Player player : players) {
        if (player.isHasCompleted())
          continue;
        mode.makeTurn(player);

        sc.nextLine();
      }

      boolean allCompleted = true;

      for (Player player : players) {
        if (!player.isHasCompleted()) {
          allCompleted = false;
          break;
        }
      }

      if (allCompleted) {
        System.out.println("GAME OVER");
        break;
      }

    }
  }

}
