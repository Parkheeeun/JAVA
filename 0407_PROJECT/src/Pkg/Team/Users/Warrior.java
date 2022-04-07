package Pkg.Team.Users;

import Pkg.Team.Cars.*;
import Pkg.Commons.*;
public class Warrior extends User {
	
	private Car myCar;
	private IFly myFly; //날것, --IFly를 상속받은 추상회되어있지않는클래스
	private boolean isRideCar;
	private boolean isRideFly;
	
	public Car getMyCar() {
		return myCar;
	}
	
	//2.생성자
		public Warrior() {
			super();
			this.isRideCar=false;
			this.isRideFly=false;
		}
		
		public Warrior(String userName, int userAge) {
			super(userName, userAge);
		}
		
		
	
		//3.메서드(행위)
		@Override
		public void greeting() {
			System.out.println("전사가 인사를한다.");
		}
		
		public void attack() {
			System.out.println("전사가 공격을 한다.");
		}
		
		public void rideCar(Car car) {
			if(isRideCar==false && isRideFly==false) {
			this.myCar=car;
			isRideCar=true;
			}
		}
		
		public void getOutCar() {
			if(isRideCar==true) {
				isRideCar=false;
			}
		}
		
		public void rideFlying(IFly myFly) {
			if(isRideCar==false && isRideFly==false) {
			this.myFly=myFly;
			isRideFly=true;
			}
		}
		
		public void getOutFly() {
			if(isRideFly==true) {
				isRideFly=false;
			}
		}
}
