package lifeform;

import static org.junit.Assert.*;

import org.junit.Test;

import GamePlay.SimpleTimer;
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
	 * Start section for Observer pattern
	 * @throws Exception 
	 */
	@Test
	public void testUsingObserver() 
	{
		alien = new Alien("Bob", 40);
		SimpleTimer st = new SimpleTimer(1000);
		assertEquals(10, alien.getAttackStrength());
		st.timeChanged();
		/**
		 * Alien recover when recovery rate is 2
		 */
		alien.recover(2); 
		assertEquals(32, alien.getCurrentLifePoints());
		st.timeChanged();
		/**
		 * Alien recovery when recovery rate is 5
		 */
		alien.recover(5); 
		assertEquals(35, alien.getCurrentLifePoints());
		st.timeChanged();
		/**
		 * No recovery when recovery rate is 0
		 */
		alien.recover(0); 
		assertEquals(30, alien.getCurrentLifePoints());
	}

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
	
}
