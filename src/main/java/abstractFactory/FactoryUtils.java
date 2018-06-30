package abstractFactory;

import lootBoxes.LeveledLootBox;

class FactoryUtils
{
    protected void boxBuilder(LeveledLootBox llb) {
        llb.calcRewards();
        llb.calcLootBoxCost();
        llb.calcMinThresholdToWin();
        llb.calcMaxThresholdToWin();
        llb.calcChance();
        llb.calcLuck();
    }

    protected void boxStats(LeveledLootBox llb) {

        System.out.printf("" +
                        "Stats: %8s%n" +
                        "=====================%n" +
                        "REWARDS:     %8.2f%n" +
                        "COST:        %8.2f%n" +
                        "MINTHRESHOLD:%8.2f%n" +
                        "MAXTHRESHOLD:%8.2f%n" +
                        "CHANCES:     %8.2f%n" +
                        "LUCK:        %8.2f%n%n",
                llb.getLevelName(),
                llb.calcRewards(),
                llb.calcLootBoxCost(),
                llb.calcMinThresholdToWin(),
                llb.calcMaxThresholdToWin(),
                llb.calcChance(),
                llb.calcLuck());
    }
}
