package recovery;
/**
 * A class that recovers a fraction of the currentLifePoints every time the alien is hurt
 * @author chandana gogineni
 *
 */
public class RecoveryFractional {
	double percentRecovery;
	public RecoveryFractional(double percent) {
		percentRecovery = percent;
	}
	/**
	 * Returns the newly updated value for currentLife after calculating recovery
	 */
	public int calculateRecovery(int currentLife, int maxLife) {
		int life = currentLife;
		currentLife += (currentLife*percentRecovery);
		/**
		 * Rounding up the fractional life points
		 */
		if(life % 10 != 0 && currentLife <= maxLife) {
			
			int temp = (currentLife % 10);
			currentLife += (10 - temp);
		}
		if(currentLife > maxLife) {
			currentLife = maxLife;
		}
		return currentLife;
	}
}
