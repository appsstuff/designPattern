package Decorator;

public class ClientA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resturant RestA =   new Vegetabiles(new Meet(new Juice(new Fruit(new Table()))));
		
		System.out.println(RestA.description() + " cost= " + RestA.cost());
	}

}
