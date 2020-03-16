package pl.gastherr;

/**
 * Class of Car, extends Vehicle
 * @author PIOTR
 * @version 1.0
 * @since 2020-0
 */
public class Car extends Vehicle {

	private String model;
	private String owner;
	
	public Car(int maxPassangers, String model, String owner) {
		super("Samochód", maxPassangers);
		this.model = model;
		this.owner = owner;
	}
	
	/**
	 * @return The model of Car
	 */
	public String getModel() { return model; }
	public String getOwner() { return owner; }
	public void setOwner(String newOwner) { owner = newOwner; }
}
