package se.ottersnail.saol.service;

import io.grpc.stub.StreamObserver;
import org.ottersnail.soal.DiceRollRequest;
import org.ottersnail.soal.DiceRollResponse;
import org.ottersnail.soal.SnakesOnALadderGameServiceGrpc;
import se.ottersnail.saol.model.board.GameBoard;

public class SnakesOnALadderGameService extends SnakesOnALadderGameServiceGrpc.SnakesOnALadderGameServiceImplBase {

  private final GameBoard gameBoard;


  public SnakesOnALadderGameService(final GameBoard gameBoard) {
    this.gameBoard = gameBoard;
  }

  @Override
  public StreamObserver<DiceRollRequest> rollDice(final StreamObserver<DiceRollResponse> responseObserver) {
    System.out.println("Rolled dice called");
    return new StreamingDiceRollRequest(responseObserver,gameBoard);
  }
}
