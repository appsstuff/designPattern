package Decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientB {

	private static int choice;
	private static Resturant res = new Rest();

	public static void main(String[] args) throws NumberFormatException, IOException {
		Resturant clintB;

		System.out.print("============ Food Menu ============ 				\n");
		System.out.print("            1. Reserve a Table.   				\n");
		System.out.print("            2. Vegetarian Food.				\n");
		System.out.print("            3. Fruit Food.        			 	\n");
		System.out.print("            4. Meet Food                       		\n");
		System.out.print("            5. Exit                        		\n");

		StringBuilder stb = new StringBuilder();
		double cost=0.00;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		OUTER: do {
			
			System.out.print("Enter item choice: ");
			br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			clintB = ResturantFactory(choice);
			if (clintB==null)break OUTER;
			stb.append(clintB.description());
			cost+= clintB.cost();
		} while (choice != 5);
		System.out.println("Items : " + stb.toString());
		System.out.println("The Cost:" + cost);

	}

	private static Resturant ResturantFactory(int check) {

		switch (check) {
		case 1:
			return new Table();
		case 2:
			return new Vegetabiles(res);
		case 3:
			return new Fruit(res);
		case 4:
			return new Meet(res);
		default:
			return null;
		}

	}
}
