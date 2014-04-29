import java.util.ArrayList;

public class HotRobot extends Robot {
	
	private int temperature;
	
	public HotRobot(ArrayList<Liquid> liquids, int temperature) {
		super(liquids);
		this.temperature=temperature;
	}

	/*
	 * @return a new hot cocktail
	 * Postcondition: all the necessary liquids have been used (i.e their amounts have been reduced)
	 */
	public Cocktail createCocktail(MenuEntry m) {
		useLiquids(m);
		return new HotCocktail(m.getName(),m.getLiquids(), temperature);
	}
}
