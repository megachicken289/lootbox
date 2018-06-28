package lootBoxes;

import utils.devUtils;

/**
 * Created by Frank Borges XPTHQ on 6/11/2018.
 */
public class LeveledLootBox extends LootBox {
	Difficulty  difficulty;
	String      levelName;
	int         levelNumber;
	final int   NORMAL_BREAKS_THE_TIE = 5;
	
	public LeveledLootBox(Difficulty difficulty) {
		super(difficulty);
		
		this.levelName   = difficulty.getLevelName();
		this.levelNumber = difficulty.getLevelNumber();
	}
	
	public double calcRewards() {
		double rewardSize = levelNumber * 4;
		// adjust appropriately
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return rewardSize * -1;
		}
		return rewardSize;
	}
	
	public double calcLootBoxCost() {
		double cost = levelNumber * 8;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return cost * -1;
		}
		return cost;
	}
	
	public double calcMinThresholdToWin() {
		double minThrshold = levelNumber * 2;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return minThrshold * -1;
		}
		return minThrshold;
	}
	
	public double calcMaxThresholdToWin() {
		double maxThreshold = levelNumber * 200;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return maxThreshold * -1;
		}
		return maxThreshold;
	}
	
	public double calcChance() {
		double chan = levelNumber * 0.1;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return chan * -1;
		}
		return chan;
	}
	
	public double calcLuck() {
		double lu = levelNumber * 0.1;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return lu * -1;
		}
		return lu;
	}
	
	@Override
	public void showDevConsole() {
		devUtils du = new devUtils();
		du.showDevConsole(difficulty);
	}
	
	@Override
	public void showDevConsole2() {
		devUtils du = new devUtils();
		du.showDevConsole2(difficulty);
	}
	
	public void define() {
	
	}
	
	public void play() {
	
	}
}