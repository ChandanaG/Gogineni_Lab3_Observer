import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Exceptions.MyNewException;
import GamePlay.TestSimpleTimer;
import GamePlay.TestSimpleTimerAsThread;
import environment.TestCell;
import environment.TestEnvironment;
import lifeform.TestAlien;
import lifeform.TestHuman;
import lifeform.TestLifeForm;
import recovery.TestRecoveryFractional;
import recovery.TestRecoveryLinear;
import recovery.TestRecoveryNone; 

/**
* Author: Chandana Gogineni 
* Runs all of the tests in this project
*
*/
@RunWith(Suite.class)
@Suite.SuiteClasses (
		{
			TestSimpleTimer.class,
			TestSimpleTimerAsThread.class,	
			TestHuman.class,
			TestLifeForm.class,
			TestAlien.class,
			TestCell.class,
			TestEnvironment.class,
			TestRecoveryNone.class,
			TestRecoveryLinear.class,
			TestRecoveryFractional.class,
			MyNewException.class
			
		})
public class AllGameTests {

}
