package Pkg.Cars;
import Pkg.Tires.*;
public class Tank extends Car{

	//2.생성자
	public Tank() {
		super();
	}
	
	public Tank(String carBrand, String carName) {
		super(carBrand, carName);
	}
	
	//3.메서드(행위)
	@Override
	public void carRun() {
		this.nowSpeed+=4;
		System.out.println(this.carName+"가"+this.nowSpeed+"속도로 달립니다.");
		
	}
	
	@Override
	public void setTire(Tire tire) {
		//특수타이어
		if(tire instanceof SpecialTire) {
			System.out.println("타이어를 정상적으로 교체했습니다.");
			this.tire=tire;
		}
		else {
			System.out.println("교체불가");
		}
	}
	//대포를 쏜다.
	public void shotGun() {
		System.out.println("대포를 쏜다.");
	}
	
	
	
	
}
