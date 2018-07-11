package logic;

import games.lootboxGame.lootBoxes.BoxDifficultyController;
import games.lootboxGame.abstractFactory.BoxImpl;
import games.lootboxGame.abstractFactory.BoxFactory;
import difficulty.Difficulty;
import player.PlayerUser;
import utils.StringUtils;

public class GameEngine
{
	private boolean diffLvlSelected;
	private Difficulty diffLvl = Difficulty.DIFFICULTY_NULL;

	public void play(PlayerUser player, BoxImpl box, BoxFactory boxFactory)
	{
		boolean playerPlay = StringUtils.getPlayerChoiceAsYN("Do you want to lootbox");

		while (playerPlay) {
			if (!diffLvlSelected) {
				diffLvl = Difficulty.valueOf(
						StringUtils.getPlayerInputAsString("Which difficulty do you want")
				);
				diffLvlSelected = true;
			}
			StringUtils.showChoiceMade(diffLvl.getLevelName());
			player.setPlayerLevel(diffLvl);

//			box = boxFactory.getBox(diffLvl);
			box = new BoxDifficultyController(diffLvl.toString());

			box.buildBox();
			box.showStats();        // used for testing purposes

			// TODO: Make sure player pays minimum cost to play box level
			double playerPay = StringUtils.getPlayerInputAsDouble("How much would you like to pay",true);
			StringUtils.showChoiceMade(playerPay, "$");
			player.setPlayerLastPay(playerPay);
			player.playerBoxDeposit(playerPay);

//			DevUtils.showPlayerMinMaxThresholdAgainstCostReward(player, box);    // used for testing purposes
			box.showStats();

			doDaPlayaWin(player,box,boxFactory);
			System.out.println("PLAYER IS A: " + (player.isPlayerWinner()?"WINNER":"LOSER"));
//			System.out.println("PLayer is a: " + player.isPlayerWinner());
			if (player.isPlayerWinner()) {
				reset(player);
			}
			playerPlay = StringUtils.getPlayerChoiceAsYN("Do you want to play again");
		}
	}

	private void doDaPlayaWin(PlayerUser player, BoxImpl box, BoxFactory boxFactory) {

		double playerTotalPayment   = player.getPlayerPaymentTotal();
		double playerLuck           = player.getPlayerLuck();
		boolean playerIsWinner      = player.isPlayerWinner();

		if (playerTotalPayment > box.boxMinThreshold()) {
		playerIsWinner = playerLuck > box.boxChance();
			player.setPlayerWinner(playerIsWinner);
		}
		playerIsWinner = playerTotalPayment > box.boxMaxThreshold();
		player.setPlayerWinner(playerIsWinner);
	}

	private void reset(PlayerUser player) {
		player.setPlayerWinner(false);
		player.setPlayerPaymentTotal(0.00);
		player.setPlayerLastPay(0.00);
		diffLvlSelected = false;
	}
}
