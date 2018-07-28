package mainStart;

import games.lootboxGame.abstractFactory.BoxImpl;
import games.lootboxGame.abstractFactory.BoxFactory;
import games.vendingMachineGame.abstractFactory.VendingFactory;
import games.vendingMachineGame.abstractFactory.VendingMachineImpl;
import logic.GameEngine;
import player.PlayerUser;

/**
 * Created by Frank Borges XPTHQ on 6/22/2018.
 */
public class Run {
	private PlayerUser player;
	private GameEngine engine;
	
	// lootbox
	private BoxFactory boxFactory;
	private BoxImpl box;

	// vending machine
	private VendingFactory vendingFactory;
	private VendingMachineImpl vendMach;
	
	public void init() {

	}
	
	public void runTheLootBox() {
		player = new PlayerUser();
		boxFactory = new BoxFactory();
		engine = new GameEngine();

		// play the lootbox
		engine.playBox(player,box,boxFactory);
	}
	
	public void runTheVendingMachine() {
		player = new PlayerUser();
		vendingFactory = new VendingFactory();
		engine = new GameEngine();
		
		// play the vending
		// TODO: IMPLEMENT
//		engine.playBox(player,vendMach,vendingFactory);
	}
	
	public void runVendingMachine() {
		player = new PlayerUser();
	}
}
