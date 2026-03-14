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
    this.mode = new EasyMode(dice, board);
    displayer = new Displayer(this.board, this.players);
  }

  public void run() {
    while (true) {
      for (Player player : players) {
        if (player.isHasCompleted())
          continue;
        boolean playsAgain = mode.makeTurn(player);
        displayer.display();
      }

      boolean allCompleted = true;
      for (Player player : players) {
        allCompleted &= player.isHasCompleted();
      }

      if (allCompleted) {
        System.out.println("GAME OVER");
        break;
      }

      sc.nextLine();

    }
  }

}
