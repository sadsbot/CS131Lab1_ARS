/**
* Class Description
*
* @author Andrew Ross-Sermons
* @version 0.1
* CS131; Lab #
* Spring 2023
*/

public class BasketballTeam extends SportsTeam{
	protected int fieldGoals, fieldGoalsAttempted, freeThrows, freeThrowsAttempted;
	
	public BasketballTeam() {
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end default constructor
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super(teamName, teamMascot, headCoach);
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end preferred constructor
	
	public double fieldGoalPercantage() {
		return(fieldGoals/fieldGoalsAttempted);
	}//end fieldGoalPercentage
	
	public double freeThrowPercentage() {
		return(freeThrows/freeThrowsAttempted);
	}//end freeThrowPercentage
}
