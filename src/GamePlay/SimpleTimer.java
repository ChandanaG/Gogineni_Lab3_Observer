package GamePlay;

import java.util.*;

public class SimpleTimer implements Timer{
	private int round;
	private int time;
	ArrayList<TimeObserver> theObservers = new ArrayList<TimeObserver>();
	

	@Override
	public void addTimeObserver(TimeObserver observer) {
		theObservers.add(observer);
		
	}

	@Override
	public void removeTimeObserver(TimeObserver observer) {
		theObservers.remove(observer);
		
	}
	public void updateTime(int time) {
		time = this.time;
	}

	@Override
	public void timeChanged() {
		for(TimeObserver to : theObservers) {
				round++;
				to.updateTime(time);
			
		}
		
	}
	public int getRound() {
		return round;
	}
	public List<TimeObserver> getTheObservers(){
		return theObservers;
	}
}
