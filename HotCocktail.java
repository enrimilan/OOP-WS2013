import java.util.ArrayList;

public class HotCocktail extends Cocktail {
	
	private int temperature;
	
	public HotCocktail(String name, ArrayList<Liquid> l, int temperature) {
		super(name,l);
		this.temperature=temperature;
	}

	/*
	 * @return a string representation of a hot cocktail
	 */
	public String toString(){
		return String.format("%s, Temperature: %s \u00B0C", super.toString(), temperature);
	}
}
