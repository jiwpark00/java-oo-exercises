import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class RobotsTest {
	
	@Test
	public void testName() {
		Robot r = new Robot("Rey",3,4,10,"north");
		assertEquals("Rey",r.giveName());
		assertEquals("north",r.giveOriginalOrientation());
		assertEquals("west",r.giveOrientation());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
