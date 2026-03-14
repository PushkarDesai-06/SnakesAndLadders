public class Snake implements Jumpable {

  int start;
  int end;

  public Snake(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public int getStart() {
    return this.start;
  }

  @Override
  public int getEnd() {
    return this.end;
  }

}
