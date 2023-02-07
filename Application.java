/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @author Andrew Ross-Sermons
 * @version 1.4
 * CS131; Lab #1
 * Spring 2023
 */
public class Application {

	/**
	 * main method for demonstrating lab code.
	 * @param args
	 */
	public static void main(String[] args) {
		//GameCharacter section
		System.out.println("\nInstantiating new NonPlayerCharacter object and calling the methods reportStructure, introduce, and exclaim.");
		NonPlayerCharacter npc = new NonPlayerCharacter();
		System.out.println(npc.reportStructure());
		System.out.println(npc.introduce());
		System.out.println(npc.exclaim());
		
		//SportsTeam section
		System.out.println("\nInsanstiating new BasketballTeam object and setting values.");
		BasketballTeam team = new BasketballTeam();
		//Calling setters for demonstration.
		team.setFieldGoals(3);
		team.setFieldGoalsAttempted(5);
		team.setFreeThrows(15);
		team.setFreeThrowsAttempted(19);
		team.setWins(4);
		team.setLosses(1);
		//Printing results.
		System.out.println("Calling getStats method.");
		System.out.printf("\nWin Percentage: %.0f%% \nField Goal Percentage: %.0f%% \nFree Throw Percentage: %.0f%%",
				(100*team.getStats()[0]), (100*team.getStats()[1]), (100*team.getStats()[2]));
	}//end main
}//end class