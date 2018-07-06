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
            return new Slutatia();
        } else if (boxDiff.getLevelName().equals("VERY_EASY")) {
            return new VeryEasy();
        } else if (boxDiff.getLevelName().equals("EASY")) {
            return new Easy();
        } else if (boxDiff.getLevelName().equals("MEDIUM")) {
            return new Medium();
        } else if (boxDiff.getLevelName().equals("HARD")) {
            return new Hard();
        } else if (boxDiff.getLevelName().equals("LEGENDARY")) {
            return new Legendary();
        } else if (boxDiff.getLevelName().equals("I_WANT_MY_DADDY")) {
            return new IWantMyDaddy();
        } else if (boxDiff.getLevelName().equals("BED_WETTERS_DELIGHT")) {
            return new BedWetterDelight();
        }
        return null;
    }
}
