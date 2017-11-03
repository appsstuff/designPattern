package Decorator;

public class Juice extends KitchinDecorator {

	

	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return Ingredient.cost()+ 2.00 ;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return Ingredient.description() + " Juice  "	;
	}
	public Juice(Resturant resturant) {
		super(resturant);
	}
}
