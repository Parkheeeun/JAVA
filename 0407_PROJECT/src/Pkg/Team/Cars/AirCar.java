package Pkg.Team.Cars;

import Pkg.Commons.*;
public class AirCar extends Car implements IShotGun,IFly{

	private int bulletCnt;
	
	public AirCar() {
		super();
		this.bulletCnt=30;
		this.setEngine(new AirEngine());//엔진장착
		
	}
	
	public AirCar(String carName) {
		super(carName);
		this.bulletCnt=30;
		this.setEngine(new AirEngine());//엔진장착
	}
	
	@Override
	public void carRun() {
		(this.getEngine()).explosion();
		System.out.println("비행차가 달린다.");
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
		System.out.println(bulletCnt+"발이 추가되었습니다.");
	}
	@Override
	public void fly() {
		System.out.println("하늘높이날아라!!");
	}
	
}
