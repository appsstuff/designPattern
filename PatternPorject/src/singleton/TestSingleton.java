package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseConnection conn = DatabaseConnection.getInstance();
		DatabaseConnection conn2 = DatabaseConnection.getInstance();
		DatabaseConnection conn3 = DatabaseConnection.getInstance();
		

	}

}
