import junit.framework.TestCase;

public class BruchTest extends TestCase {

	public void testBruch() {
		Bruch bruch = new Bruch();
		assertEquals("1.0 / 1.0",  bruch.bruchErzeugen());
	}

	public void testBruchDoubleDouble() {
		Bruch bruch = new Bruch(2, 3);
		assertEquals("2.0 / 3.0",  bruch.bruchErzeugen());
	}

	public void testBruchErzeugen() {
		Bruch bruch = new Bruch(1, 2);
		assertEquals("1.0 / 2.0", bruch.bruchErzeugen());
	}

	public void testGetZaehler() {
		Bruch bruch = new Bruch(2, 3);
		assertEquals(2.0, bruch.getZaehler());
	}

	public void testSetZaehler() {
		Bruch bruch = new Bruch(2, 3);
		bruch.setZaehler(5);
		assertEquals(5.0, bruch.getZaehler());
	}

	public void testGetNenner() {
		Bruch bruch = new Bruch(2, 3);
		assertEquals(3.0, bruch.getNenner());
	}

	public void testSetNenner() {
		Bruch bruch = new Bruch(2, 3);
		bruch.setNenner(3);
		assertEquals(3.0, bruch.getNenner());
	}

	public void testAddiere() {
		Bruch bruch1 = new Bruch(2, 3);
		Bruch bruch2 = new Bruch(4, 5);
		bruch1.addiere(bruch2);
		assertEquals("22.0 / 15.0", bruch1.bruchErzeugen());
	}

	public void testSubtrahiere() {
		Bruch bruch1 = new Bruch(2, 3);
		Bruch bruch2 = new Bruch(4, 5);
		bruch1.subtrahiere(bruch2);
		assertEquals("-2.0 / 15.0", bruch1.bruchErzeugen());
	}

	public void testMultipliziere() {
		Bruch bruch1 = new Bruch(2, 3);
		Bruch bruch2 = new Bruch(4, 5);
		bruch1.multipliziere(bruch2);
		assertEquals("8.0 / 15.0", bruch1.bruchErzeugen());
	}

	public void testDividiere() {
		Bruch bruch1 = new Bruch(2, 3);
		Bruch bruch2 = new Bruch(4, 5);
		bruch1.dividiere(bruch2);
		assertEquals("5.0 / 6.0", bruch1.bruchErzeugen());
	}

}
