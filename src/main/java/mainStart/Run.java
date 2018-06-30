package mainStart;

import abstractFactory.BoxImpl;
import abstractFactory.BoxFactory;
import logic.GameEngine;
import player.PlayerUser;

/**
 * Created by Frank Borges XPTHQ on 6/22/2018.
 */
public class Run {
	private PlayerUser player;
	private BoxFactory boxFactory;
	private BoxImpl box;
	private GameEngine engine;

	public void init() {

	}
	
	public void runTheLootBox() {
		player = new PlayerUser();
		boxFactory = new BoxFactory();
		engine = new GameEngine();

		// play the lootbox
		engine.play(player,box,boxFactory);
	}
}
