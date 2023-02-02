/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @author Andrew Ross-Sermons
 * @version 1.4
 * Lab1 
 * CS131ON
 */
public class Application {

	/**
	 * main method for game character and npc application.
	 * @param args
	 */
	public static void main(String[] args) {
		NonPlayerCharacter npc = new NonPlayerCharacter();
		System.out.println(npc.reportStructure());
		System.out.println(npc.introduce());
		System.out.println(npc.exclaim());
	}//end main
	
}//end class