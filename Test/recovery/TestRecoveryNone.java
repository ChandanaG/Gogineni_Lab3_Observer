package recovery;

import static org.junit.Assert.*;


import org.junit.Test;


//import lifeform.LifeForm;
import lifeform.MockLifeForm;
/**
 * Tests for when no recovery is done
 * @author chandana gogineni
 *
 */
public class TestRecoveryNone  
{
	/**
	 * When lifeform is hurt no recovery is done
	 * and the currentLifepoints after attack is returned
	 */

	@Test
	public void testInitialization () 
	{
		MockLifeForm lifeform;
		lifeform = new MockLifeForm("bob", 50);
		RecoveryNone recoverynone;
		recoverynone = new RecoveryNone();
		assertEquals(50, recoverynone.calculateRecovery(50, 50));
		/**
		 * returns the current life points after attack
		 */
		lifeform.takeHit(10);
		assertEquals(50, recoverynone.calculateRecovery(50, 60));
		
	}
	

}
