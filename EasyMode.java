public class EasyMode implements IMode {
  Dice dice;
  Board board;
  Displayer displayer;

  public EasyMode(Dice dice, Board board, Displayer displayer) {
    this.dice = dice;
    this.board = board;
    this.displayer = displayer;
  }

  @Override
  public void makeTurn(Player p) {
    boolean rolledSix = true;

    while (rolledSix) {
      int roll = dice.roll();
      int newScore = p.getScore() + roll;
      newScore = board.updatePosition(newScore);

      // Check if player reached or exceeded the end
      if (newScore == board.getSize() * board.getSize()) {
        newScore = board.getSize() * board.getSize();
        p.setScore(newScore);
        p.setHasCompleted(true);
        displayer.display();
      } else if (newScore > board.getSize() * board.getSize()) {
        displayer.display();
        return;
      }

      p.setScore(newScore);
      displayer.display();
      rolledSix = (roll == 6);
    }
  }

}
