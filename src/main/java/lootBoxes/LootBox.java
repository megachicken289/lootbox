package lootBoxes;

/**
 * Created by Frank Borges XPTHQ on 6/11/2018.
 */
abstract class LootBox {
	Difficulty difficulty = Difficulty.DIFFICULTY_NULL;
	
	LootBox(Difficulty difficulty) {
		
		this.difficulty = difficulty;
	}
	abstract public double getRewards();
	abstract public double getLootBoxCost();
	abstract public double getMinThresholdToWin();
	abstract public double getMaxThresholdToWin();
	abstract public double getChance();
	abstract public double getLuck();
}