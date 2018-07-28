package games.vendingMachineGame.vendingMachines;

import difficulty.Difficulty;

class LeveledVendingMachine extends VendingMachines {
	private String  levelName;
	private int     levelNumber;
	private final int NORMAL_BREAKS_THE_TIE = 5;
	
	protected LeveledVendingMachine(Difficulty difficulty) {
		super(difficulty);
		
		this.levelName = difficulty.getLevelName();
		this.levelNumber = difficulty.getLevelNumber();
	}
	
	protected String getLevelName() {
		return levelName;
	}
	
	protected int getLevelNumber() {
		return levelNumber;
	}
	
	
	
	@Override
	double getRewards() {
		// TODO: ADD/IMPLEMENT 3x3 array
		double reward = levelNumber * 4;
		// adjust appropriately
		if (levelNumber >= NORMAL_BREAKS_THE_TIE) {
			return reward * -1;
		}
		return reward;
	}
	
	@Override
	double getCost() {
		return 0;
	}
}
