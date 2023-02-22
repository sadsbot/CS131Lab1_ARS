import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Andrew Ross-Sermons
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	protected boolean active;
	protected String intelligenceType;
	
	/**
	 * Default empty constructor.
	 */
	public NonPlayerCharacter() {
		super();
		setActive(false);
		setIntelligenceType("AVERAGE");
	}//end NonPlayerCharacter
	
	/**
	 * Preferred constructor. Accepts four parameters.
	 * @param id
	 * @param personality
	 * @param intelligenceType
	 * @param active
	 */
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super (id, personality);
		setIntelligenceType(intelligenceType);
		setActive(active);
	}//end NonPlayerCharacter
	
	/**
	 * Returns the structure of the object in a specially
	 * formatted representation. This is the preferred
	 * method for printing out the object structure.
	 * @return
	 */
	public String reportStructure(){
		StringBuilder sb = new StringBuilder(super.reportStructure());
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}//end reportStructure
	
	/**
	 * Returns a generic introduction.
	 * @return String
	 */
	public String introduce() {
		return("Hello, my name is " + uniqueID);
	}//end introduce
	
	/**
	 * Uses a SecureRandom object to return a random exclamation.
	 * @return
	 */
	public String exclaim() {
		String[] exclamations = new String[]{"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		SecureRandom rand = new SecureRandom();
		return exclamations[rand.nextInt(5)];
	}//end exclaim

	/**
	 * Getter for boolean active.
	 * @return active
	 */
	public boolean isActive() {
		return(active);
	}//end getActive
	
	/**
	 * Setter for boolean active.
	 * @param isActive
	 */
	public void setActive(boolean isActive) {
		active = isActive;
	}//end setActive
	
	/**
	 * Getter for String intelligenceType.
	 * @return intelligenceType
	 */
	public String getIntelligenceType() {
		return(intelligenceType);
	}//end getIntelligenceType
	
	/**
	 * Setter for String intelligenceType
	 * @param iType
	 */
	public void setIntelligenceType(String iType) {
		intelligenceType = iType;
	}//end setIntelligenceType
}//end Class NonPlayerCharacter