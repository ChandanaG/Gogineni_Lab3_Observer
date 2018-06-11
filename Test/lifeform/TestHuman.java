package lifeform;

import static org.junit.Assert.*;


import org.junit.Test;
/**
 * Tests for Human class
 * @author chandana gogineni
 *
 */
public class TestHuman 
{
	MockLifeForm entity;
	Human human; 
	
	/**
	 * Start section for Observer pattern
	 */
	@Test
	public void testUsingObserver() 
	{
		entity = new MockLifeForm("Bob", 40);
		human = new Human("Bob", 40, 10);
		assertEquals(5, human.getAttackStrength());		
		
		/**
		 * when damage < armor
		 */
		entity.setAttackStrength(10);
		entity.Attack(entity.getAttackStrength());
		assertEquals(40, entity.Attack(entity.getAttackStrength()));
		/**
		 * when damage > armor
		 */
		entity.setAttackStrength(11);
		entity.Attack(entity.getAttackStrength());
		assertEquals(39, entity.Attack(entity.getAttackStrength()));
		/**
		 * when lifeform is dead
		 */
		human = new Human("Bob", 0, 10);
		assertEquals(0, human.getCurrentLifePoints());
	}
	
	/**
	 * Start section for Strategy pattern
	 */
	@Test
	public void testInitialization() 
	{
		
		human = new Human("Bob", 40, 10);
		assertEquals("Bob", human.getName());
		assertEquals(40, human.getCurrentLifePoints());
		human.setArmorPoints(-1);
		assertEquals(0, human.getArmorPoints());
		
	}

}
