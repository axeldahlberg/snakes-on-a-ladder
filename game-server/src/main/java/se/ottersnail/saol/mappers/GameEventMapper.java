package se.ottersnail.saol.mappers;

import org.ottersnail.soal.Event;
import se.ottersnail.saol.controller.GameEvent;

public class GameEventMapper {


  public Event toProtbufEvent(final GameEvent gameEvent) {
    switch (gameEvent.getEvent()) {
      default:
        return Event.MOVE;
      case WIN:
        return Event.WIN;
      case LOOSE:
        return Event.LOSE;
      case SNAKE:
        return Event.SNAKE;
      case LADDER:
        return Event.LADDER;
    }
  }

  public GameEvent.Event toPOJOEvent(final Event event) {
    switch (event) {
      case LADDER:
        return GameEvent.Event.LADDER;
      case SNAKE:
        return GameEvent.Event.SNAKE;
      case WIN:
        return GameEvent.Event.WIN;
      case LOSE:
        return GameEvent.Event.LOOSE;
      case MOVE:
      case UNRECOGNIZED:
      default:return GameEvent.Event.MOVE;
    }
  }
}
