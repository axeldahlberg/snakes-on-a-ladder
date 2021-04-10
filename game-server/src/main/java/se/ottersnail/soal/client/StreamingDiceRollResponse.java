package se.ottersnail.soal.client;

import io.grpc.stub.StreamObserver;
import java.util.concurrent.CountDownLatch;
import org.ottersnail.soal.DiceRollResponse;
import org.ottersnail.soal.Event;
import org.ottersnail.soal.GameBoardStatus;

class StreamingDiceRollResponse implements StreamObserver<DiceRollResponse> {

  public final CountDownLatch countDownLatch;


  public StreamingDiceRollResponse(final CountDownLatch countDownLatch) {
    this.countDownLatch = countDownLatch;
  }

  @Override
  public void onNext(final DiceRollResponse response) {
    final GameBoardStatus gameBoardStatus = response.getGameBoardStatus();
    final Event event = gameBoardStatus.getEvent();
    System.out.println("Event:" + event.name());
    System.out.println("Player position: " + gameBoardStatus.getPosition());
  }

  @Override
  public void onError(final Throwable throwable) {
    throwable.printStackTrace();
    countDownLatch.countDown();
  }

  @Override
  public void onCompleted() {
    countDownLatch.countDown();
    System.out.println("Game complete!");
  }

}
