package se.ottersnail.saol.model.board;

import se.ottersnail.saol.controller.GameEngine;
import se.ottersnail.saol.controller.GameEvent;
import se.ottersnail.saol.db.GameState;
import se.ottersnail.saol.model.Player;
import se.ottersnail.saol.model.dice.ConsolePrinter;
import se.ottersnail.saol.model.dice.Dice;
import se.ottersnail.saol.model.dice.Dice.NotRolledDiceException;
import se.ottersnail.saol.model.dice.DicePrinter;

public class GameBoard {

  private final GameEngine gameEngine;
  private final ConsolePrinter dicePrinter;
  private final Dice dice;
  private final GameState gameState;

  public GameBoard(final GameEngine gameEngine, final Dice dice,
      final GameState gameState) {
    this.gameEngine = gameEngine;
    this.dicePrinter = new DicePrinter(dice);
    this.dice = dice;
    this.gameState = gameState;
  }

  public GameEvent rollDice(final Player player) throws NotRolledDiceException {
    final int diceValue = dice.roll();
    dicePrinter.print();

    final GameEvent gameEvent = gameEngine.playersNextState(player, diceValue);

    gameState.storePlayer(player.id,player);

    return gameEvent;

  }

  public Player getPlayerState(final int playerId) {
    return gameState.getPlayer(playerId);
  }

  public void resetBoard(final int playerId) {
    gameState.resetPlayer(playerId);
  }



}
