import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CocktailBar {
	
	private static CocktailBar firstInstance = null;
	private Robot r1;
	private Robot r2;
	private Robot r3;
	
	private CocktailBar(ArrayList<Liquid> liquids, int temperature, double crushedIce){
		r1 = new NormalRobot(liquids);
		r2 = new HotRobot(liquids, temperature);
		r3 = new ColdRobot(liquids, crushedIce);
	}
	
	/*
	 * Create a new CocktailBar object only once.
	 */
	public static CocktailBar getInstance(ArrayList<Liquid> liquids, int temperature, double crushedIce){
		
		if(firstInstance==null){
			firstInstance = new CocktailBar(liquids,temperature,crushedIce);
		}
		
		return firstInstance;
	}
	
	/*
	 * Executes all the orders
	 * Postcondition: the salver containing all the created cocktails has been created
	 */
	public Salver executeOrders(HashMap<MenuEntry, Integer> positions){
		Salver salver = new Salver();
		Iterator it = positions.entrySet().iterator();
		 for (MenuEntry key : positions.keySet()) {
		    	for(int i=positions.get(key);i>0;i--){
		    		if(key.isHot()){
		    			salver.addCocktail(r2.createCocktail(key));
		    		}
		    		else if(key.isCold()){
		    			salver.addCocktail(r3.createCocktail(key));
		    		}
		    		else{
		    			salver.addCocktail(r1.createCocktail(key));
		    		}
		    	}
		    }
		return salver;
	}
}