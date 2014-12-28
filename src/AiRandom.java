import java.util.Random;

import structs.Key;

import commandcenter.CommandCenter;

/**
 * @author @ogamita777 完全にランダムの入力を行うAI
 */
public class AiRandom implements Ai {

  Random rnd;

  public AiRandom() {
    rnd = new Random();
  }

  @Override
  public void study() {

  }

  @Override
  public Key action(CommandCenter commandCenter, Key key) {

    key.A = (rnd.nextInt(10) > 4) ? true : false;
    key.B = (rnd.nextInt(10) > 4) ? true : false;
    key.C = (rnd.nextInt(10) > 4) ? true : false;
    key.D = (rnd.nextInt(10) > 4) ? true : false;
    key.L = (rnd.nextInt(10) > 4) ? true : false;
    key.R = (rnd.nextInt(10) > 4) ? true : false;
    key.U = (rnd.nextInt(10) > 4) ? true : false;

    return key;
  }
}
