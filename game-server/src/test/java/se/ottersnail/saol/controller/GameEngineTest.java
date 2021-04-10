package se.ottersnail.saol.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.ottersnail.saol.controller.GameEvent.Event;
import se.ottersnail.saol.model.Player;
import se.ottersnail.saol.model.board.BoardTransport;

class GameEngineTest {
  private GameEngine gameEngine;
  private Player player;

  @BeforeEach
  void setUp() {
     gameEngine = new GameEngine();
     player = new Player(1);
  }

  @Test
  public void noLoopsInGame(){
    boolean noLoopingBoardTransports = true;
    for (final Entry<Integer, BoardTransport> entry : GameEngine.getGameMap().entrySet()) {
      final BoardTransport transport = entry.getValue();
      final BoardTransport boardTransport = GameEngine.getGameMap().get(transport.getTo());
      if(boardTransport != null) {
        noLoopingBoardTransports = false;
      }
    }
    assertTrue(noLoopingBoardTransports);
  }

  @Test
  void testLadderMove38() {
    final GameEvent gameEvent = gameEngine.playersNextState(player, 1);
    assertEquals(38,gameEvent.getPosition(), "Move to 38");
    assertEquals(Event.LADDER,gameEvent.getEvent(),"Player stepped on Ladder");
  }

  @Test
  void testLadderMove72() {
    player.setPosition(70);
    final GameEvent gameEvent = gameEngine.playersNextState(player, 1);
    assertEquals(92,gameEvent.getPosition());
    assertEquals(Event.LADDER,gameEvent.getEvent());
  }

  @Test
  void testWin() {
    final int position = player.setPosition(99);
    final GameEvent gameEvent = gameEngine.playersNextState(player,1);
    assertEquals(99,position);
    assertEquals(Event.WIN, gameEvent.getEvent());
  }

  @Test
  void testOverflow() {
    final int position = player.setPosition(99);
    final GameEvent gameEvent = gameEngine.playersNextState(player,2);

    assertEquals(99,position);
    assertEquals(Event.MOVE, gameEvent.getEvent());
  }

  @Test
  void testOverflowAndSnake() {
    final int position = player.setPosition(99);
    final GameEvent gameEvent = gameEngine.playersNextState(player,4);

    assertEquals(78,player.getCurrentPosition(),"Snake moved 97 -> 78");
    assertEquals(Event.SNAKE, gameEvent.getEvent());
  }

  @Test
  void testSnakeMove() {
    player.setPosition(35);
    final GameEvent gameEvent = gameEngine.playersNextState(player, 1);
    assertEquals(Event.SNAKE,gameEvent.getEvent());
    assertEquals(player.getCurrentPosition(),6);

  }


}