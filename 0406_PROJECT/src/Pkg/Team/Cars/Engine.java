package Pkg.Team.Cars;

public abstract class Engine {
	
	private double engineCapacity;
	private String engineName;
	
	public Engine() {
		
	}
	
	public Engine(double engineCapacity, String engineName) {
		this.engineCapacity=engineCapacity;
		this.engineName=engineName;
	}
	
	public abstract void explosion();
}
