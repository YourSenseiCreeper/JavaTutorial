package pl.gastherr.cw1_paradygmaty;

public class Vehicle {
	
	private String type;
	private int maxPassangers;
	
	public Vehicle(String type, int maxPassangers) {
		this.type = type;
		this.maxPassangers = maxPassangers;
	}
	
	public Vehicle(int maxPassangers) {
		this.type = "Pojazd";
		this.maxPassangers = maxPassangers;
	}
	
	public String getType() { return type; }
	public int getMaxPassangers() { return maxPassangers; }
}
