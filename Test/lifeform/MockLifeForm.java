package lifeform;
/**
 * Mock class for implementing methods of Life Form class
 * @author chandana gogineni
 *
 */
public class MockLifeForm extends LifeForm{
	int temp;
	int temp2;
	int currentLifePoints;
	Human human;
	/**
	 * The attack method attacks a lifeform, then the life form's 
	 * takeHit() method is called which will then calculate the 
	 * current life points based on the recovery rate
	 */
	public int Attack(int attackStr) {
		
		temp = human.takeHit(attackStr);
		System.out.println(temp);
		
		return temp;
	}
	/**
	 * Constructor for MockLifeForm class
	 * @param name
	 * @param points
	 */
	public MockLifeForm(String name, int points) {
		super(name, points);
		human = new Human("Bob", 40, 10);
		
	}
	/**
	 * Returns current life points
	 */
	public int getCurrentLifePoints() {
		return currentLifePoints;
	}

	
}
