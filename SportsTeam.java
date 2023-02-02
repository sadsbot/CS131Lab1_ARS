/**
* Class Description
*
* @author Andrew Ross-Sermons
* @version 0.1
* CS131; Lab #
* Spring 2023
*/

public abstract class SportsTeam {
	String teamName, teamMascot, headCoach;
	int wins, losses;
	
	/**
	 * Default constructor.
	 */
	SportsTeam(){
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	}//end default constructor
	
	SportsTeam(String cTeamName, String cTeamMascot, String cHeadCoach){
		teamName = cTeamName;
		teamMascot = cTeamMascot;
		headCoach = cHeadCoach;
		wins = 0;
		losses = 0;
	}//end preferred constructor
	
	public double getWinPercentage() {
		return(wins/(wins+losses));
	}//end getWinPercentage
	
	public abstract double[] getStats();
}
