package environment;
import static org.junit.Assert.*;

import org.junit.Test;

import lifeform.LifeForm;
import lifeform.MockLifeForm;

/**
*  Author: Chandana Gogineni 
* The test cases for the Environment class
*
*/
public class TestEnvironment {
	
	/**
	* At initialization, the Cell should be empty and not contain a
	* LifeForm.
	*/
	
	@Test
	public void testInitialiaztion() {
		Environment env = new Environment(1, 1);
		
		assertNull(env.getCell(0, 0).getLifeForm());		
	}
	
	/**
	* Checks to see if we change the LifeForm held by the Cell that
	* getLifeForm properly responds to this change.
	*/

	@Test
	public void testSetEnvironment() {
		Environment env = new Environment(2, 3);
		LifeForm bob = new MockLifeForm("bob", 40);
		//To add LifeForm at the cell[1][2] if it's not empty
		env.addLifeForm(1, 2, bob);
		assertEquals(bob, env.getLifeForm(1, 2));
		//Removes LifeForm at the cell[1][2] unless it's already empty
		env.removeLifeForm(1, 2);
		assertNull(env.getLifeForm(1, 2));
		//Asserts if the given indices are invalid for a cell
		boolean success = env.addLifeForm(4, 5, bob);
		assertFalse(success);
		success = env.removeLifeForm(4, 5);
		assertFalse(success);
	}

}
