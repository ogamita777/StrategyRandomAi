import structs.Key;

import commandcenter.CommandCenter;

/**
 * @author @ogamita777
 * 
 */
public class AiManager {
  public Ai ai;

  public AiManager(Ai ai) {
    this.ai = ai;
  }

  public void study() {
    ai.study();
  }

  public Key action(CommandCenter commandCenter, Key key) {
    return ai.action(commandCenter, key);
  }
}
