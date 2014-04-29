import java.util.ArrayList;

public class Salver {

	private ArrayList<Cocktail>	cocktails;
	
	public Salver() {
		this.cocktails = new ArrayList<Cocktail>();
	}
	
	/*
	 *Postcondition: cocktail has been added to the end of the list
	 */
	public void addCocktail(Cocktail c) {
		this.cocktails.add(c);
	}
	
	/*
	 * prints the content of the salver
	 */
	public void content() {
		System.out.println("---CONTENT OF THE SALVER---");
		for (Cocktail c : this.cocktails) {
			System.out.printf("%s%n%n",c);
		}
	}
}
