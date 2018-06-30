package abstractFactory;

import lootBoxes.Difficulty;
import lootBoxes.LeveledLootBox;

public class Medium implements BaseBoxImpl
{
    LeveledLootBox llb = new LeveledLootBox(Difficulty.MEDIUM);
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