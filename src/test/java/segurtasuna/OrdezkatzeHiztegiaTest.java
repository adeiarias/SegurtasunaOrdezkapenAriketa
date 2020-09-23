package segurtasuna;

import junit.framework.TestCase;

public class OrdezkatzeHiztegiaTest extends TestCase {
    kripto_ordez_TestaEgiteko kripto_ordez_TestaEgiteko = null;

    public OrdezkatzeHiztegiaTest() {
    }

    public void setUp() throws Exception {
        super.setUp();
        kripto_ordez_TestaEgiteko = new kripto_ordez_TestaEgiteko();
    }

    public void tearDown() throws Exception {
    }

    public void testZifratu() {
        assertEquals("BP MZTVB MBWWZWBJ ZGVB", kripto_ordez_TestaEgiteko.zifratu("EZ GAUDE GERRAREN ALDE"));
    }

    public void testDeszifratu() {
        assertEquals("EZ GAUDE GERRAREN ALDE", kripto_ordez_TestaEgiteko.deszifratu(kripto_ordez_TestaEgiteko.zifratu("EZ GAUDE GERRAREN ALDE")));
    }
}
