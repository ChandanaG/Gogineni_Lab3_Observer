package recovery;

import lifeform.Alien;
import lifeform.LifeForm;
/**
 * A class that implements RecoveryBehavior and
 * returns the currentLifePoints when hurt without recovery
 * @author chandana gogineni
 *
 */
public class RecoveryNone implements RecoveryBehavior
{
	RecoveryNone rn;
	LifeForm lifeform;
	Alien alien;
	@Override
	public int calculateRecovery(int currentLife, int maxLife) 
	{
		
		// TODO Auto-generated method stub
		alien = new Alien("bob", 50);
		currentLife = alien.getCurrentLifePoints();
		return currentLife;
	}
	

}
