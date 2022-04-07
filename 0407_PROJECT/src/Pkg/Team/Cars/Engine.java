package Pkg.Team.Cars;

public abstract class Engine {

	//1.속성
	private String engineName;
	private double engineCap;
	
	//2.생성자
	public Engine() {
		
	}
	
	public Engine(String engineName, double engineCap) {
		this.engineName=engineName;
		this.engineCap=engineCap;
	}
	
	//3.메서드(행위)
	public abstract void explosion();
	
}
