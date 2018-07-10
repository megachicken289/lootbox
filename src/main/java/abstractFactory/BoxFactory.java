package abstractFactory;

import lootBoxes.Difficulty;

public class BoxFactory
{
    // use getBox method to get object of type box
    public BoxImpl getBox(Difficulty boxDiff) {
        if (boxDiff.getLevelName() == null) {
            return null;
        }
        if (boxDiff.getLevelNumber() == 0) {
            return null;
        }
        if (boxDiff.getLevelName().equals("SLUTATIA")) {
            return new BoxDifficultyController("SLUTATIA");
        } else if (boxDiff.getLevelName().equals("VERY_EASY")) {
            return new BoxDifficultyController("VERY_EASY");
        } else if (boxDiff.getLevelName().equals("EASY")) {
            return new BoxDifficultyController("EASY");
        } else if (boxDiff.getLevelName().equals("MEDIUM")) {
            return new BoxDifficultyController("MEDIUM");
        } else if (boxDiff.getLevelName().equals("HARD")) {
            return new BoxDifficultyController("HARD");
        } else if (boxDiff.getLevelName().equals("LEGENDARY")) {
            return new BoxDifficultyController("LEGENDARY");
        } else if (boxDiff.getLevelName().equals("I_WANT_MY_DADDY")) {
            return new BoxDifficultyController("I_WANT_MY_DADDY");
        } else if (boxDiff.getLevelName().equals("BED_WETTERS_DELIGHT")) {
            return new BoxDifficultyController("BED_WETTERS_DELIGHT");
        }
        return null;
    }
}
