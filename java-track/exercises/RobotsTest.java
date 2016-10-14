import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class RobotsTest {
	
	private static final Robot Robot = null;

	@Test
	public void testName() {
		Robot r = new Robot("Rey",3,4,10,"north");
		assertEquals("Rey",r.giveName());
		assertEquals("north",r.giveOriginalOrientation());
		assertEquals("west",r.giveOrientation());
		
		Robot r2 = new Robot("Siri",10,4,11,"west");
		assertEquals("Siri",r2.giveName());
		assertEquals("south",r2.giveOrientation());
	}
	
	@Test
	public void testgiveDistance() {
		Robot robot1 = new Robot("Ronald",0,0,15,"north");
		Robot robot2 = new Robot("Sam",6,8,10,"south");
		//assertEquals(5.0,robot1.giveDistance(robot2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
