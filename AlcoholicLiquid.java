public class AlcoholicLiquid extends Liquid {
	
	private double content;
	
	public AlcoholicLiquid(String name, int amount, double content) {
		super(name, amount);
		this.content = content;
	}
	
	/*
	 * @return the alcoholic content
	 */
	public double getAlcoholicContent(){
		return content;
	}

	/*
	 * @return a string representation of an alcoholic liquid
	 */
	public String toString(){
		return super.getName() + "("+super.getAmount()+" ml, "+content*100+" %) ";
	}
}