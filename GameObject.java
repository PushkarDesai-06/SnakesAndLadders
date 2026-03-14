import java.util.List;

public class GameObject {
  List<Player> players;
  List<Jumpable> jumpables;
  int currRoll;
  int currPlayer;

  public GameObject(int currPlayer, int currRoll, List<Jumpable> jumpables, List<Player> players) {
    this.currPlayer = currPlayer;
    this.currRoll = currRoll;
    this.jumpables = jumpables;
    this.players = players;
  }

  public List<Player> getPlayers() {
    return players;
  }

  public void setPlayers(List<Player> players) {
    this.players = players;
  }

  public List<Jumpable> getJumpables() {
    return jumpables;
  }

  public void setJumpables(List<Jumpable> jumpables) {
    this.jumpables = jumpables;
  }

  public int getCurrRoll() {
    return currRoll;
  }

  public void setCurrRoll(int currRoll) {
    this.currRoll = currRoll;
  }

  public int getCurrPlayer() {
    return currPlayer;
  }

  public void setCurrPlayer(int currPlayer) {
    this.currPlayer = currPlayer;
  }

}
