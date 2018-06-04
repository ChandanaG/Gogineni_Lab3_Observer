package Exceptions;

import static org.junit.Assert.*;

import org.junit.Test;

import lifeform.Alien;
/**
 * Tests for Exception class when the recovery method is 
 * passed a negative value as an argument and an exception is thrown
 * @author chandana gogineni
 *
 */
public class MyNewException {
	/**
	 * Tests for the expected exception
	 * @throws Exception
	 */
	@Test(expected= Exception.class)
	public void myNewException() throws Exception  
	{
		    Alien a = new Alien("Bob", 40);
		    a.recover(-1);
	}

}
