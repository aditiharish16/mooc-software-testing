package tudelft.ghappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GHappyTest {
    @Test
    public void testAllGHappy() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("xxggxx"));
        assertTrue(gHappy.gHappy("xggxggx"));
        assertTrue(gHappy.gHappy("ggggg"));
    }

    @Test
    public void testUnhappyG() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("xxgxx"));
        assertFalse(gHappy.gHappy("xxggyygxx"));
        assertFalse(gHappy.gHappy("ggxxg"));
    }

    @Test
    public void testNoG() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("xxxxxx"));
        assertTrue(gHappy.gHappy(""));
    }

   

}
