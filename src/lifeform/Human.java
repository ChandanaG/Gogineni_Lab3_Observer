package lifeform;
/**
 * Human() class extends the abstract class LifeForm
 * @author chandana gogineni
 *
 */
public class Human extends LifeForm
{
	private int armorPoints;
	private int armorCopy;
	private int attackStrength;
	private int temp;
	private int remainingLifePoints;
	public int currentLifePoints;
	private int lifeCopy;
	public int remains;
	MockLifeForm entity;
	/**
	 * Human class constrcutor
	 * @param name
	 * @param life
	 * @param armor
	 */
	public Human(String name, int life, int armor) 
	{		
		super(name, life);
		armorCopy = armor;
		attackStrength = 5;
		lifeCopy = life;
		armor = armorPoints;
	}
	/**
	* @return the default attack strength
	*/
	public int getAttackStrength()
	{
		return attackStrength;
	}
	/**
	 *@return the name of the life form.
	*/
	public int getArmorPoints() 
	{	
		return armorPoints;
	}
	/**
	 *@return the amount of current life points the life form has.
	*/
	public void setArmorPoints(int points) 
	{	
		if(points <= 0) 
			armorPoints = 0;
		else
			armorPoints = points;	
	}
	/**
	 * When attack method is called on Human, 
	 * takeHit method calculates the currentLifePoints 
	 * based on the damage and the armor points set
	 */
	public int takeHit(int damage) 
	{
		/**
		 * When currentLifePoints are not 0
		 */
		if(lifeCopy != 0)
		{	
			/**
			 * if the damage is less than or equal to the armor points
			 * then current life points remains the same otherwise 
			 * current life points would be subtracted with armorpoints - damage
			 */
			if(damage <= armorCopy ) 
			{
				temp = 0;
			}
			else
			{
				temp = damage - armorCopy;		
			}
		}
		
		currentLifePoints = lifeCopy - temp;
		return currentLifePoints;
	}
	
} 
