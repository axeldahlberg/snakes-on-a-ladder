package se.ottersnail.saol.db;

import se.ottersnail.saol.model.Player;

public interface GameState {

  Player getPlayer(final int playerId);
  void storePlayer(final int playerId, final Player player);
  void resetPlayer(final int playerId);
}
