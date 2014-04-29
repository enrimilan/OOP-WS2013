import java.util.ArrayList;

public class MenuEntry {
	
	private String name;
	private ArrayList<Liquid> liquids;
	private boolean hot;
	private boolean cold;
	
	/*
	 * Precondition: hot and cold must not be both true 
	 */
	public MenuEntry(String name, boolean hot, boolean cold) {
		this.name = name;
		this.liquids = new ArrayList<Liquid>();;
		this.hot = hot;
		this.cold = cold;
	}
	
	/*
	 * Postcondition: liquid has been added to the end of the list
	 */
	public void addLiquid(Liquid l){
		liquids.add(l);
	}
	
	/*
	 * @return the name of the cocktail 
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * @return the list of the liquids
	 */
	public ArrayList<Liquid> getLiquids() {
		return liquids;
	}

	/*
	 * @return true if the cocktail is hot
	 */
	public boolean isHot() {
		return hot;
	}
	
	/*
	 * @return true if the cocktail is cold
	 */
	public boolean isCold() {
		return cold;
	}

	/*
	 * @return a string representation of an entry
	 */
	public String toString(){
		String out ="";
		for (Liquid l : this.liquids) {
			out += l+" ";
		}
		return String.format("%s%n%s- %s", name, out, hot ? "served hot" : (cold ? "served cold" : "normal"));
	}

}
