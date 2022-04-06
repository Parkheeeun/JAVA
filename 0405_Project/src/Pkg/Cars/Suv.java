package Pkg.Cars;

import Pkg.Tires.*;
public class Suv extends Car {

	//2.생성자
	public Suv() {
		super();
	}
	
	public Suv(String carBrand, String carName) {
		super(carBrand, carName);
	}
	
	
	//3.메서드(행위)
	//carrun메서드는 상속받아서 그대로 사용
	
	@Override
	public void setTire(Tire tire) {
		//big타이어만 가능하다.
		if(tire instanceof BigTire) {
			System.out.println("타이어를 정상적으로 교체했습니다.");
			this.tire=tire;
		}
		else {
			System.out.println("타이어교체실패");
		}
	}
}
