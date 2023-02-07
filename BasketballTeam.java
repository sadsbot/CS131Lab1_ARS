/**
* Stores information describing a basketball team and
* provides statistics based on that information.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Lab #1
* Spring 2023
*/

public class BasketballTeam extends SportsTeam{
	private int fieldGoals, fieldGoalsAttempted, freeThrows, freeThrowsAttempted;
	
	/**
	 * Default constructor.
	 */
	public BasketballTeam() {
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end default constructor
	
	/**
	 * Preferred constructor.
	 * @param teamName
	 * @param teamMascot
	 * @param headCoach
	 */
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super(teamName, teamMascot, headCoach);
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end preferred constructor
	
	/**
	 * Calculates the team's field goal success rate.
	 * @return the fieldGoalPercentage
	 */
	public double fieldGoalPercentage() {
		return((double)fieldGoals/fieldGoalsAttempted);
	}//end fieldGoalPercentage
	
	/**
	 * Calculates the team's free throw success rate.
	 * @return the freeThrowPercentage
	 */
	public double freeThrowPercentage() {
		return((double)freeThrows/freeThrowsAttempted);
	}//end freeThrowPercentage
	
	/**
	 * Instantiates and returns an array of doubles of each relevant statistic.
	 * @return the array of doubles of each statistic.
	 */
	public double[] getStats(){
		return(new double[]{super.getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()});
	}//end getStats

	/**
	 * @return the fieldGoals
	 */
	public int getFieldGoals() {
		return fieldGoals;
	}//end getFieldGoals

	/**
	 * @param fieldGoals the fieldGoals to set
	 */
	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}//end setFieldGoals

	/**
	 * @return the fieldGoalsAttempted
	 */
	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}//end getFieldGoalsAttempted

	/**
	 * @param fieldGoalsAttempted the fieldGoalsAttempted to set
	 */
	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}//end setFieldGoalsAttempted

	/**
	 * @return the freeThrows
	 */
	public int getFreeThrows() {
		return freeThrows;
	}//end getFreeThrows

	/**
	 * @param freeThrows the freeThrows to set
	 */
	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}//end setFreeThrows

	/**
	 * @return the freeThrowsAttempted
	 */
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}//end getFreeThrowsAttempted

	/**
	 * @param freeThrowsAttempted the freeThrowsAttempted to set
	 */
	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}//end setFreeThrowsAttempted
	
}
