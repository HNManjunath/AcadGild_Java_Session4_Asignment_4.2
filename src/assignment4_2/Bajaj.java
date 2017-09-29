package assignment4_2;

//Class "Honda" "is a" (relation) specific type of Bike which is extended the same
public class Bajaj extends Bike{

// The below methods uses the "Engine" Class methods which exhibits "has a" (relation) 
public void bikeStartTest(String bikeName) {
	Engine bajajEngine = new Engine();
	bajajEngine.startEngine(bikeName);
}

public void bikeStopTest(String bikeName) {
	Engine bajajEngine = new Engine();
	bajajEngine.stopEngine(bikeName);
}
}