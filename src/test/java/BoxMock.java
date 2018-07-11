import games.lootboxGame.lootBoxes.BoxDifficultyController;
import games.lootboxGame.abstractFactory.BoxFactory;
import games.lootboxGame.abstractFactory.BoxImpl;
import difficulty.Difficulty;

public class BoxMock {
	private BoxDifficultyController bdc;
	private BoxFactory boxFactory;
	private BoxImpl boxSlutatia;
	private BoxImpl boxVEasy;
	private BoxImpl boxEasy;
	private BoxImpl boxBeginner;
	private BoxImpl boxMedium;
	private BoxImpl boxHard;
	private BoxImpl boxLegendary;
	private BoxImpl boxIWD;
	private BoxImpl boxBWD;
	
	protected BoxMock() {
		BoxImpl boxSlutatia0 = new BoxDifficultyController("SLUTATIA");
		BoxImpl boxSlutatia = boxFactory.getBox(Difficulty.SLUTATIA);
		BoxImpl boxVEasy = boxFactory.getBox(Difficulty.VERY_EASY);
		BoxImpl boxEasy = boxFactory.getBox(Difficulty.EASY);
		BoxImpl boxBeginner = boxFactory.getBox(Difficulty.BEGINNER);
		BoxImpl boxMedium = boxFactory.getBox(Difficulty.MEDIUM);
		BoxImpl boxHard = boxFactory.getBox(Difficulty.HARD);
		BoxImpl boxLegendary = boxFactory.getBox(Difficulty.LEGENDARY);
		BoxImpl boxIWD = boxFactory.getBox(Difficulty.I_WANT_MY_DADDY);
		BoxImpl boxBWD = boxFactory.getBox(Difficulty.BED_WETTER_DELIGHT);
		
	}
}
