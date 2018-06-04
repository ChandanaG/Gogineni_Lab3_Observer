package GamePlay;
/**
 * Timer interface has methods add and remove and time changed
 * which can be implemented to add or remove observer and call
 * timeChanged() based on the round the game is in which will 
 * invoke updateTime() method of all observers
 * @author chandana gogineni
 *
 */
public interface Timer {
	
	public void addTimeObserver(TimeObserver observer);
	public void removeTimeObserver(TimeObserver observer); 
	public void timeChanged();
}
