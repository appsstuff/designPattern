package Decorator;

public abstract class KitchinDecorator implements Resturant {

	protected Resturant Ingredient;

	
	public KitchinDecorator(Resturant resturant) {
		
		this.Ingredient = resturant;
}
	
	@Override
	public double cost() {
		return Ingredient.cost();
	}

	@Override
	public String description() {
		return Ingredient.description();
	}
}
