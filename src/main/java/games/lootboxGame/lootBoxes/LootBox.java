package games.lootboxGame.lootBoxes;

import difficulty.Difficulty;

/**
 * Created by Frank Borges XPTHQ on 6/11/2018.
 */
abstract class LootBox {
	Difficulty difficulty = Difficulty.DIFFICULTY_NULL;

	LootBox(Difficulty difficulty) {

		this.difficulty = difficulty;
	}
	abstract double getRewards();
	abstract double getLootBoxCost();
	abstract double getMinThresholdToWin();
	abstract double getMaxThresholdToWin();
	abstract double getChance();
	abstract double getLuck();
}