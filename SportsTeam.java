/**
* Abstract class describing the base data and methods of a sports team.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Lab #1
* Spring 2023
*/

abstract class SportsTeam {
	private String teamName, teamMascot, headCoach;
	private int wins, losses;
	
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
	/**
	 * Preferred Constructor.
	 * @param cTeamName
	 * @param cTeamMascot
	 * @param cHeadCoach
	 */
	SportsTeam(String cTeamName, String cTeamMascot, String cHeadCoach){
		teamName = cTeamName;
		teamMascot = cTeamMascot;
		headCoach = cHeadCoach;
		wins = 0;
		losses = 0;
	}//end preferred constructor
	
	/**
	 * @return the winPercentage
	 */
	public double getWinPercentage() {
		return((double)wins/(wins+losses));
	}//end getWinPercentage
	
	public abstract double[] getStats();

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}//end getTeamName

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}//end setTeamName

	/**
	 * @return the teamMascot
	 */
	public String getTeamMascot() {
		return teamMascot;
	}//end getTeamMascot

	/**
	 * @param teamMascot the teamMascot to set
	 */
	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}//end setTeamMascot

	/**
	 * @return the headCoach
	 */
	public String getHeadCoach() {
		return headCoach;
	}//end getHeadCoach

	/**
	 * @param headCoach the headCoach to set
	 */
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}//end setHeadCoach

	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}//end getWins

	/**
	 * @param wins the wins to set
	 */
	public void setWins(int wins) {
		if(wins < 0) this.wins = 0;
		else this.wins = wins;
	}//end setWins

	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}//end getLosses

	/**
	 * @param losses the losses to set
	 */
	public void setLosses(int losses) {
		if(losses < 0) this.losses = 0;
		else this.losses = losses;
	}//end setLosses
}//end class SportsTeam
