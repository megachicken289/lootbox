package games.lootboxGame.lootBoxes;

import difficulty.Difficulty;

/**
 * Created by Frank Borges XPTHQ on 6/11/2018.
 */

// TODO: Fix calculation logic
class LeveledLootBox extends LootBox {
	private String      levelName;
	private int         levelNumber;
	private final int   NORMAL_BREAKS_THE_TIE = 5;
	
	protected LeveledLootBox(Difficulty difficulty) {
		super(difficulty);
		
		this.levelName   = difficulty.getLevelName();
		this.levelNumber = difficulty.getLevelNumber();
	}

	protected String getLevelName(){
		return levelName;
	}

	protected int getLevelNumber() {
		return levelNumber;
	}
	
	protected double getRewards() {
		double rewardSize = levelNumber * 4;
		// adjust appropriately
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return rewardSize * -1;
		}
		return rewardSize;
	}
	
	protected double getCost() {
		double cost = levelNumber * 8;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return cost * -1;
		}
		return cost;
	}
	
	protected double getMinThresholdToWin() {
		double minThrshold = levelNumber * 2;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return minThrshold * -1;
		}
		return minThrshold;
	}
	
	protected double getMaxThresholdToWin() {
		double maxThreshold = levelNumber * 200;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return maxThreshold * -1;
		}
		return maxThreshold;
	}
	
	protected double getChance() {
		// chance goes against the player's luck
		// random number
		double chan = levelNumber * 0.1;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return chan * -1;
		}
		return chan;
	}
	
	protected double getLuck() {
		double lu = levelNumber * 0.1;
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return lu * -1;
		}
		return lu;
	}
}