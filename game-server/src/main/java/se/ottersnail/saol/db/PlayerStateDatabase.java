package se.ottersnail.saol.db;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import se.ottersnail.saol.model.Player;

public class PlayerStateDatabase implements GameState {

  private static final Map<Integer,Player> map = new ConcurrentHashMap<>();

  @Override
  public Player getPlayer(final int playerId) {
    return map.getOrDefault(playerId,new Player(playerId));
  }

  @Override
  public void storePlayer(final int playerId,final Player player) {
    map.put(playerId,player);
  }

  @Override
  public void resetPlayer(final int playerId) {
    map.remove(playerId);
  }

  public void debugDatabase() {
    System.out.println(map);
  }
}
