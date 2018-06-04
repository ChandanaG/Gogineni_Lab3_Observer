package TestGamePlay;

import static org.junit.Assert.*;

import org.junit.Test;

import GamePlay.SimpleTimer;
import GamePlay.TimeObserver;

public class TestSimpleTimer {

	@Test
	public void testInitialization() {
		SimpleTimer simpletimer = new SimpleTimer();
		assertEquals(0, simpletimer.getRound());
		simpletimer.addTimeObserver(null);
		assertEquals(0, simpletimer.getTheObservers());
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