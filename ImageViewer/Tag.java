package a3;

/**
 * Class turns a string to a Tag 
 *
 * @author Shoaib Khan
 * 
 * @author Daniel Visca
 * 
 * @see A Tag
 */
public class Tag {
	
	String name;
	static StringBuffer names = new StringBuffer();
	static int count = 0;
	
	/**
	 * Turns a string into a Tag to be used for images
	 *
	 * @param name
	 *            the tag
	 * @see A Tag
	 */
	Tag (String name) {
		this.name = name;
		names.append(name);
		names.append("\n");
		count++;
	}
	/**
	 * Changes the String representation of thr name of the Tag
	 *            
	 * @param name   
	 * 				The new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Returns the Count of how many Tags have been added in total
	 *            
	 * @return count   
	 * 				Total CountS
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Sets the counter to the static Variable count
	 *            
	 * @param count
	 * 				current count
	 */
	public void setCount(int count) {
		Tag.count = count;
	}

	/**
	 * Returns String Buffer of Tag
	 *            
	 * @return the name   
	 * 				
	 */
	public static StringBuffer getNames() {
		return names;
	}
	
	/**
	 * return String Representation of Tag
	 *            
	 * @return name   
	 * 				The name
	 */
	@Override	
	public String toString() {
		return this.name;		
	}
	

}