package environment;

import lifeform.LifeForm;

/**
* Author: Chandana Gogineni 
* A Cell that can hold a LifeForm.
*
*/
public class Cell {
	private LifeForm entity;
	
	/**
	 * Tries to add the LifeForm to the Cell. Will not add if a
	 * LifeForm is already present.
	 * @return true if the LifeForm was added to the Cell, false otherwise.
	 */
	public boolean addLifeForm(LifeForm life) 
	{
		// TODO Auto-generated method stub 
		
		if(entity != null)
			return false;
		
		entity = life;
		return true;

	}
	/**
	* @return the LifeForm in this Cell.
	*/
	public LifeForm getLifeForm()
	{		
		// TODO Auto-generated constructor stub
		return entity;
	}
	
	/**
	 * Tries to remove the LifeForm from the Cell. Checks if a
	 * LifeForm is already present and removes it.
	 * @return true if the LifeForm was removed from the Cell, false otherwise.
	 */
	public boolean removeLifeForm()
	{
		if(entity == null)
			return false;
		entity = null;
		return true;
	}
}
