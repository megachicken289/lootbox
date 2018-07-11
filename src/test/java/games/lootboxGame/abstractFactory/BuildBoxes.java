package games.lootboxGame.abstractFactory;

import difficulty.Difficulty;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

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
        
        assertNotNull(box);
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
    
    @Test
    public void testBuildBeginner() {
    }
    
    @Test
    public void testBuildHard() {
    }
    
    @Test
    public void testBuildLegendary() {
    }
    
    @Test
    public void testBuildIWantMyDaddy() {
    }
    
    @Test
    public void testBUildBedWetterDelight() {
        BoxImpl box = boxFactory.getBox(Difficulty.BED_WETTER_DELIGHT);
    }
}
