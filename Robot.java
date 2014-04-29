import java.util.ArrayList;

public abstract class Robot {
	//robots acting as factories
	
	private ArrayList<Liquid> liquids;
	
	public Robot(ArrayList<Liquid> liquids){
		this.liquids = liquids;
	}
	
	/*
	 * Uses the available liquids
	 * Postcondition: the amount of the available liquids has been reduced by the amount of the requested ones
	 */
	protected void useLiquids(MenuEntry m){
		ArrayList<Liquid> liquids1 = m.getLiquids();
		for(Liquid l1 : liquids1){
			for (Liquid l2 : liquids){
				if(l1.getName().equals(l2.getName())){
					l2.setAmount(l2.getAmount()-l1.getAmount());
				}
			}
		}
	}
	
	/*
	 * This method is implemented by the subclasses
	 * Postcondition: a new cocktail has been created
	 */
	public abstract Cocktail createCocktail(MenuEntry m);
}
