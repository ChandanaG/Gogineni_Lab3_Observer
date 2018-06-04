package GamePlay;

import static org.junit.Assert.*; 

import org.junit.Test;

import GamePlay.SimpleTimer;
import GamePlay.TimeObserver;

/**
 * Tests for SimpleTimer class
 * @author chandana gogineni
 *
 */

public class TestSimpleTimer 
{
	
	@Test
	public void testInitialization() 
	{
		SimpleTimer simpletimer = new SimpleTimer();
		MockSimpleTimerObserver mst = new MockSimpleTimerObserver();
		/**
		 * Starts at round 0
		 */
		assertEquals(0, simpletimer.getRound());
		/**
		 * Tests that initial list of observers is empty
		 */
		assertTrue(simpletimer.getTheObservers().isEmpty());
		/**
		 * Adds an observer to the list and checks to be sure that 
		 * the list is not empty after  
		 */
		simpletimer.addTimeObserver(mst);
		assertFalse(simpletimer.getTheObservers().isEmpty());
		/**
		 * Removes an observer from the list and checks to be sure that 
		 * the list is empty after  
		 */
		simpletimer.removeTimeObserver(mst);
		assertTrue(simpletimer.getTheObservers().isEmpty());
		simpletimer.timeChanged();
	}

}
class MockSimpleTimerObserver implements TimeObserver
{
	public int myTime = 0;
	public void updateTime(int time) 
	{
		myTime = time;
	}
}
