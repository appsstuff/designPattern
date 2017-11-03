package Decorator;

public class Fruit extends KitchinDecorator {

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return Ingredient.cost()+ 3.50 ;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return Ingredient.description() + " Fruits "	;
	}

	public Fruit(Resturant resturant) {
		super(resturant);
	}
}
