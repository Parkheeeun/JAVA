package Pkg.Team.Cars;

public abstract class Car {

	private String carName;
	private Engine engine;
	
	public String getCarName() {
		return "당신의 자동차이름은:"+carName;
	}
	
	protected Engine getEngine() {
		return this.engine;
	}
	
	protected void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	
	
	public Car() {
		
	}
	
	public Car(String carName) {
		this.carName=carName;
	}
	
	public abstract void carRun();
	
}
