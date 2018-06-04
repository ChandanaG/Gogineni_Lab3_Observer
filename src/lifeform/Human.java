package lifeform;

public class Human extends LifeForm{
	private int armorPoints;
	private int armorCopy;
	private int attackStrength;
	private int temp;
	private int remainingLifePoints;
	public int currentLifePoints;
	private int lifeCopy;
	public int remains;
	MockLifeForm entity;
	
	public Human(String name, int life, int armor) 
	{		
		super(name, life);
		armorCopy = armor;
		attackStrength = 5;
		lifeCopy = life;
		System.out.println("Copy" +armorCopy);
		//life = currentLifePoints;
		
		armor = armorPoints;
		//System.out.println("In constructor" +armor);
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
		//System.out.println("In set method" +armorPoints);
	}
	
	public int takeHit(int damage) 
	{
		System.out.println("In takeHit" +lifeCopy + " " +damage);
		if(lifeCopy != 0)
		{
			if(damage <= armorCopy ) 
			{
				temp = 0;
			}
			else
			{
				temp = damage - armorCopy;		
			}
		}
		//remainingLifePoints = currentLifePoints - temp;
		currentLifePoints = lifeCopy - temp;
		System.out.println(armorCopy+ " " +temp+ " " +currentLifePoints);
		return currentLifePoints;
	}
	
	//public int getRemainingLifePoints() {
		//return remainingLifePoints;
	//}
	
} 
