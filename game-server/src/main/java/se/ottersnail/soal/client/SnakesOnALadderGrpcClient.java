package se.ottersnail.soal.client;

import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import org.ottersnail.soal.DiceRollRequest;
import org.ottersnail.soal.SnakesOnALadderGameServiceGrpc;
import org.ottersnail.soal.SnakesOnALadderGameServiceGrpc.SnakesOnALadderGameServiceStub;

public class SnakesOnALadderGrpcClient {

  private static final SnakesOnALadderGameServiceStub asyncBlockingStub = SnakesOnALadderGameServiceGrpc
      .newStub(ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build());
  private static final Random random = new Random();





  public static void main(final String[] args) throws InterruptedException {
    final int playerNumber = random.nextInt();
    System.out.println("Starting client!" + playerNumber);
    final DiceRollRequest diceRollRequest = DiceRollRequest.newBuilder().setPlayerNumber(playerNumber).build();

    final CountDownLatch countDownLatch = new CountDownLatch(1);

    Runtime.getRuntime().addShutdownHook(new Thread(countDownLatch::countDown));

    final StreamingDiceRollResponse streamingDiceRollResponse = new StreamingDiceRollResponse(
        countDownLatch);

    final StreamObserver<DiceRollRequest> diceRollRequestStreamObserver = asyncBlockingStub
        .rollDice(streamingDiceRollResponse);

    while(countDownLatch.getCount() > 0) {
      try {
        Thread.sleep(100);

      } catch (final InterruptedException e) {
        e.printStackTrace();
      }
      diceRollRequestStreamObserver.onNext(diceRollRequest);
    }
    diceRollRequestStreamObserver.onCompleted();
  }

}
