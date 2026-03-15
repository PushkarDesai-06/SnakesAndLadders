public class Dice {
  private final int size;

  public Dice(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }

  public int roll() {
    // return 6;
    return (int) Math.floor(Math.random() * size + 1);
  }

}
