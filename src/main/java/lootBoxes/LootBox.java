package lootBoxes;

/**
 * Created by Frank Borges XPTHQ on 6/11/2018.
 */
abstract class LootBox {
	Difficulty difficulty = Difficulty.DIFFICULTY_NULL;
	
	LootBox(Difficulty difficulty) {
		
		this.difficulty = difficulty;
	}
	abstract public double calcRewards();
	abstract public double calcLootBoxCost();
	abstract public double calcMinThresholdToWin();
	abstract public double calcMaxThresholdToWin();
	abstract public double calcChance();
	abstract public double calcLuck();
	
	abstract public void showDevConsole();
	abstract public void define();
	abstract public void play();
	
	public abstract void showDevConsole2();
}