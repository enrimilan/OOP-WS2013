import java.util.ArrayList;

public class ColdCocktail extends Cocktail {

	private double crushedIce;
	
	public ColdCocktail(String name, ArrayList<Liquid> l, double crushedIce) {
		super(name,l);
		this.crushedIce = crushedIce;
	}
	
	/*
	 * @return a string representation of a cold cocktail
	 */
	public String toString(){
		return String.format("%s, Crushed ice: %s gr", super.toString(), crushedIce);
	}
}
