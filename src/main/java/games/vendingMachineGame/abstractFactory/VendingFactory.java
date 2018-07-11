package games.vendingMachineGame.abstractFactory;

import difficulty.Difficulty;

public class VendingFactory {
	
	public VendingMachineImpl getVendingMachine(Difficulty vmDiff) {
		if (vmDiff.getLevelName() == null || vmDiff.getLevelNumber() == 0) {
			return null;
		}
		if (vmDiff.getLevelName().equals(Difficulty.valueOf(vmDiff.toString()))) {
			return null;
		}
		return null;
	}
}
