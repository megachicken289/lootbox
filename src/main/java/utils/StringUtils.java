package utils;

import lootBoxes.Difficulty;
import lootBoxes.LeveledLootBox;

import java.util.Scanner;

/**
 * Created by Frank Borges XPTHQ on 6/22/2018.
 */
public class StringUtils {
	
	private static Scanner input = new Scanner(System.in);
	
	protected static Difficulty llb;
	
	public static String getPlayerYNInput(String str) {
		System.out.println(str + " [Y/N]: ");
		return input.nextLine().toUpperCase();
	}
	
//	// use this to get ambiguous player input
//	public static Object getPlayersInput(Object ob, boolean printDiffList) {
//		Object ambiguousPlayerInput;
//		if (ob instanceof String) {
//			// use getPlayersInput String
//		} else if (ob instanceof Integer) {
//			// use getPlayersInput Integer
//		}
//		// .
//		// .
//		// .
//		else {
//			// reject for improper input type
//		}
//		return input.nextLine().toUpperCase();
//	}
	
	public static String getPlayersInput(String str,boolean printDiffList) {
		// this will print difficulty levels by name and number
		System.out.println(str + ": ");
		
		return input.nextLine().toUpperCase();
	}

	public static String getPlayerInput(String str) {
		System.out.println(str + ": ");
		return input.nextLine().toUpperCase();
	}

	public static int getPlayerInput(int integer) {
		System.out.println(integer + ": ");
		return input.nextInt();
	}
	
	public static double getPlayerInput(double doub) {
		System.out.println(doub + ": ");
		return input.nextDouble();
	}
	
	public static float getPlayerInput(float fl) {
		System.out.println(fl + ": ");
		return input.nextInt();
	}
}
