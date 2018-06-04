package recovery;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests for RecoveryFractional class that implements RecoveryBehavior interface
 * @author chandana gogineni
 *
 */
public class TestRecoveryFractional {

	@Test
	public void test() {
		RecoveryFractional rf = new RecoveryFractional(0.1);
		int success = rf.calculateRecovery(40, 50);
		assertEquals(44, success);
		success = rf.calculateRecovery(93, 100);
		assertEquals(100, success);
		success = rf.calculateRecovery(101, 100);
		assertEquals(100, success);
	}

}
