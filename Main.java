import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {

    List<Player> players = new ArrayList<>();
    players.add(new Player(0, "Player_1"));

    List<Jumpable> jumpables = List.of(
        new Snake(25, 2),
        new Ladder(4, 34),
        new Snake(44, 10));

    Game game = new Game(players, "EasyMode", 10, jumpables);
    game.run();
  }
}