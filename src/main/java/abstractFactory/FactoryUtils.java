package abstractFactory;

import lootBoxes.LeveledLootBox;

class FactoryUtils
{
    protected void boxBuilder(LeveledLootBox llb) {
        llb.getRewards();
        llb.getLootBoxCost();
        llb.getMinThresholdToWin();
        llb.getMaxThresholdToWin();
        llb.getChance();
        llb.getLuck();
    }

    protected void boxStats(LeveledLootBox llb) {

        System.out.printf("" +
                        "Stats: %8s%n" +
                        "=====================%n" +
                        "REWARDS:     %8.2f%n" +
                        "COST:        %8.2f%n" +
                        "LUCK:        %8.2f%n%n",
                llb.getLevelName(),
                llb.getRewards(),
                llb.getLootBoxCost(),
                llb.getLuck());
    }

    protected void boxHiddenStats(LeveledLootBox llb) {

        System.out.printf("" +
                        "Stats: %8s%n" +
                        "=====================%n" +
                        "REWARDS:     %8.2f%n" +
                        "COST:        %8.2f%n" +
                        "MINTHRESHOLD:%8.2f%n" +
                        "MAXTHRESHOLD:%8.2f%n" +
                        "CHANCE:      %8.2f%n" +
                        "LUCK:        %8.2f%n%n",
                llb.getLevelName(),
                llb.getRewards(),
                llb.getLootBoxCost(),
                llb.getMinThresholdToWin(),
                llb.getMaxThresholdToWin(),
                llb.getChance(),
                llb.getLuck());
    }

    protected double boxReward(LeveledLootBox llb) {
        return llb.getRewards();
    }

    protected double boxCost(LeveledLootBox llb) {
        return llb.getLootBoxCost();
    }

    protected double boxMinThreshold(LeveledLootBox llb) {
        return llb.getMinThresholdToWin();
    }

    protected double boxMaxTheshold(LeveledLootBox llb) {
        return llb.getMaxThresholdToWin();
    }

    protected double boxChance(LeveledLootBox llb) {
        return llb.getChance();
    }

    protected double boxLuck(LeveledLootBox llb) {
        return llb.getLuck();
    }
}
