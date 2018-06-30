package utils;

import lootBoxes.Difficulty;
import lootBoxes.LeveledLootBox;

import java.util.Scanner;

/**
 * Created by Frank Borges XPTHQ on 6/22/2018.
 */
public class StringUtils {
	private enum BinaryAnswer {
		YES,
		Y,
		NO,
		N;
	}

	protected static Difficulty llb;
	
	public static String getPlayerYNInput(String str) {
		Scanner input = new Scanner(System.in);
		System.out.printf(str + " [Y/N]: ");
		return input.nextLine().toUpperCase();
	}
	
	public static String getPlayersInput(String str,boolean printDiffList) {
		Scanner input = new Scanner(System.in);
		// this will print difficulty levels by name and number
		System.out.printf(str + ": ");
		
		return input.nextLine().toUpperCase();
	}

	public static boolean getPlayerChoiceAsYN(String str) {
		String choice = getPlayerInputAsString(str);
		boolean checkChoice = choice.equals("YES") || choice.equals("Y") ||
				choice.equals("NO") || choice.equals("N");
		while (!checkChoice) {
			choice = getPlayerInputAsString("Please answer with [Y]es or [N]o");
			checkChoice = choice.equals("YES") || choice.equals("Y") ||
					choice.equals("NO") || choice.equals("N");
		}
		if (choice.equals("YES") || choice.equals("Y")) {
			return true;
		} else if (choice.equals("NO") || choice.equals("N")) {
			return false;
		}

		return false;
	}

	// TODO: CHeck if difficulty level exists
	public static boolean checkForDifficultyLevel(String str) {
		String diffLvlExists = getPlayerInputAsString(str);
		// do enum checking logic here

		return false;
	}

	public static String getPlayerInputAsString(String str) {
		Scanner input = new Scanner(System.in);
		System.out.printf(str + ": ");
		return input.nextLine().toUpperCase();
	}

	public static double getPlayerInputAsDouble(String str) {
		Scanner input = new Scanner(System.in);
		System.out.printf(str + ": ");
		return input.nextDouble();
	}

	public static int getPlayerInputAsInt(String str) {
		Scanner input = new Scanner(System.in);
		System.out.printf(str + ": ");
		return input.nextInt();
	}

	public static void showChoiceMade(String str) {
		System.out.printf("You have chosen: %s%n",str);
	}

	public static void showChoiceMade(String str,String prefix) {
		System.out.printf("You have chosen: %s%.2s %n", prefix,str);
	}

	public static void showChoiceMade(double doub) {
		System.out.printf("You have chosen: %.2f$n",doub);
	}

	public static void showChoiceMade(double doub,String prefix) {
		System.out.printf("You have chosen: %s%.2f%n",prefix,doub);
	}
}
