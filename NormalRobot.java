import java.util.ArrayList;

public class NormalRobot extends Robot {

	public NormalRobot(ArrayList<Liquid> liquids){
		super(liquids);
	}
	
	/*
	 * @return a new simple cocktail
	 * Postcondition: all the necessary liquids have been used (i.e their amounts have been reduced)
	 */
	public Cocktail createCocktail(MenuEntry m) {
		useLiquids(m);
		return new NormalCocktail(m.getName(),m.getLiquids());
	}

}
