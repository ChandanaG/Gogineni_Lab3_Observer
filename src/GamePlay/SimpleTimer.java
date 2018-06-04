package GamePlay;

import java.util.*;
/**
 * Simple Timer keeps track of what round a game is in.
 * Start at round 0 and increments by 1 everytime a 
 * timeChanged() is called. Aditionally, it calls the 
 * updateTime() dfunction of all observers
 * @author chandana gogineni
 *
 */

public class SimpleTimer extends Thread implements Timer
{
	private int round;
	private int time;
	private int timeCopy;
	ArrayList<TimeObserver> theObservers = new ArrayList<TimeObserver>();
	public SimpleTimer() {
		
	}
	public SimpleTimer(int i) 
	{
		time = i;
		
	}
	/**
	 * Simple Timer method using Threads
	 */
	public void run() 
	{
		for (int round = getRound(); round < 50; round++) 
		{
			try
			{ 
				Thread.sleep(1000);
				timeChanged();
			}
			catch (InterruptedException e)
			{ 
				System.out.println("exception.");
			}
		}
	} 
	
	/**
	 * Adds an observer to the List
	 */
	@Override
	public void addTimeObserver(TimeObserver observer) {
		theObservers.add(observer);
		
	}
	
	/**
	 * Removes an observer from the list when list is not empty
	 */
	@Override
	public void removeTimeObserver(TimeObserver observer) {
		theObservers.remove(observer);
		 
	}
	public void updateTime(int time) {
		time = this.time;
	}
	/**
	 * Increments round and calls updateTime() method of all observers
	 */
	@Override
	public void timeChanged() {
		for(TimeObserver to : theObservers) {
				round++;
				to.updateTime(time);
			
		}
		
	}
	/**
	 * Returns the current round the game is in
	 * @return
	 */
	public int getRound() {
		return round;
	}
	/**
	 * Returns the list of observers
	 * @return
	 */
	public List<TimeObserver> getTheObservers(){
		return theObservers;
	}
}
