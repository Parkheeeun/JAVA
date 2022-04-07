package Pkg_1;

/*
 	접근제한자 public, protected, default, private
 
 
 */

public class Car {
	private String carName;
	public Engine engine;
	
	
	
	public Car(String carName) {
		this.carName=carName;
	
	}
	
	public void printName() {
		System.out.println(this.carName);
	}
	
	protected void setEngine(Engine engine) {
		this.engine=engine;
	}
}
