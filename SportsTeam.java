/**
* Abstract class describing the base data and methods of a sports team.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Lab #1
* Spring 2023
*/

public abstract class SportsTeam {
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
	
	SportsTeam(String cTeamName, String cTeamMascot, String cHeadCoach){
		teamName = cTeamName;
		teamMascot = cTeamMascot;
		headCoach = cHeadCoach;
		wins = 0;
		losses = 0;
	}//end preferred constructor
	
	public double getWinPercentage() {
		return((double)wins/(wins+losses));
	}//end getWinPercentage
	
	public abstract double[] getStats();

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the teamMascot
	 */
	public String getTeamMascot() {
		return teamMascot;
	}

	/**
	 * @param teamMascot the teamMascot to set
	 */
	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}

	/**
	 * @return the headCoach
	 */
	public String getHeadCoach() {
		return headCoach;
	}

	/**
	 * @param headCoach the headCoach to set
	 */
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}

	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * @param wins the wins to set
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}

	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * @param losses the losses to set
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}
	
	
}
