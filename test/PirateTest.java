import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {


	@Test
	public void testCreatePirate() {
		Pirate p =new Pirate("Bob");
		assertEquals("Bob", p.getName());		
	}
	
	@Test
	public void testCreateOctoPirate() {
		Pirate p = new Pirate("Octopus Davey", 8);
		assertEquals("Octopus Davey", p.getName());
		assertEquals(8,p.getLimbsRemaining());
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullPirate() {
		Pirate p = null;
		p.loseALimb();		
	}
	

}
