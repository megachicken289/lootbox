package abstractFactory;

import lootBoxes.Difficulty;
import org.junit.Before;
import org.junit.Test;

public class BuildBoxes
{
    private BoxFactory boxFactory;

    @Before
    public void setup() {
        boxFactory = new BoxFactory();
    }
    @Test
    public void testBuildSlutatia() throws Exception
    {
        BoxImpl box = boxFactory.getBox(Difficulty.SLUTATIA);

        box.showStats();
    }

    @Test
    public void testBuildVeryEasy() throws Exception
    {
        BoxImpl box = boxFactory.getBox(Difficulty.VERY_EASY);

        box.showStats();
    }

    @Test
    public void testBuildEasy() throws Exception
    {
        BoxImpl box = boxFactory.getBox(Difficulty.EASY);

        box.showStats();
    }

    @Test
    public void testBuildMedium() throws Exception
    {
        BoxImpl box = boxFactory.getBox(Difficulty.MEDIUM);

        box.showStats();
    }
}
