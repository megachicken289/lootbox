package mainStart;

import lootBoxes.Difficulty;
import lootBoxes.LeveledLootBox;
import utils.StringUtils;
import utils.devUtils;

/**
 * Created by Frank Borges XPTHQ on 6/22/2018.
 */
public class Run {
	public void init() {
	
	}
	
	public void runTheLootBox() {
		devUtils du = new devUtils();
		StringUtils.getPlayerYNInput("Do you want to lootbox");
//		System.out.println("");
		
		String diffLvl = StringUtils.getPlayerInput("Which difficulty do you want");
		// get diff number
//		LeveledLootBox llb = new LeveledLootBox(Difficulty.valueOf(diffLvl));

//		LeveledLootBox lootBox = new LeveledLootBox(Difficulty.valueOf(diffLvl));
//		LeveledLootBox lootBox0 = new LeveledLootBox(Difficulty.SLUTATIA);
//		LeveledLootBox lootBox1 = new LeveledLootBox(Difficulty.VERY_EASY);
//		LeveledLootBox lootBox2 = new LeveledLootBox(Difficulty.EASY);
//		LeveledLootBox lootBox3 = new LeveledLootBox(Difficulty.BEGINNER);
//		LeveledLootBox lootBox4 = new LeveledLootBox(Difficulty.MEDIUM);
//		LeveledLootBox lootBox5 = new LeveledLootBox(Difficulty.HARD);
//		LeveledLootBox lootBox6 = new LeveledLootBox(Difficulty.LEGENDARY);
//		LeveledLootBox lootBox7 = new LeveledLootBox(Difficulty.I_WANT_MY_DADDY);
//		LeveledLootBox lootBox8 = new LeveledLootBox(Difficulty.BED_WETTER_DELIGHT);

//		llb.showDevConsole();
		du.showDevConsole2(Difficulty.valueOf(diffLvl));
//		lootBox.showDevConsole();
//		lootBox0.showDevConsole();
//		lootBox1.showDevConsole();
//		lootBox2.showDevConsole();
//		lootBox3.showDevConsole();
//		lootBox4.showDevConsole();
//		lootBox5.showDevConsole();
//		lootBox6.showDevConsole();
//		lootBox7.showDevConsole();
//		lootBox8.showDevConsole();
	}
}
