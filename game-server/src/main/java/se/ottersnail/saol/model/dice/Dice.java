package se.ottersnail.saol.model.dice;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

  public boolean isRolled = false;
  private int lastResult = -1;

  public int roll() {
    // [1,7)
    this.isRolled = true;

    this.lastResult = ThreadLocalRandom.current().nextInt(1, 7);
    return this.lastResult;
  }

  public int getLastResult() throws NotRolledDiceException {
    if(!this.isRolled) {
      throw new NotRolledDiceException("You havent rolled the dice yet!");
    }
    return this.lastResult;
  }

  public void printLastDiceResult() {
    System.out.println("Dice last throw: " + this.lastResult);
  }

  protected enum DiceDots {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6);
    private final int value;

    DiceDots(final int value) {
      this.value = value;
    }
  }

  public static class NotRolledDiceException extends Exception {

    public NotRolledDiceException(final String message) {
      super(message);
    }
  }
}
