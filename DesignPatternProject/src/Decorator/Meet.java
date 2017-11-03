package Decorator;

public class Meet extends KitchinDecorator {


	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return Ingredient.cost()+ 10.00 ;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return Ingredient.description() + " with Meet "	;
	}

	public Meet(Resturant resturant) {
		super(resturant);
	}
}
