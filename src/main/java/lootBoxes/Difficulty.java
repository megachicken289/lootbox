package lootBoxes;

/**
 * Created by Frank Borges XPTHQ on 6/11/2018.
 */
public enum Difficulty {
	DIFFICULTY_NULL(    "NULL",                 0),  //,0.00, 0.00,  0.00,   0.00, 0.00, 0.00),    //  null
	SLUTATIA(           "SLUTATIA",             1),  //,2.00, 0.05,  1.00,  10.00, 2.00, 2.00),    //   ^
	VERY_EASY(          "VERY_EASY",            2),  //,1.25, 0.25,  5.00,  25.00, 1.75, 1.75),    //   |
	EASY(               "EASY",                 3),  //,1.50, 0.50, 10.00,  50.00, 1.50, 1.50),    // easier
	BEGINNER(           "BEGINNER",             4),  //,1.75, 0.75, 15.00,  75.00, 1.25, 1.25),    //   |
	MEDIUM(             "MEDIUM",               5),  //,1.00, 1.00, 20.00, 100.00, 1.00, 1.00),    // neutral
	HARD(               "HARD",                 6),  //,0.75, 1.25, 25.00, 125.00, 0.75, 0.75),    //   |
	LEGENDARY(          "LEGENDARY",            7),  //,0.50, 1.50, 30.00, 150.00, 0.50, 0.50),    // harder
	I_WANT_MY_DADDY(    "I_WANT_MY_DADDY",      8),  //,0.25, 1.75, 35.00, 175.00, 0.25, 0.25),    //   |
	BED_WETTER_DELIGHT( "BED WETTER DELIGHT",   9);  //,0.05, 2.00, 40.00, 200.00, 0.05, 0.05);    //   v
	
	private final String levelName;
	private final int levelNumber;
	
	Difficulty() {
		this.levelName = getLevelName();
		this.levelNumber = getLevelNumber();
	}
	
	Difficulty(String levelName, int levelNumber) {
		this.levelName = levelName;
		this.levelNumber = levelNumber;
	}
	
	public String getLevelName() {
		return String.valueOf(Difficulty.valueOf(levelName));
	}
	
	public int getLevelNumber() {
		return this.levelNumber;
	}
}
