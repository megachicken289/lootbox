package games.vendingMachineGame.vendingMachines;

import difficulty.Difficulty;
import games.vendingMachineGame.abstractFactory.VendingMachineImpl;

public class VendingMachineDifficultyController implements VendingMachineImpl {
	private String difficultyLevelName;
	private LeveledVendingMachine lvm;
	
	public VendingMachineDifficultyController(String difficultyLevelName) {
		this.difficultyLevelName = difficultyLevelName;
		lvm = new LeveledVendingMachine(Difficulty.valueOf(difficultyLevelName));
	}
	
	public String getDifficultyLevelName() { return difficultyLevelName; }
	
	
	@Override
	public void buildVendingMachine() {
		lvm.getLevelName();
		lvm.getLevelNumber();
		lvm.getRewards();
		lvm.getCost();
	}
	
	@Override
	public void showStats() {
	
	}
	
	@Override
	public void showHiddenStats() {
	
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
