package se.ottersnail.saol.model;

public class Player {

  public final int id;

  private int previousPosition = -1;
  private int position = 0;

  public Player(final int id) {
    this.id = id;
  }

  public int getCurrentPosition() {
    return position;
  }

  public int setPosition(final int position) {
    setPreviousPosition(this.position);
    this.position = position;
    return this.position;
  }

  public int getPreviousPosition() {
    return previousPosition;
  }

  private void setPreviousPosition(final int previousPosition) {
    this.previousPosition = previousPosition;
  }

  @Override
  public String toString() {
    return "Player{" +
        "id=" + id +
        ", previousPosition=" + previousPosition +
        ", position=" + position +
        '}';
  }
}
