package Pkg.Cars;

import Pkg.Tires.*;

public class Car {
	//1.속성
	public String carBrand;
	public String carName;
	public int nowSpeed;
	
	public Tire tire;
	
	//2.생성자
	public Car() {
		this.nowSpeed=0;
	}
	
	public Car(String carBrand, String carName) {
		this.carBrand=carBrand;
		this.carName=carName;
		this.nowSpeed=0;
	}
	
	//3.메서드(행위)
	
	public void carRun() {
		this.nowSpeed+=10;
		System.out.println(this.carName+"가"+this.nowSpeed+"속도로 달립니다.");
	}
	
	
	public void setTire(Tire tire) { //타이어를 가져야함
		this.tire=tire;
		System.out.println("타이어를 교체했어요.");
	}
	
	public void printCar() {
		System.out.println("********************");
		System.out.println("자동차브랜드:"+this.carBrand);
		System.out.println("자동차이름:"+this.carName);
		System.out.println("타이어이름:"+this.tire.tireName);
		

		
	}
}
