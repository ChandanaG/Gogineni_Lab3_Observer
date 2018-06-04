package lifeform;
import static org.junit.Assert.*;


import org.junit.Test;

/**
* Author: Chandana Gogineni 
* Tests the functionality provided by the LifeForm class
*
*/

public class TestLifeForm {
	/**
	* Start section for Strategy pattern 
	* When a LifeForm is created, it should know its name and how
	* many life points it has.
	*/
	LifeForm entity;
	
	@Test
	public void testInitialization() 
	{	
		entity = new MockLifeForm("Bob", 40);
		assertEquals("Bob", entity.getName());
		assertEquals(40, entity.getCurrentLifePoints());	
		
	}
	
	/**
	 * 
	 * Start section for Observer patter
	 * @param argc
	 */
	@Test
	public void testForObserverPattern() 
	{
		entity = new MockLifeForm("Bob", 40);
		entity.setAttackStrength(7);
		assertEquals(7, entity.getAttackStrength());

		Human h = new Human("Bob", 40, 10);
		assertEquals(5, h.getAttackStrength());
		
		Alien a = new Alien("Bob", 40);
		assertEquals(10, a.getAttackStrength());
		
	}
	
	
	public static void main(String[] argc)
	{
		TestLifeForm tlf = new TestLifeForm();
		tlf.testInitialization();
	}
}
