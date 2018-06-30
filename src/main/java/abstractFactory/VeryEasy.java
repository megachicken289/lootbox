package abstractFactory;

import lootBoxes.Difficulty;
import lootBoxes.LeveledLootBox;

public class VeryEasy implements BoxImpl
{
    LeveledLootBox llb = new LeveledLootBox(Difficulty.VERY_EASY);
    FactoryUtils fu = new FactoryUtils();
    @Override
    public void buildBox()
    {
        fu.boxBuilder(llb);
    }

    @Override
    public void showStats()
    {
        fu.boxStats(llb);
    }


    @Override
    public void showHiddenStats()
    {
        fu.boxHiddenStats(llb);
    }

    @Override
    public double boxReward()
    {
        return llb.getRewards();
    }

    @Override
    public double boxCost() {
        return llb.getLootBoxCost();
    }

    @Override
    public double boxMinThreshold()
    {
        return llb.getMinThresholdToWin();
    }

    @Override
    public double boxMaxThreshold()
    {
        return llb.getMaxThresholdToWin();
    }

    @Override
    public double boxChance()
    {
        return llb.getChance();
    }

    @Override
    public double boxLuck()
    {
        return llb.getLuck();
    }
}