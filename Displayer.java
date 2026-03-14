import java.util.ArrayList;
import java.util.List;

public class Displayer {
  Board board;
  List<Player> players;

  public Displayer(Board board, List<Player> players) {
    this.board = board;
    this.players = players;
  }

  public void display() {
    List<List<Character>> boardList = new ArrayList<>();
    for (int i = 0; i < board.getSize(); i++) {
      List<Character> temp = new ArrayList<>();
      for (int j = 0; j < board.getSize(); j++) {
        temp.add('.');
      }
      boardList.add(temp);
    }

    for (Player player : players) {
      int position = player.getScore();
      int row = position / board.getSize();
      int col = position % board.getSize();
      boardList.get(row).set(col, (char) ('A' + player.getId()));
    }
    // Print the board
    for (int i = boardList.size() - 1; i >= 0; i--) {
      List<Character> row = boardList.get(i);
      for (Character cell : row) {
        System.out.print(cell + " ");
      }
      System.out.println();
    }
  }

}
