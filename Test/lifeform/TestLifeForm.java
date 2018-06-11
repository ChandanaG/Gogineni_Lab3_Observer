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
	 * 
	 * Start section for Observer patter
	 * @param argc
	 */
	@Test
	public void testForObserverPattern() 
	{
		entity = new MockLifeForm("Bob", 40);
		/**
		 * Test for the attackStrength set as a passed argument 
		 */
		entity.setAttackStrength(7);
		assertEquals(7, entity.getAttackStrength());
		/**
		 * Test for default strength of Human
		 */
		Human h = new Human("Bob", 40, 10);
		assertEquals(5, h.getAttackStrength());
		/**
		 * Test for default strength of Alien
		 */
		Alien a = new Alien("Bob", 40);
		assertEquals(10, a.getAttackStrength());
		
	}
	
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
	
	public static void main(String[] argc)
	{
		TestLifeForm tlf = new TestLifeForm();
		tlf.testInitialization();
	}
}
