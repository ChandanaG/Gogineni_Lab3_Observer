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
public class TestRecoveryNone  {
	
	

	@Test
	public void testInitialization () {
		MockLifeForm lifeform;
		lifeform = new MockLifeForm("bob", 50);
		RecoveryNone recoverynone;
		recoverynone = new RecoveryNone();
		assertEquals(50, recoverynone.calculateRecovery(50, 50));
		lifeform.takeHit(10);
		assertEquals(50, recoverynone.calculateRecovery(50, 60));
		
	}
	
//	public TestRecoveryNone(String name, int points) {
//		super(name, points);
//		// TODO Auto-generated constructor stub
//	}

}
