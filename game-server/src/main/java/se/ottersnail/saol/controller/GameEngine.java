package se.ottersnail.saol.controller;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import se.ottersnail.saol.controller.GameEvent.Event;
import se.ottersnail.saol.model.Player;
import se.ottersnail.saol.model.board.BoardTransport;
import se.ottersnail.saol.model.board.Ladder;
import se.ottersnail.saol.model.board.Snake;

public class GameEngine {

  private static final ImmutableMap<Integer, BoardTransport> snakesAndLadders = ImmutableMap.copyOf(fillSnakesAndLadders());

  private static Map<Integer, BoardTransport> fillSnakesAndLadders() {
    final Map<Integer, BoardTransport> map = new HashMap<>();
    map.put(1,new Ladder(1,38));
    map.put(4,new Ladder(4,14));
    map.put(8,new Ladder(8,30));
    map.put(21,new Ladder(21,42));
    map.put(28,new Ladder(28,74));
    map.put(50,new Ladder(50,67));
    map.put(71,new Ladder(71,92));
    map.put(32,new Snake(32,10));
    map.put(36,new Snake(36,6));
    map.put(48,new Snake(48,26));
    map.put(62,new Snake(62,18));
    map.put(88,new Snake(88,24));
    map.put(95,new Snake(95,56));
    map.put(97,new Snake(97,78));
    return map;
  }

  public static ImmutableMap<Integer,BoardTransport> getGameMap() {
    return snakesAndLadders;
  }

  // set the players new position from dice value
  // calculate event MOVE,SNAKE,LADDER,WIN,LOOSE

  private static final int WIN_POSITION = 100;

  public GameEvent playersNextState(final Player player, final int diceThrowValue) {

    // calculate postion
    final int currentPlayerPosition = player.getCurrentPosition();
    // what will be the next position if okey
    final int nextCalculatedPlayerPosition = currentPlayerPosition + diceThrowValue;

    // just win
    if(nextCalculatedPlayerPosition == WIN_POSITION) {
      return new GameEvent(diceThrowValue,WIN_POSITION,Event.WIN);
    }

    final boolean lessThenHundred = currentPlayerPosition+diceThrowValue < WIN_POSITION;
    final boolean moreThenHundred = currentPlayerPosition+diceThrowValue > WIN_POSITION;

    final BoardTransport boardTransport = GameEngine.getGameMap().get(nextCalculatedPlayerPosition);

    if(moreThenHundred) {
      final int overflowSteps = nextCalculatedPlayerPosition - WIN_POSITION;

      final int newPostion = WIN_POSITION - overflowSteps;
      player.setPosition(newPostion);

      final BoardTransport overflowBoardTransport = GameEngine.getGameMap().get(newPostion);

      return overflowBoardTransport == null ? new GameEvent(diceThrowValue,newPostion,Event.MOVE) :
          useBoardTransport(diceThrowValue,player,overflowBoardTransport);
    }

    player.setPosition(nextCalculatedPlayerPosition);

    if(boardTransport != null) {
      return useBoardTransport(diceThrowValue,player,boardTransport);
    }

    return new GameEvent(diceThrowValue,nextCalculatedPlayerPosition,Event.MOVE);
  }

  private GameEvent useBoardTransport(final int diceThrowValue,final Player player, final BoardTransport boardTransport) {
    final int to = boardTransport.getTo();
    if(boardTransport instanceof Ladder) {
      player.setPosition(to);
      return new GameEvent(diceThrowValue,to, Event.LADDER);
    } else {
      player.setPosition(to);
      return new GameEvent(diceThrowValue,to,Event.SNAKE);
    }

  }

}
