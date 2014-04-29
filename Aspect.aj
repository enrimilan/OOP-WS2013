public aspect Aspect {
	
	private int dynamicObjects = 0;
	
	pointcut dynamicObject() :
		call(Cocktail Robot.createCocktail(MenuEntry));
	after() : dynamicObject(){
		dynamicObjects++;
	}
	
	pointcut content() :
		call(void Salver.content());
	after() : content(){
		System.out.printf("%nNumber of dynamic created objects: %s%n", dynamicObjects);
	}
}
