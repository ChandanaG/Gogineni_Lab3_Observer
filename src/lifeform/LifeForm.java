package lifeform;
/**
* Author: Chandana Gogineni 
* Keeps track of the information associated with a simple life form.
* Also provides the functionality related to the life form.
*/
public abstract class LifeForm {
	private String myName;
	private int currentLifePoints;
	private int attackStrength;
	
	
	/**
	* Create an instance
	*
	* @param name the name of the life form
	* @param points the current starting life points of the life form
	*/

	public LifeForm(String name, int points)
	{
		// TODO Auto-generated constructor stub
		
		myName = name;
		currentLifePoints = points;
		
	}
	
	public String getName() 
	{
		/**
		* @return the name of the life form.
		*/
		return myName;
	}
	
	public int getCurrentLifePoints() 
	{
		/**
		* @return the amount of current life points the life form has.
		*/
		return currentLifePoints;
	}
	
	public int getAttackStrength() 
	{
		return attackStrength;
	}
	public void setAttackStrength(int strPoints)
	{
		attackStrength = strPoints;	
	}
	public int takeHit(int damage) 
	{
		return damage;
	}

	public int Attack(int attackStrength) 
	{
		return attackStrength;
	}
	public void updateTime(int time) {
		
	}
}

