import java.util.ArrayList;
import java.util.Arrays;

public abstract class Cocktail {
	
	private String name;
	private int amount;
	private double content;
	private String[] liquids; 
	
	public Cocktail(String name, ArrayList<Liquid> l){
		this.liquids = new String[l.size()];
		this.name=name;
		for(int i=0; i<liquids.length; i++){
			this.amount = this.amount + l.get(i).getAmount();
			this.liquids[i]=l.get(i).getName();
			this.content = this.content + l.get(i).getAmount()*l.get(i).getAlcoholicContent();
		}
		this.content=this.content/amount;
	}


	/*
	 * @return a string representation of a normal cocktail
	 */
	public String toString(){
		return String.format("%s (%s ml)%nIngredients: %s, Alcoholic Content: %f%%", name, amount, Arrays.toString(liquids), content*100);
	}
}
