package games.lootboxGame.lootBoxes;

import difficulty.Difficulty;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Frank Borges XPTHQ on 6/13/2018.
 */
public class LeveledLootBoxTest {

	private LeveledLootBox lb_null = new LeveledLootBox(Difficulty.DIFFICULTY_NULL);
	private LeveledLootBox lb_slutatia = new LeveledLootBox((Difficulty.SLUTATIA));
	private LeveledLootBox lb_very_easy = new LeveledLootBox(Difficulty.VERY_EASY);
	private LeveledLootBox lb_very_easy_spot_check = new LeveledLootBox(Difficulty.valueOf("VERY_EASY"));
	private LeveledLootBox lb_easy = new LeveledLootBox(Difficulty.EASY);
	private LeveledLootBox lb_beginner = new LeveledLootBox(Difficulty.BEGINNER);
	private LeveledLootBox lb_medium = new LeveledLootBox(Difficulty.MEDIUM);
	private LeveledLootBox lb_hard = new LeveledLootBox(Difficulty.HARD);
	private LeveledLootBox lb_hard_spot_check = new LeveledLootBox(Difficulty.valueOf("HARD"));
	private LeveledLootBox lb_legendary = new LeveledLootBox(Difficulty.LEGENDARY);
	private LeveledLootBox lb_IWMD = new LeveledLootBox(Difficulty.I_WANT_MY_DADDY);
	private LeveledLootBox lb_hardest = new LeveledLootBox(Difficulty.BED_WETTER_DELIGHT);

	@Test
	public void rewardTest() {
		
		assertNotNull(lb_null.getRewards());
		assertEquals(   1*4, lb_slutatia.getRewards(),0);
		assertEquals(   2*4, lb_very_easy.getRewards(),0);
		assertEquals(   2*4, lb_very_easy_spot_check.getRewards(),0);
		assertEquals(  3*4, lb_easy.getRewards(),0);
		assertEquals(  4*4, lb_beginner.getRewards(),0);
		assertEquals(  -1*5*4, lb_medium.getRewards(),0);
		assertEquals( -1*6*4, lb_hard.getRewards(),0);
		assertEquals( -1*6*4, lb_hard_spot_check.getRewards(),0);
		assertEquals( -1*7*4, lb_legendary.getRewards(),0);
		assertEquals(-1*8*4, lb_IWMD.getRewards(),0);
		assertEquals( -1*9*4,lb_hardest.getRewards(),0);
		
	}
	
	@Test
	public void lootboxCostTest() {
		
		assertNotNull(lb_null.getCost());
		assertEquals(   1*8, lb_slutatia.getCost(),0);
		assertEquals(   2*8, lb_very_easy.getCost(),0);
		assertEquals(   2*8, lb_very_easy_spot_check.getCost(),0);
		assertEquals(  3*8, lb_easy.getCost(),0);
		assertEquals(  4*8, lb_beginner.getCost(),0);
		assertEquals(  -1*5*8, lb_medium.getCost(),0);
		assertEquals( -1*6*8, lb_hard.getCost(),0);
		assertEquals( -1*6*8, lb_hard_spot_check.getCost(),0);
		assertEquals( -1*7*8, lb_legendary.getCost(),0);
		assertEquals(-1*8*8, lb_IWMD.getCost(),0);
		assertEquals( -1*9*8,lb_hardest.getCost(),0);
		
	}
	@Test
	public void minThrsholdToWinTest() {
		
		assertNotNull(lb_null.getMinThresholdToWin());
		assertEquals(   1*2, lb_slutatia.getMinThresholdToWin(),0);
		assertEquals(   2*2, lb_very_easy.getMinThresholdToWin(),0);
		assertEquals(   2*2, lb_very_easy_spot_check.getMinThresholdToWin(),0);
		assertEquals(  3*2, lb_easy.getMinThresholdToWin(),0);
		assertEquals(  4*2, lb_beginner.getMinThresholdToWin(),0);
		assertEquals(  -1*5*2, lb_medium.getMinThresholdToWin(),0);
		assertEquals( -1*6*2, lb_hard.getMinThresholdToWin(),0);
		assertEquals( -1*6*2, lb_hard_spot_check.getMinThresholdToWin(),0);
		assertEquals( -1*7*2, lb_legendary.getMinThresholdToWin(),0);
		assertEquals(-1*8*2, lb_IWMD.getMinThresholdToWin(),0);
		assertEquals( -1*9*2,lb_hardest.getMinThresholdToWin(),0);
		
	}
	@Test
	public void maxThrsholdToWinTest() {
		
		assertNotNull(lb_null.getMaxThresholdToWin());
		assertEquals(   1*200, lb_slutatia.getMaxThresholdToWin(),0);
		assertEquals(   2*200, lb_very_easy.getMaxThresholdToWin(),0);
		assertEquals(   2*200, lb_very_easy_spot_check.getMaxThresholdToWin(),0);
		assertEquals(  3*200, lb_easy.getMaxThresholdToWin(),0);
		assertEquals(  4*200, lb_beginner.getMaxThresholdToWin(),0);
		assertEquals(  -1*5*200, lb_medium.getMaxThresholdToWin(),0);
		assertEquals( -1*6*200, lb_hard.getMaxThresholdToWin(),0);
		assertEquals( -1*6*200, lb_hard_spot_check.getMaxThresholdToWin(),0);
		assertEquals( -1*7*200, lb_legendary.getMaxThresholdToWin(),0);
		assertEquals(-1*8*200, lb_IWMD.getMaxThresholdToWin(),0);
		assertEquals( -1*9*200,lb_hardest.getMaxThresholdToWin(),0);
		
	}
	@Test
	public void chancecTest() {
		
		assertNotNull(lb_null.getChance());
		assertEquals(   1*0.1, lb_slutatia.getChance(),0);
		assertEquals(   2*0.1, lb_very_easy.getChance(),0);
		assertEquals(   2*0.1, lb_very_easy_spot_check.getChance(),0);
		assertEquals(  3*0.1, lb_easy.getChance(),0);
		assertEquals(  4*0.1, lb_beginner.getChance(),0);
		assertEquals(  -1*5*0.1, lb_medium.getChance(),0);
		assertEquals( -1*6*0.1, lb_hard.getChance(),0);
		assertEquals( -1*6*0.1, lb_hard_spot_check.getChance(),0);
		assertEquals( -1*7*0.1, lb_legendary.getChance(),0);
		assertEquals(-1*8*0.1, lb_IWMD.getChance(),0);
		assertEquals( -1*9*0.1,lb_hardest.getChance(),0);
		
	}
	@Test
	public void luckTest() {
		
		assertNotNull(lb_null.getLuck());
		assertEquals(   1*0.1, lb_slutatia.getLuck(),0);
		assertEquals(   2*0.1, lb_very_easy.getLuck(),0);
		assertEquals(   2*0.1, lb_very_easy_spot_check.getLuck(),0);
		assertEquals(  3*0.1, lb_easy.getLuck(),0);
		assertEquals(  4*0.1, lb_beginner.getLuck(),0);
		assertEquals(  -1*5*0.1, lb_medium.getLuck(),0);
		assertEquals( -1*6*0.1, lb_hard.getLuck(),0);
		assertEquals( -1*6*0.1, lb_hard_spot_check.getLuck(),0);
		assertEquals( -1*7*0.1, lb_legendary.getLuck(),0);
		assertEquals(-1*8*0.1, lb_IWMD.getLuck(),0);
		assertEquals( -1*9*0.1,lb_hardest.getLuck(),0);
		
	}
}