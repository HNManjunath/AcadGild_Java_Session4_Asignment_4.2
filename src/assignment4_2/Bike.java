package assignment4_2;

public class Bike {
	//	Class Variables
	private String bikeName;
	private String cc;
	private int topSpeed;
	
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	// Method to print the info entered to the Bike object
	public void bikeData(){
		System.out.println("Bike		: " + bikeName);
		System.out.println("CC		: " + cc);
		System.out.println("Top Speed 	: " + topSpeed);
	}
}