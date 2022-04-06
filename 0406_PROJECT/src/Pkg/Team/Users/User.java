package Pkg.Team.Users;

import Pkg.Team.Cars.*;
public class User {

	//1.속성
	private Car myCar;
	public Car getMyCar() {
		return myCar;
	}

	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}

	public String getName() {
		return name;
	}

	private String name;
	
	
	
	//2.생성자
	public User() {
		
	}
	
	public User(String name) {
		this.name=name;
	}
	
	//3.메서드(행위)
	public void setCar(Car myCar) {
		this.myCar=myCar;
	}
	
}
