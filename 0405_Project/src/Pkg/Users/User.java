package Pkg.Users;

import Pkg.Cars.*;
public class User {
	public String userName;
	public Car[] cars;
	private int carCount;
	public Car pickCar;
	
	//2.생성자
	public User() {
		this.cars=new Car[10];
		this.carCount=0;
	}
	
	public User(String userName) {
		this.cars=new Car[10];
		this.carCount=0;
		this.userName=userName;

	}
	
	//3.메서드(행위)
	public void buyCar(Car car) {
		cars[this.carCount]=car;
		this.carCount++;
	}
	
	public void showCarList() {
		for(int i=0; i<this.carCount; i++) {

			System.out.println(i+"번째 차량");

			cars[i].printCar();
			System.out.println("******************");

		}
	}
	
	//차량탑승
	public void pickCar(int selectedIndex) {
		if(pickCar==null) {
		if(selectedIndex<this.carCount) {
		pickCar=cars[selectedIndex];
		System.out.println(this.userName+"님이 "+pickCar.carName+"을 탑승하셨습니다.");
		}
		else {
			System.out.println("선택한차량이없습니다.");
		}
	}
		else {
			System.out.println("먼저 하차해주세요.");
		}
}
	
	//차에서 내린다.
	public void getOutCar() {
		System.out.println(pickCar.carName+"하차하셨습니다.");
		pickCar=null;
	}
}
