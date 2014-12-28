import structs.Key;

import commandcenter.CommandCenter;

/**
 * @author @ogamita777
 *
 */
public interface Ai {
  public void study();

  public Key action(CommandCenter commandCenter, Key key);
}
