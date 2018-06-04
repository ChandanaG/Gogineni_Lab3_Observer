package recovery;

import lifeform.Alien;
/**
 * A class that implements recoveryBehavior interface and 
 * update the currentLifePoints based on the calculated 
 * recovery value
 * @author chandana gogineni
 *
 */
public class RecoveryLinear implements RecoveryBehavior{
	int recoveryStep;
	int max;
	Alien alien;
	
	public RecoveryLinear(int step) {
		
		max = step;
		
	}
	/**
	 * Updates the currentLifePoints based on the recovery value calculated
	 */
	public int calculateRecovery(int currentLife, int maxLife) {
		// TODO Auto-generated method stub
		recoveryStep = currentLife;
		currentLife += max;
		if(recoveryStep == 0) 
			 currentLife = 0;
		
		if (currentLife > maxLife) 
			currentLife = maxLife;
			
		return currentLife;
	
		}
	}
	