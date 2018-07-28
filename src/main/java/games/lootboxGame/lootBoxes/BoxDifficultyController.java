package games.lootboxGame.lootBoxes;

import difficulty.Difficulty;
import games.lootboxGame.abstractFactory.BoxImpl;

public class BoxDifficultyController implements BoxImpl {
	private String difficultyLevelName;
	private LeveledLootBox llb;
	
	public BoxDifficultyController(String difficultyLevelName) {
		this.difficultyLevelName = difficultyLevelName;
		llb = new LeveledLootBox(Difficulty.valueOf(difficultyLevelName));
	}
	
	public String getDifficultyLevelName() {
		return difficultyLevelName;
	}
	
	@Override
	public void buildBox() {
		llb.getLevelName();
		llb.getRewards();
		llb.getCost();
		llb.getMinThresholdToWin();
		llb.getMaxThresholdToWin();
		llb.getChance();
		llb.getLuck();
	}
	
	@Override
	public void showStats() {
		
		System.out.printf("" +
		                  "Stats: %8s%n" +
		                  "=====================%n" +
		                  "REWARDS($):  %8.2f%n" +
		                  "COST($):     %8.2f%n" +
		                  "LUCK:        %8.2f%n%n",
		                  llb.getLevelName(),
		                  llb.getRewards(),
		                  llb.getCost(),
		                  llb.getLuck());
	}
	
	@Override
	public void showHiddenStats() {
		
		System.out.printf("" +
		                  "Stats: %8s%n" +
		                  "=====================%n" +
		                  "REWARDS($):     %8.2f%n" +
		                  "COST($):        %8.2f%n" +
		                  "MINTHRESHOLD($):%8.2f%n" +
		                  "MAXTHRESHOLD($):%8.2f%n" +
		                  "CHANCE:          %8.2f%n" +
		                  "LUCK:            %8.2f%n%n",
		                  llb.getLevelName(),
		                  llb.getRewards(),
		                  llb.getCost(),
		                  llb.getMinThresholdToWin(),
		                  llb.getMaxThresholdToWin(),
		                  llb.getChance(),
		                  llb.getLuck());
	}
	
	@Override
	public String boxDifficultyLevelName() {
		return llb.getLevelName();
	}
	
	@Override
	public double boxReward() {
		return llb.getRewards();
	}
	
	@Override
	public double boxCost() {
		return llb.getCost();
	}
	
	@Override
	public double boxMinThreshold() {
		return llb.getMinThresholdToWin();
	}
	
	@Override
	public double boxMaxThreshold() {
		return llb.getMaxThresholdToWin();
	}
	
	@Override
	public double boxChance() {
		return llb.getChance();
	}
	
	@Override
	public double boxLuck() {
		return llb.getLuck();
	}
}
