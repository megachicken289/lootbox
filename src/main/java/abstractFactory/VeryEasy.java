package abstractFactory;

import lootBoxes.Difficulty;
import lootBoxes.LeveledLootBox;

public class VeryEasy implements BaseBoxImpl
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
}