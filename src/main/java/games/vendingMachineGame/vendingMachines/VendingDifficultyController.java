package games.vendingMachineGame.vendingMachines;

import difficulty.Difficulty;
import games.vendingMachineGame.abstractFactory.VendingMachineImpl;

public class VendingDifficultyController implements VendingMachineImpl{
	private String difficultyLevelName;
	private LeveledVendingMachine lvm;
	
	public VendingDifficultyController(String difficultyLevelName) {
		this.difficultyLevelName = difficultyLevelName;
		lvm = new LeveledVendingMachine(Difficulty.valueOf(difficultyLevelName));
	}
	
	public String getDifficultyLevelName() {
		return difficultyLevelName;
	}
	
	
	@Override
	public void buildVendingMachine() {
		lvm.getLevelName();
		lvm.getRewards();
		lvm.getCost();
		
	}
	
	@Override
	public void showStats() {
		
		System.out.printf("" +
						"Stats: %8s%n" +
						"=====================%n" +
						"REWARDS($):  %8.2f%n" +
						"COST($):     %8.2f%n",
//						"LUCK:        %8.2f%n%n",
				lvm.getLevelName(),
				lvm.getRewards(),
				lvm.getCost());
//				lvm.getLuck());
	}
	
	@Override
	public void showHiddenStats() {
		
		System.out.printf("" +
						"Stats: %8s%n" +
						"=====================%n" +
						"REWARDS($):     %8.2f%n" +
						"COST($):        %8.2f%n",
//						"MINTHRESHOLD($):%8.2f%n" +
//						"MAXTHRESHOLD($):%8.2f%n" +
//						"CHANCE:          %8.2f%n" +
//						"LUCK:            %8.2f%n%n",
				lvm.getLevelName(),
				lvm.getRewards() ,
				lvm.getCost()/*,
				lvm.getMinThresholdToWin(),
				lvm.getMaxThresholdToWin(),
				lvm.getChance(),
				lvm.getLuck()*/);
	}
	
	@Override
	public String vendingMachineDifficultyName() {
		return lvm.getLevelName();
	}
	
	@Override
	public double vendingMachineReward() {
		return lvm.getRewards();
	}
	
	@Override
	public double vendingMachineCost() {
		return lvm.getCost();
	}
}
