package lifeform;

import static org.junit.Assert.*;

import org.junit.Test;

import recovery.RecoveryLinear;
/**
 * Tests for Alien class
 * @author chandana gogineni
 *
 */
public class TestAlien 
{
	Alien alien;
	
	/**
	 * Start section for Strategy pattern
	 */
	@Test
	public void testInitialization() 
	{
		alien = new Alien("Bob", 40);
		assertEquals("Bob", alien.getName());
		assertEquals(40, alien.getCurrentLifePoints());			
	}
	
	/**
	 * Start section for Observer pattern
	 */
	@Test
	public void testUsingObserver() 
	{
		alien = new Alien("Bob", 40);
		assertEquals(10, alien.getAttackStrength());		
	}

}
