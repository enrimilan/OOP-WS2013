import java.util.ArrayList;

public class CocktailMenu {
	
	private static CocktailMenu firstInstance = null;
	private ArrayList<MenuEntry> entries;
	
	private CocktailMenu(){
		entries = new ArrayList<MenuEntry>();
	}
	
	/*
	 * Create a new CocktailMenu object only once.
	 */
	public static CocktailMenu getInstance(){
		
		if(firstInstance==null){
			firstInstance = new CocktailMenu();
		}
		
		return firstInstance;
	}
	
	/*
	 *Postcondition: an entry has been added to the end of the list
	 */
	public void addEntry(MenuEntry m){
		entries.add(m);
	}
	
	public MenuEntry chooseEntry(int id){
		return entries.get(id);
	}

	/*
	 * @return a string representation of the menu
	 */
	public String toString(){
		String out ="";
		for (MenuEntry m : this.entries) {
			out=out+m+"\n\n";
		}
		return "---COCKTAILS---" +"\n" + out.trim() + "\n";
	}
}