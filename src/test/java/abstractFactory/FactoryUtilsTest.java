package abstractFactory;

import lootBoxes.Difficulty;
import lootBoxes.LeveledLootBox;
import org.junit.Test;

public class FactoryUtilsTest {
//	BoxMock boxMock = new BoxMock();
	FactoryUtils fu;
	BoxFactory boxFactory;
	BoxImpl box;
	LeveledLootBox llbSLUT;
	LeveledLootBox llbSlut;
	LeveledLootBox llbVEasy;
	LeveledLootBox llbEasy;
	LeveledLootBox llbBeginner;
	LeveledLootBox llbMedium;
	LeveledLootBox llbHard;
	LeveledLootBox llbLegendary;
	LeveledLootBox llbIWMD;
	LeveledLootBox llbBWD;
	
	@Test
	public void setup() throws Exception {
//		BoxMock
	}
	
	@Test
	public void testBoxBuilder() throws Exception {
	}
	
	@Test
	public void testBoxStats() throws Exception {
		System.out.println(boxFactory.getBox(Difficulty.SLUTATIA));
	}
}
