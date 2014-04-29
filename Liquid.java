public class Liquid {
	
	private String name;
	private int amount;
	
	public Liquid(String name, int amount){
		this.name=name;
		this.amount=amount;
	}
	
	/*
	 * @return the alcoholic content
	 */
	public double getAlcoholicContent(){
		return 0.0;
	}
	/*
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * @return the amount in ml
	 */
	public int getAmount() {
		return amount;
	}
	
	/*
	 * Postcondition: the amount in ml has been set
	 */
	public void setAmount(int amount) {
		this.amount=amount;
	}
	
	/*
	 * @return a string representation of a liquid
	 */
	public String toString(){
		return name + "("+amount+" ml) ";
	}
}