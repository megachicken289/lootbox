package games.lootboxGame.abstractFactory;

import games.lootboxGame.lootBoxes.BoxDifficultyController;
import difficulty.Difficulty;

public class BoxFactory
{
    // use getBox method to get object of type box
    public BoxImpl getBox(Difficulty boxDiff) {
        if (boxDiff.getLevelName() == null || boxDiff.getLevelNumber() == 0) {
            return new BoxDifficultyController("DIFFICULTY_NULL");
        }
        if (boxDiff.getLevelName().equals(Difficulty.valueOf(boxDiff.toString()))) {
            return new BoxDifficultyController(boxDiff.getLevelName());
        }
        return null;
    }
}
