package utils;

import static java.util.Arrays.asList;

import lootBoxes.Difficulty;
import lootBoxes.DifficultyController;
import lootBoxes.LeveledLootBox;

/**
 * Created by Frank Borges XPTHQ on 6/11/2018.
 */
public class devUtils {
	public void showDevConsole(Difficulty difficulty) {
		System.out.printf(
				"DEV_CONSOLE%n" +
				"================%n" +
				"Difficulty: %s%n",
//						+
//				"Reward: %.2f%n" +
//				"calcLootBoxCost: %.2f%n" +
//				"calcMinThresholdToWin: %.4f%n" +
//				"calcMaxThresholdToWin: %.4f%n" +
//				"Chance: %d%n" +
//				"Luck: %.2f%n%n",
				difficulty.getLevelName()
//				,reward,
//				lootBoxCost,
//				calcMinThresholdToWin,
//				calcMaxThresholdToWin,
//				calcChance,calcLuck
		);
	}
	
	public void showDevConsoleAll() {
	}
	
	public void showDevConsole2(Difficulty difficulty) {
		System.out.println( "DEV_CONSOLE\n" +
							"================");
		System.out.println("[" + difficulty.getLevelNumber() + "] "
				+ difficulty.getLevelName());
	}
}
