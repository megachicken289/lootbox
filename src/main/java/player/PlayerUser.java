package player;

import abstractFactory.BoxImpl;
import lootBoxes.Difficulty;

public class PlayerUser
{
	private Difficulty playerLevel;
	private double playerPaymentTotal;
	private double playerLastPay;
	private double playerLuck;
	private boolean playerWinner;

	public PlayerUser() {
		playerLevel = Difficulty.DIFFICULTY_NULL;
		playerPaymentTotal = 0.00;
		playerLuck = 0.01;
		playerWinner = false;
	}

	public PlayerUser(Difficulty testPlayerLevel, double testPlayerPayment) {
		playerLevel = testPlayerLevel;
		playerPaymentTotal = testPlayerPayment;
	}

	public Difficulty getPlayerLevel()
	{
		return playerLevel;
	}

	public void setPlayerLevel(Difficulty playerLevel)
	{
		this.playerLevel = playerLevel;
	}

	public double getPlayerPaymentTotal()
	{
		return playerPaymentTotal;
	}

	public void setPlayerPaymentTotal(double playerPaymentTotal)
	{
		this.playerPaymentTotal = playerPaymentTotal;
	}

	public double getPlayerLastPay()
	{
		return playerLastPay;
	}

	public void setPlayerLastPay(double playerLastPay)
	{
		this.playerLastPay = playerLastPay;
	}

	public double getPlayerLuck()
	{
		return playerLuck;
	}

	public boolean isPlayerWinner()
	{
		return playerWinner;
	}

	public void setPlayerWinner(boolean playerWinner)
	{
		this.playerWinner = playerWinner;
	}

	public void setPlayerLuck(double playerLuck)
	{
		this.playerLuck = playerLuck;
	}

	public void playerPlaysBox(BoxImpl box) {

	}

	public double subtractFromBoxFromCost(BoxImpl box) {
		double boxCost = box.boxCost();

		return boxCost -= playerPaymentTotal;
	}

	public double playerBoxDeposit(double playerPay) {
		return playerPaymentTotal += playerPay;
	}

}
