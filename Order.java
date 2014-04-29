import java.util.HashMap;
import java.util.Iterator;

public class Order {
	HashMap<MenuEntry, Integer> positions;
	
	public Order(){
		this.positions = new HashMap<MenuEntry, Integer>();
	}
	
	/*
	 * Postcondition: an order with its quantity (i.e position) has been added to the HashMap
	 */
	public void order(MenuEntry order, int quantity ){
		positions.put(order, quantity);
	}
	
	/*
	 * @return the positions
	 */
	public HashMap<MenuEntry, Integer> getPositions() {
		return positions;
	}

	/*
	 * prints the list of the positions
	 */
	public void list(){
	    Iterator it = positions.entrySet().iterator();
	    System.out.println("---ORDERS---");
	    for (MenuEntry key : positions.keySet()) {
	    	System.out.println(positions.get(key) + "x " + key.getName());
	    }
	}
}
