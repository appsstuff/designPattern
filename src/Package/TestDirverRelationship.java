package Package;

import java.util.ArrayList;
import java.util.List;

public class TestDirverRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car Car1 = new Car("Toyota", "Corrola","RED");
		Car Car2 = new Car("Merchedce", "LG800","Black");
		
		List<Car> carList = new ArrayList<>();
		carList.add(Car1);
		carList.add(Car2);
		Driver Ali = new Driver();
		Ali.getCarsInfo(carList);
		
		Car1.getEngine().StartEngien();
		Car1.getEngine().StopEngine();
		

	}

}
