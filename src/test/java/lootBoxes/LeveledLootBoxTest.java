package lootBoxes;

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
		
		assertNotNull(lb_null.calcRewards());
		assertEquals(   1*4, lb_slutatia.calcRewards(),0);
		assertEquals(   2*4, lb_very_easy.calcRewards(),0);
		assertEquals(   2*4, lb_very_easy_spot_check.calcRewards(),0);
		assertEquals(  3*4, lb_easy.calcRewards(),0);
		assertEquals(  4*4, lb_beginner.calcRewards(),0);
		assertEquals(  -1*5*4, lb_medium.calcRewards(),0);
		assertEquals( -1*6*4, lb_hard.calcRewards(),0);
		assertEquals( -1*6*4, lb_hard_spot_check.calcRewards(),0);
		assertEquals( -1*7*4, lb_legendary.calcRewards(),0);
		assertEquals(-1*8*4, lb_IWMD.calcRewards(),0);
		assertEquals( -1*9*4,lb_hardest.calcRewards(),0);
		
	}
	
	@Test
	public void lootboxCostTest() {
		
		assertNotNull(lb_null.calcLootBoxCost());
		assertEquals(   1*8, lb_slutatia.calcLootBoxCost(),0);
		assertEquals(   2*8, lb_very_easy.calcLootBoxCost(),0);
		assertEquals(   2*8, lb_very_easy_spot_check.calcLootBoxCost(),0);
		assertEquals(  3*8, lb_easy.calcLootBoxCost(),0);
		assertEquals(  4*8, lb_beginner.calcLootBoxCost(),0);
		assertEquals(  -1*5*8, lb_medium.calcLootBoxCost(),0);
		assertEquals( -1*6*8, lb_hard.calcLootBoxCost(),0);
		assertEquals( -1*6*8, lb_hard_spot_check.calcLootBoxCost(),0);
		assertEquals( -1*7*8, lb_legendary.calcLootBoxCost(),0);
		assertEquals(-1*8*8, lb_IWMD.calcLootBoxCost(),0);
		assertEquals( -1*9*8,lb_hardest.calcLootBoxCost(),0);
		
	}
	@Test
	public void minThrsholdToWinTest() {
		
		assertNotNull(lb_null.calcMinThresholdToWin());
		assertEquals(   1*2, lb_slutatia.calcMinThresholdToWin(),0);
		assertEquals(   2*2, lb_very_easy.calcMinThresholdToWin(),0);
		assertEquals(   2*2, lb_very_easy_spot_check.calcMinThresholdToWin(),0);
		assertEquals(  3*2, lb_easy.calcMinThresholdToWin(),0);
		assertEquals(  4*2, lb_beginner.calcMinThresholdToWin(),0);
		assertEquals(  -1*5*2, lb_medium.calcMinThresholdToWin(),0);
		assertEquals( -1*6*2, lb_hard.calcMinThresholdToWin(),0);
		assertEquals( -1*6*2, lb_hard_spot_check.calcMinThresholdToWin(),0);
		assertEquals( -1*7*2, lb_legendary.calcMinThresholdToWin(),0);
		assertEquals(-1*8*2, lb_IWMD.calcMinThresholdToWin(),0);
		assertEquals( -1*9*2,lb_hardest.calcMinThresholdToWin(),0);
		
	}
	@Test
	public void maxThrsholdToWinTest() {
		
		assertNotNull(lb_null.calcMaxThresholdToWin());
		assertEquals(   1*200, lb_slutatia.calcMaxThresholdToWin(),0);
		assertEquals(   2*200, lb_very_easy.calcMaxThresholdToWin(),0);
		assertEquals(   2*200, lb_very_easy_spot_check.calcMaxThresholdToWin(),0);
		assertEquals(  3*200, lb_easy.calcMaxThresholdToWin(),0);
		assertEquals(  4*200, lb_beginner.calcMaxThresholdToWin(),0);
		assertEquals(  -1*5*200, lb_medium.calcMaxThresholdToWin(),0);
		assertEquals( -1*6*200, lb_hard.calcMaxThresholdToWin(),0);
		assertEquals( -1*6*200, lb_hard_spot_check.calcMaxThresholdToWin(),0);
		assertEquals( -1*7*200, lb_legendary.calcMaxThresholdToWin(),0);
		assertEquals(-1*8*200, lb_IWMD.calcMaxThresholdToWin(),0);
		assertEquals( -1*9*200,lb_hardest.calcMaxThresholdToWin(),0);
		
	}
	@Test
	public void chancecTest() {
		
		assertNotNull(lb_null.calcChance());
		assertEquals(   1*0.1, lb_slutatia.calcChance(),0);
		assertEquals(   2*0.1, lb_very_easy.calcChance(),0);
		assertEquals(   2*0.1, lb_very_easy_spot_check.calcChance(),0);
		assertEquals(  3*0.1, lb_easy.calcChance(),0);
		assertEquals(  4*0.1, lb_beginner.calcChance(),0);
		assertEquals(  -1*5*0.1, lb_medium.calcChance(),0);
		assertEquals( -1*6*0.1, lb_hard.calcChance(),0);
		assertEquals( -1*6*0.1, lb_hard_spot_check.calcChance(),0);
		assertEquals( -1*7*0.1, lb_legendary.calcChance(),0);
		assertEquals(-1*8*0.1, lb_IWMD.calcChance(),0);
		assertEquals( -1*9*0.1,lb_hardest.calcChance(),0);
		
	}
	@Test
	public void luckTest() {
		
		assertNotNull(lb_null.calcLuck());
		assertEquals(   1*0.1, lb_slutatia.calcLuck(),0);
		assertEquals(   2*0.1, lb_very_easy.calcLuck(),0);
		assertEquals(   2*0.1, lb_very_easy_spot_check.calcLuck(),0);
		assertEquals(  3*0.1, lb_easy.calcLuck(),0);
		assertEquals(  4*0.1, lb_beginner.calcLuck(),0);
		assertEquals(  -1*5*0.1, lb_medium.calcLuck(),0);
		assertEquals( -1*6*0.1, lb_hard.calcLuck(),0);
		assertEquals( -1*6*0.1, lb_hard_spot_check.calcLuck(),0);
		assertEquals( -1*7*0.1, lb_legendary.calcLuck(),0);
		assertEquals(-1*8*0.1, lb_IWMD.calcLuck(),0);
		assertEquals( -1*9*0.1,lb_hardest.calcLuck(),0);
		
	}
}