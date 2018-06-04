package environment;

import lifeform.LifeForm;

/**
*  Author: Chandana Gogineni  
* Contains a 2-D 2 x 3 array of cells that can holds LifeForms.
*
*/
public class Environment {
	private LifeForm entity;
	private Cell[][] cells;
	private int row;
	private int column;
	
	public Environment(int r, int c) 
	{
		row = r;
		column = c;
		cells = new Cell[row][column];
		for(int i = 0; i < row; i++)
			for(int j = 0; j < column; j++)
				cells[i][j] = new Cell();
	}
	/**
	 * Returns the locations of the cell
	 */
	public Cell getCell(int r, int c)
	{
		if(r < 0 || r > row - 1 || c < 0 || c > column - 1)
			return null;
		if(cells[r][c] == null)
			return null;
		return cells[r][c];
	}
	
	/**
	 * Returns the LifeForm at a specified cell[r][c]
	 */
	public LifeForm getLifeForm(int r, int c) {
		
		// TODO Auto-generated method stub
		if(r < 0 || r > row - 1 || c < 0 || c > column - 1)
			return null;
		if(cells[r][c] == null)
			return null;
		
		return cells[r][c].getLifeForm();
	}
	
	/**
	 * 
	 * Adds a LifeForm to the Cell[r][c]
	 * Will not add the LifeForm if the row and column 
	 * are invalid or if a LifeForm is already in
	 * that Cell. Returns true if successfully
	 * added, false otherwise.
	 */
	public boolean addLifeForm(int r, int c, LifeForm life) 
	{
		// TODO Auto-generated method stub
		if(r < 0 || r > row - 1 || c < 0 || c > column - 1)
			return false;
		
		if(cells[r][c].getLifeForm() != null)
			return false;
		
		cells[r][c].addLifeForm(life);
		return true;
				
	}
	
	/**
	 * Removes the LifeForm at theCells[r][c].
	 * Returns the LifeForm removed (null if no LifeForm in the Cell).
	 */
	public boolean removeLifeForm(int r, int c)
	{
		if(r < 0 || r > row - 1 || c < 0 || c > column - 1)
			return false;
		if(cells[r][c] == null)
			return false;
		/*if(getLifeForm(r, c) != null)//getLifeForm(r, c) != null
			return false;*/
		return cells[r][c].removeLifeForm();
	}
	
	

}
