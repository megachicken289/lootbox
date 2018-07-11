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
		return 0;
	}
	
	@Override
	double getVendingCost() {
		return 0;
	}
}
