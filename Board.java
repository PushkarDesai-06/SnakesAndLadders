
import java.util.List;

public class Board {
  private final int n;
  private final List<Jumpable> jumpables;

  public Board(int n, List<Jumpable> jumpables) {
    this.n = n;
    this.jumpables = List.copyOf(jumpables);
  }

  public int updatePosition(int position) {

    for (Jumpable jumpable : jumpables) {
      if (jumpable.getStart() == position) {
        return jumpable.getEnd();
      }
    }

    return position;
  }

  public void display() {
    for (int i = 0; i < this.n; i++) {
      for (int j = 0; j < this.n; j++) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  public int getSize() {
    return n;
  }

}
