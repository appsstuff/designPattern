package Decorator;

public class Vegetabiles extends KitchinDecorator {


	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()+ 1.50 ;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return super.description() + "some Vegetables ";
	}

	public Vegetabiles(Resturant resturant) {
		super(resturant);
	}
}
