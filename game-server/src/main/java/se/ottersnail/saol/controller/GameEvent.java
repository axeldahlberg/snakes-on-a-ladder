package se.ottersnail.saol.controller;


public class GameEvent {

  private final int diceThrowValue;
  private final int position;
  private final Event event;

  public GameEvent(final int diceThrowValue, final int position, final Event event) {
    this.diceThrowValue = diceThrowValue;
    this.position = position;
    this.event = event;
  }


  public int getPosition() {
    return position;
  }

  public Event getEvent() {
    return event;
  }

  public int getDiceThrowValue() {
    return diceThrowValue;
  }

  public static enum Event {
    MOVE,SNAKE,LADDER,WIN,LOOSE
  }

  @Override
  public String toString() {
    return "GameEvent{" +
        "position=" + position +
        ", event=" + event.name() +
        '}';
  }
}
