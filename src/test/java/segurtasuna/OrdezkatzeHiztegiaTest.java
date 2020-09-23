package segurtasuna;

import junit.framework.TestCase;

public class OrdezkatzeHiztegiaTest extends TestCase {
    kripto_ordezkapen kripto_ordezkapen = null;

    public OrdezkatzeHiztegiaTest() {
    }

    public void setUp() throws Exception {
        super.setUp();
        this.kripto_ordezkapen = new kripto_ordezkapen();
    }

    public void tearDown() throws Exception {
    }

    public void testZifratu() {
        assertEquals("BP MZTVB MBWWZWBJ ZGVB", this.kripto_ordezkapen.zifratu("EZ GAUDE GERRAREN ALDE"));
    }

    public void testDeszifratu() {
        assertEquals("EZ GAUDE GERRAREN ALDE", this.kripto_ordezkapen.deszifratu(this.kripto_ordezkapen.zifratu("EZ GAUDE GERRAREN ALDE")));
    }
}
