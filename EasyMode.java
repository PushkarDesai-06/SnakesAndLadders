public class EasyMode implements IMode {
  Dice dice;
  Board board;

  public EasyMode(Dice dice, Board board) {
    this.dice = dice;
    this.board = board;
  }

  @Override
  public boolean makeTurn(Player p) {
    int roll = dice.roll();
    int currScore = p.getScore();
    currScore += roll;
    currScore = board.updatePosition(currScore);

    // if (isSix)
    // currScore += makeTurn(p);

    return roll == 6;
  }

}
