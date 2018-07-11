package games.vendingMachineGame.abstractFactory;

public interface VendingMachineImpl {
	void buildVendingMachine();
	void showStats();
	void showHiddenStats();
	String vendingMachineDifficultyName();
	double vendingMachineReward();
	double vendingMachineCost();
}
