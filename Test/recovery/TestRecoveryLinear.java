package recovery;

import static org.junit.Assert.*;

import org.junit.Test;

import lifeform.Alien;

public class TestRecoveryLinear 
{
	/**
	 * Tests for recovery by Linear Behavior
	 */
	@Test
	public void Test() 
	{
		/**
		 * Test for recovery to the fullest without hitting max value
		 */
		RecoveryLinear rl= new RecoveryLinear(4);
		int result = rl.calculateRecovery(40, 50);
		assertEquals(44, result);
		/**
		 * Test for recovery when exceeding max value
		 */
		rl= new RecoveryLinear(4);
		result = rl.calculateRecovery(97, 100);
		assertEquals(100, result);
		/**
		 * Test for when currentLifePoints are at 0
		 */
		rl= new RecoveryLinear(3);
		result = rl.calculateRecovery(0, 50);
		assertEquals(0, result);
	}
}


