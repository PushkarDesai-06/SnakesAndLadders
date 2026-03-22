public class DifficultMode implements IMode {

  Dice dice;
  Board board;
  Displayer displayer;
  static final int MAX_ROLES = 3;

  public DifficultMode(Dice dice, Board board, Displayer displayer) {
    this.dice = dice;
    this.board = board;
    this.displayer = displayer;
  }

  @Override
  public void makeTurn(Player p) {
    boolean rolledSix = true;
    int sixCount = 0;

    while (rolledSix) {
      int roll = dice.roll();
      int newScore = p.getScore() + roll;
      newScore = board.updatePosition(newScore);

      // Check if player reached or exceeded the end
      if (newScore == board.getMaxScore()) {
        p.setScore(newScore);
        p.setHasCompleted(true);
        displayer.display();
      } else if (newScore > board.getMaxScore()) {
        displayer.display();
        return;
      }

      p.setScore(newScore);
      displayer.display();
      if (roll == 6) {
        sixCount++;

        if (sixCount == DifficultMode.MAX_ROLES)
          return;
      } else {
        rolledSix = false;
      }
    }
  }

}
