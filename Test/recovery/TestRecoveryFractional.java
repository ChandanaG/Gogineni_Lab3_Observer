package recovery;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests for RecoveryFractional class that implements RecoveryBehavior interface
 * @author chandana gogineni
 *
 */
public class TestRecoveryFractional 
{

	@Test
	public void test() 
	{
		RecoveryFractional rf = new RecoveryFractional(0.1);
		/**
		 * Calculates the maximum recovery an alien
		 * can do without hitting the maxlifepoints
		 */
		int success = rf.calculateRecovery(40, 50);
		assertEquals(44, success);
		/**
		 * Alien fractional recovery that ceils to first next multiple
		 * of 10 when the mod on lifepoints remainder not equal to 0
		 */
		success = rf.calculateRecovery(93, 100);
		assertEquals(100, success);
		/**
		 * Alien fractional recovery in which if the currentlifepoints
		 * exceeds the maxlifepoints then currentlifepoints is set to
		 * maxlifepoints
		 * 
		 */
		success = rf.calculateRecovery(101, 100);
		assertEquals(100, success);
	}

}
