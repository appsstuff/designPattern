package singleton;

public class DatabaseConnection {
	// Create object to create first instance
	private static final DatabaseConnection currentInstance = new DatabaseConnection();
	private static int intanceCount=1;
	
	
	// change Class constractor to private to prevent create new object 
	private DatabaseConnection() {};
	
	// create single point to create object or check if found
	public static DatabaseConnection getInstance() {
		intanceCount++;
		if (currentInstance==null) {
			System.out.println("First Intance");
		return new DatabaseConnection();
		}else {
			System.out.println("Intance: " + intanceCount );
		return currentInstance;
		}}
		
	public int getIntanceCount()
	{return intanceCount;}
		
	

}
