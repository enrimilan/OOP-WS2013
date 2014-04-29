import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		//create a cocktail menu first
		
		CocktailMenu menu = CocktailMenu.getInstance();
		
		MenuEntry e1 = new MenuEntry("Gimlet",false, false);
		e1.addLiquid(new AlcoholicLiquid("Gin",50,0.40));
		e1.addLiquid(new Liquid("Roses Lime Cordial",20));
		menu.addEntry(e1);
		
		MenuEntry e2 = new MenuEntry("Cuba Libre", false, true);
		e2.addLiquid(new AlcoholicLiquid("Rum",50,0.35));
		e2.addLiquid(new Liquid("Lime juice",15));
		e2.addLiquid(new Liquid("Coca Cola",15));
		menu.addEntry(e2);
		
		MenuEntry e3 = new MenuEntry("Moscow Mule", false, true);
		e3.addLiquid(new AlcoholicLiquid("Vodka",50,0.40));
		e3.addLiquid(new AlcoholicLiquid("Beer",10,0.04));
		e3.addLiquid(new Liquid("Lime juice",25));
		menu.addEntry(e3);
		
		MenuEntry e4 = new MenuEntry("Hot Toddy", true, false);
		e4.addLiquid(new AlcoholicLiquid("Vodka",60,0.50));
		e4.addLiquid(new Liquid("Lime juice",15));
		e4.addLiquid(new Liquid("Sugar syrup",15));
		menu.addEntry(e4);
		
		MenuEntry e5 = new MenuEntry("Bishop", true, false);
		e5.addLiquid(new AlcoholicLiquid("Warre's Otima",75,0.20));
		e5.addLiquid(new Liquid("Orange juice",30));
		e5.addLiquid(new Liquid("Water",90));
		menu.addEntry(e5);
		
		MenuEntry e6 = new MenuEntry("Apple cider", true, false);
		e6.addLiquid(new Liquid("Maple Syrup",5));
		e6.addLiquid(new Liquid("Vinegar",30));
		e6.addLiquid(new Liquid("Water",100));
		menu.addEntry(e6);
		
		MenuEntry e7 = new MenuEntry("Virgin Pina Colada", false, true);
		e7.addLiquid(new Liquid("Pineapple juice",15));
		e7.addLiquid(new Liquid("Milk",20));
		menu.addEntry(e7);
		
		MenuEntry e8 = new MenuEntry("Cinderella", false, true);
		e8.addLiquid(new Liquid("Pineapple juice",10));
		e8.addLiquid(new Liquid("Orange juice",80));
		e8.addLiquid(new Liquid("Grenadine",10));
		menu.addEntry(e8);
		
		//the cocktail menu
		System.out.println(menu);
		
		//choose and order some cocktails
		Order order = new Order();
		order.order(menu.chooseEntry(0), 1);
		order.order(menu.chooseEntry(2), 2);
		order.order(menu.chooseEntry(4), 3);
		order.order(menu.chooseEntry(7), 1);
		
		//the orders
		order.list();
		System.out.println("");		
		
		ArrayList<Liquid> liquids = new ArrayList<Liquid>(20);
		
		//the 20 available liquids for the cocktail bar
		liquids.add(new AlcoholicLiquid("Gin",500,0.40));
		liquids.add(new Liquid("Roses Lime Cordial",200));
		liquids.add(new AlcoholicLiquid("Rum",500,0.35));
		liquids.add(new Liquid("Lime juice",150));
		liquids.add(new Liquid("Coca Cola",150));
		liquids.add(new AlcoholicLiquid("Vodka",500,0.40));
		liquids.add(new AlcoholicLiquid("Beer",100,0.04));
		liquids.add(new Liquid("Sugar syrup",150));
		liquids.add(new AlcoholicLiquid("Warre's Otima",750,0.20));
		liquids.add(new Liquid("Orange juice",300));
		liquids.add(new Liquid("Water",900));
		liquids.add(new Liquid("Maple Syrup",50));
		liquids.add(new Liquid("Vinegar",300));
		liquids.add(new Liquid("Pineapple juice",150));
		liquids.add(new Liquid("Milk",200));
		liquids.add(new Liquid("Grenadine",100));
		liquids.add(new AlcoholicLiquid("Wine",750,0.13));
		liquids.add(new AlcoholicLiquid("Rakia",350,0.60));
		liquids.add(new AlcoholicLiquid("Absinthe",250,0.70));
		liquids.add(new AlcoholicLiquid("Liquor",500,0.10));
		
		//create a cocktail bar
		CocktailBar bar = CocktailBar.getInstance(liquids,60,3000);
		
		//execute these orders
		Salver s = bar.executeOrders(order.getPositions());
		
		//the content of the salver
		s.content();	
	}
}