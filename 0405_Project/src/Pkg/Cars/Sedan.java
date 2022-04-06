package Pkg.Cars;

import Pkg.Tires.*;

public class Sedan extends Car{
	public int tireCount; //타이어개수
	
	
	//2.생성자
	public Sedan() {
		super();
	}
	public Sedan(String carBrand, String carName) {
		super(carBrand, carName);
	}
	public Sedan(String carBrand, String carName, int tireCount) {
		super(carBrand, carName);
		this.tireCount=tireCount;
	}
	
	//3.메서드(행위)
	//부모클래스의 메서드를 상속받지만 재정의를 해야된다.
	@Override //재정의 --annotation
	public void carRun() {
		this.nowSpeed+=50;
		System.out.println("세단:"+this.nowSpeed+"KM속도로 "+this.carName+"가 달립니다.");
	}
	
	@Override
	public void setTire(Tire tire) { 
		//small타이어만 가능하다.
		if(tire instanceof SmallTire) {
			System.out.println("타이어를 정상적으로 교체했습니다.");
			this.tire=tire;
			((SmallTire)tire).checkProperty(); //downcasting
		}
		else {
			System.out.println("교체안됨");
		}
	}
}
