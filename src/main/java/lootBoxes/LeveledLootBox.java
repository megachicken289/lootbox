package lootBoxes;

import utils.DevUtils;

/**
 * Created by Frank Borges XPTHQ on 6/11/2018.
 */

// TODO: Fix calculation logic
public class LeveledLootBox extends LootBox {
	private String      levelName;
	private int         levelNumber;
	private final int   NORMAL_BREAKS_THE_TIE = 5;
	
	public LeveledLootBox(Difficulty difficulty) {
		super(difficulty);
		
		this.levelName   = difficulty.getLevelName();
		this.levelNumber = difficulty.getLevelNumber();
	}

	public String getLevelName(){
		return levelName;
	}

	public int getLevelNumber() {
		return levelNumber;
	}
	
	public double getRewards() {
		double rewardSize = levelNumber * 4;
		// adjust appropriately
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return rewardSize * -1;
		}
		return rewardSize;
	}
	
	public double getLootBoxCost() {
		double cost = levelNumber * 8;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return cost * -1;
		}
		return cost;
	}
	
	public double getMinThresholdToWin() {
		double minThrshold = levelNumber * 2;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return minThrshold * -1;
		}
		return minThrshold;
	}
	
	public double getMaxThresholdToWin() {
		double maxThreshold = levelNumber * 200;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return maxThreshold * -1;
		}
		return maxThreshold;
	}
	
	public double getChance() {
		// chance goes against the player's luck
		// random number
		double chan = levelNumber * 0.1;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return chan * -1;
		}
		return chan;
	}
	
	public double getLuck() {
		double lu = levelNumber * 0.1;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return lu * -1;
		}
		return lu;
	}
}