package lifeform;
/**
 * Mock class for implementing methods of Life Form class
 * @author chandana
 *
 */
public class MockLifeForm extends LifeForm{
	int temp;
	int temp2;
	int currentLifePoints;
	Human human;
/*	public void takeHit(int damage) 
	{
		int armorPoints = human.getArmorPoints();
			//if(damage < armorPoints ) 
			//{
			//	temp = 0;
			//}
			//else 
				if(damage > armorPoints)
			{
				temp = damage - armorPoints;
			}
		
	}*/
	
	public int Attack(int attackStr) {
		
		//human.takeHit(attackStr);
		//System.out.println("In Attack" + human.takeHit(attackStr));
		temp = human.takeHit(attackStr);
		System.out.println(temp);
		
		return temp;
	}
	
	public MockLifeForm(String name, int points) {
		super(name, points);
		human = new Human("Bob", 40, 10);
		//points =;
		//System.out.println(points);
		//currentLifePoints = points;
		//System.out.println(points);
		 
	}
	
	public int getCurrentLifePoints() {
		return currentLifePoints;
	}

	
}
