package se.ottersnail.saol.service;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.ottersnail.soal.Dice;
import org.ottersnail.soal.DiceRollRequest;
import org.ottersnail.soal.DiceRollResponse;
import org.ottersnail.soal.GameBoardStatus;
import se.ottersnail.saol.controller.GameEvent;
import se.ottersnail.saol.mappers.GameEventMapper;
import se.ottersnail.saol.model.Player;
import se.ottersnail.saol.model.board.GameBoard;
import se.ottersnail.saol.model.dice.Dice.NotRolledDiceException;

public class StreamingDiceRollRequest implements StreamObserver<DiceRollRequest> {

  private final StreamObserver<DiceRollResponse> responseObserver;
  private final GameBoard gameBoard;
  private final GameEventMapper gameEventMapper = new GameEventMapper();

  public StreamingDiceRollRequest(
      final StreamObserver<DiceRollResponse> responseObserver, final GameBoard gameBoard) {
    this.responseObserver = responseObserver;
    this.gameBoard = gameBoard;
  }

  @Override
  public void onNext(final DiceRollRequest diceRollRequest) {

    // Dice roll requests received
    final int playerNumber = diceRollRequest.getPlayerNumber();
    System.out.println("Player nr" + playerNumber + " rolling dicer....");

    final Player player = gameBoard.getPlayerState(playerNumber);
    try {

      final GameEvent gameEvent = gameBoard.rollDice(player);

      responseObserver.onNext(buildDiceRollResponse(gameEvent));

      if(gameEvent.getEvent() == GameEvent.Event.WIN) {
        System.out.println("Player wins!" + player.id);
        gameBoard.resetBoard(playerNumber);
        responseObserver.onCompleted();
      }

    } catch (final NotRolledDiceException e) {
      e.printStackTrace();
      responseObserver.onError(Status.INTERNAL.withDescription("Can not roll dice").withCause(e).asRuntimeException());
      responseObserver.onCompleted();
    }

  }

  @Override
  public void onError(final Throwable throwable) {

  }

  @Override
  public void onCompleted() {

  }

  public DiceRollResponse buildDiceRollResponse(final GameEvent gameEvent) {
    final Dice diceResponse = Dice.newBuilder()
        .setValue(gameEvent.getDiceThrowValue())
        .build();

    final GameBoardStatus gameBoardStatusResponse = GameBoardStatus.newBuilder()
        .setPosition(gameEvent.getPosition())
        .setEvent(gameEventMapper.toProtbufEvent(gameEvent))
        .build();

    final DiceRollResponse diceRollResponse = DiceRollResponse.newBuilder()
        .setDice(diceResponse)
        .setGameBoardStatus(gameBoardStatusResponse)
        .build();
    return diceRollResponse;
  }
}

