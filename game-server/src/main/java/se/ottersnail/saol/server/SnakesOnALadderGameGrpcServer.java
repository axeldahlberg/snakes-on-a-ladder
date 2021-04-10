package se.ottersnail.saol.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import se.ottersnail.saol.controller.GameEngine;
import se.ottersnail.saol.db.GameState;
import se.ottersnail.saol.db.PlayerStateDatabase;
import se.ottersnail.saol.model.board.GameBoard;
import se.ottersnail.saol.model.dice.Dice;
import se.ottersnail.saol.service.SnakesOnALadderGameService;

public class SnakesOnALadderGameGrpcServer {

  public static void main(final String[] args) throws InterruptedException, IOException {

    final GameState playerStateDatabase = new PlayerStateDatabase();

    final Server server = ServerBuilder.forPort(6565)
        .addService(new SnakesOnALadderGameService(new GameBoard(new GameEngine(), new Dice(),playerStateDatabase)))
        .build();

    System.out.println("Starting server!");
    server.start();

    Runtime.getRuntime().addShutdownHook(new Thread(
        server::shutdown
    ));

    server.awaitTermination();
    System.out.println("Stopped server!");
  }

}
