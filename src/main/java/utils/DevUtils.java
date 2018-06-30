package utils;

import abstractFactory.BoxImpl;
import lootBoxes.Difficulty;
import player.PlayerUser;

/**
 * Created by Frank Borges XPTHQ on 6/11/2018.
 */
public class DevUtils
{
    public static void showPlayerMinMaxThresholdAgainstCostReward(PlayerUser playerUser, BoxImpl box) {
	    System.out.println("Your min thresh: $" + box.boxMinThreshold());
	    System.out.println("Your max thresh: $" + box.boxMaxThreshold());
	    System.out.println("Your last pay amount: $" + playerUser.getPlayerLastPay());
	    System.out.println("You paid thus far: $" + playerUser.getPlayerPaymentTotal());
	    System.out.println("Box cost is: $" + box.boxCost());
	    System.out.println();
    }
}
