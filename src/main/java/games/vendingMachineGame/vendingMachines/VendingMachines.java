package games.vendingMachineGame.vendingMachines;

import difficulty.Difficulty;

abstract class VendingMachines {
	Difficulty difficulty = Difficulty.DIFFICULTY_NULL;
	
	VendingMachines(Difficulty difficulty) {
		this.difficulty = difficulty;
	}
	abstract double getRewards();           // probably should be a string
											// because you get items, not cash
	abstract double getCost();
//	abstract double getMinThresholdToWin();
//	abstract double getMaxThresholdToWin();
//	abstract double getChance();
//	abstract double getLuck();
}
