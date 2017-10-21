package Package;

import java.util.List;
import java.util.*;

public class Car extends Vehicle {

	private String model;
	private String type;
	private String color;
	

	private String Model;
	private Engine engine = new Engine();


	@Override
	public String toString() {
		return "Car [model=" + model + ", type=" + type + ", color=" + color + "]";
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public Car(String model, String type, String color) {
		super();
		this.model = model;
		this.type = type;
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car(GasStation fillGas) {
		throw new UnsupportedOperationException();
	}

	public void getPassangersInformation(List<Passenger> PassangerInfoo) {
		throw new UnsupportedOperationException();
	}

	public void getPassangersInformation(Passenger PassangerInfoo) {
		throw new UnsupportedOperationException();
	}
}
