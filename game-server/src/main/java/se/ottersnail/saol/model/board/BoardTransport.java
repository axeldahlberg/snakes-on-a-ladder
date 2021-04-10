package se.ottersnail.saol.model.board;

public abstract class BoardTransport {

  final int from;
  final int to;

  public BoardTransport(final int from, final int to) {
    this.from = from;
    this.to = to;
  }
  public int getFrom() {
    return from;
  }

  public int getTo() {
    return to;
  }

}
