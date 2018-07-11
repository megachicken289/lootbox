package games.lootboxGame.abstractFactory;

import games.lootboxGame.lootBoxes.BoxDifficultyController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class BoxDifficultyControllerTest {
	private String diffLvl;
	private String expectedResults;
	private BoxDifficultyController bdc;
	
	@Before
	public void initialize() {
		// initialize class here
		bdc = new BoxDifficultyController(diffLvl);
	}
	
	// Each parameter should be placed as an argument here
	// Every time runner triggers, it will pass the arguments
	// from parameters we defined in primeNumbers() method
	
	public BoxDifficultyControllerTest(String diffLvl, String expectedResults) {
		this.diffLvl = diffLvl;
		this.expectedResults = expectedResults;
	}

	@Parameterized.Parameters
	public static Collection difficultyLevels() {
		return Arrays.asList(new Object[][] {
				{"SLUTATIA", "SLUTATIA"},
				{"VERY_EASY", "VERY_EASY"},
				{"EASY", "EASY"},
				{"MEDIUM", "MEDIUM"},
				{"HARD", "HARD"},
				{"LEGENDARY", "LEGENDARY"},
				{"I_WANT_MY_DADDY", "I_WANT_MY_DADDY"},
				{"BED_WETTER_DELIGHT", "BED_WETTER_DELIGHT"}
			
		});
	}
	
	@Test
	public void difficultyContollerTest() throws Exception {
		assertEquals(expectedResults,bdc.boxDifficultyLevelName());
	}
}
