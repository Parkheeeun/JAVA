package Pkg.Team.Cars;

import Pkg.Commons.*;
public class Tank extends Car implements IShotGun{

	//1.속성
	private int bulletCnt;

	
	//2.생성자
	public Tank() {
		super();
		this.bulletCnt=10;
		this.setEngine(new SpecialEngine());
	}
	
	public Tank(String carName) {
		super(carName);
		this.bulletCnt=10;
		this.setEngine(new SpecialEngine());

	}
	
	
	//3.메서드(행위)
	@Override
	public void carRun() {
		(this.getEngine()).explosion();
		System.out.println("탱크가 달린다.");
	}
	
	@Override
	public void shotGun() {
		if(this.bulletCnt>0) {
		this.bulletCnt--;
		System.out.println("대포발사");
		System.out.println(this.bulletCnt+"발이 남아있습니다.");
		}
		else
		System.out.println("대포알이 없습니다.");
	}
	
	@Override
	public void setBullet(int bulletCnt) {
		this.bulletCnt+=bulletCnt;
	}
	
	
	
}
