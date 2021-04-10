package se.ottersnail.saol.model.board;

public class Ladder extends BoardTransport {

  private final BoardTransportDirection direction = BoardTransportDirection.UP;
  private final BoardTransportType type = BoardTransportType.LADDER;

  public Ladder(final int from, final int to) {
    super(from,to);
  }

  public BoardTransportDirection getDirection() {
    return direction;
  }

}
