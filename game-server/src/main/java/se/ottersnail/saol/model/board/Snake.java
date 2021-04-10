package se.ottersnail.saol.model.board;

public class Snake extends BoardTransport {

  private final BoardTransportDirection direction = BoardTransportDirection.DOWN;
  private final BoardTransportType type = BoardTransportType.SNAKE;

  public Snake(final int from, final int to) {
    super(from, to);
  }


}
