package GamePlay;

import static org.junit.Assert.*;

import org.junit.Test;

import GamePlay.SimpleTimer;
/**
 * Tests for SimpleTimer class using Threads
 * @author chandana gogineni
 *
 */
public class TestSimpleTimerAsThread extends Thread
{
	SimpleTimer st;
	@Test
	/**
	* This tests that SimpleTimer will * every second. update time once */
	public void testSimpleTimerAsThread() throws InterruptedException
	{ 
		st = new SimpleTimer(1000); 
		st.start();
		for(int x = 0; x < 5;x++ ) 
		{
			assertEquals(x,st.getRound()); //assumes round starts at 0 
			Thread.sleep(1000); //wait for the next time change
		}
	}
}
