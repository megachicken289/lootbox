package abstractFactory;

import lootBoxes.Difficulty;
import lootBoxes.LeveledLootBox;

public class Easy implements BaseBoxImpl
{
    LeveledLootBox llb = new LeveledLootBox(Difficulty.EASY);
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