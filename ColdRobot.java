import java.util.ArrayList;

public class ColdRobot extends Robot {
	
	private double crushedIce;
	
	public ColdRobot(ArrayList<Liquid> liquids, double crushedIce) {
		super(liquids);
		this.crushedIce=crushedIce;
	}
	
	/*
	 * @return a new cold cocktail
	 * Postcondition: all the necessary liquids and the crushed ice have been used (i.e their amounts have been reduced)
	 */
	public Cocktail createCocktail(MenuEntry m) {
		useLiquids(m);
		useCrushedIce(120.0);
		return new ColdCocktail(m.getName(),m.getLiquids(),120.0);
	}
	
	/*
	 * Uses the available crushed ice
	 * Postcondition: the amount of the available crushed ice has been reduced by the amount of the requested one
	 */
	public void useCrushedIce(double crushedIce){
		this.crushedIce=this.crushedIce-crushedIce;
	}
}