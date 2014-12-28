import gameInterface.AIInterface;

import java.util.Random;

import structs.FrameData;
import structs.GameData;
import structs.Key;
import commandcenter.CommandCenter;

/**
 * @author @ogamita777
 * Strategyパターンを使って実装したAI <br>
 * 完全にランダムの入力を行う
 */
public class StrategyRandomAi implements AIInterface {

  /** AIを管理するクラス */
  public AiManager aiManager;

  /** 入力されるキー */
  Key key;

  /** コマンドを管理する。ほとんどの情報はここに入っている */
  CommandCenter commandCenter;

  boolean playerNumber;
  GameData gameData;
  FrameData frameData;
  Random rnd;

  @Override
  public void close() {}

  @Override
  public String getCharacter() {
    return CHARACTER_GARNET;
  }

  @Override
  public void getInformation(FrameData frameData) {
    this.frameData = frameData;
    this.commandCenter.setFrameData(this.frameData, playerNumber);
  }

  @Override
  public int initialize(GameData gameData, boolean playerNumber) {
    this.aiManager = new AiManager(new AiRandom());
    this.key = new Key();
    this.rnd = new Random();
    this.playerNumber = playerNumber;
    this.commandCenter = new CommandCenter();
    this.gameData = gameData;

    return 0;
  }

  @Override
  public Key input() {
    return key;
  }

  @Override
  public void processing() {
    if (canProcessing()) {
      key = aiManager.action(commandCenter, key);
    }
  }

  public boolean canProcessing() {
    return !frameData.getEmptyFlag() && frameData.getRemainingTime() > 0;
  }
}
