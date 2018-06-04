package lifeform;

import recovery.RecoveryBehavior;
import recovery.RecoveryLinear;
/**
 * LifeForm of an Alien
 * @author chandana gogineni
 *
 */
public class Alien extends LifeForm 
{
	RecoveryBehavior rb;
	private int maxLifePoints;
	private int currentLifePoints;
    MockLifeForm mocklifeform;
    RecoveryLinear recoveryL;
    private int attackStrength;
    private int recoveryRate;
    private int temp;
    /**
     * Constructors for Alien class
     * @param name
     * @param life
     */
	public Alien(String name, int life) 
	{
		super(name, life);	
		mocklifeform = new MockLifeForm("bob", 50);
		attackStrength = 10;
	}
	public Alien(String name, int life, RecoveryBehavior rb) 
	{		
		super(name, life);	
		currentLifePoints = life;
		life = maxLifePoints;
	}
	/**
	 * Calculates recovery based on recovery rate set
	 * @param value
	 */
	public void recover(int value)  
	{	 
		recoveryRate = value;
		temp = recoveryL.calculateRecovery(currentLifePoints, maxLifePoints);
		setRecover(recoveryRate);
		maxLifePoints += temp;
	}
	/**
	 * setRecovery() sets the recovery rate of the alien	
	 * @param recoveryrate
	 */
	public void setRecover(int recoveryrate)
	{
		try 
		{
			if(recoveryrate >= 0 ) 
				recoveryRate = recoveryrate;
		}
		catch(Exception e)
		{
			
		}
	}
	/**
	 * Sets the currentLifePoints after attack based on the attackStrength
	 * @param life
	 */
	public void setCurrentLifePoints(int life) 
	{	
		maxLifePoints = life - attackStrength;	
	}
	
	/**
	* @return default attack strength of alien.
	*/
	public int getAttackStrength() 
	{
		return attackStrength;
	}
	
}
